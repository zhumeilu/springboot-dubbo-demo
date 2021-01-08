package com.lmhd.common.util.key;

import java.math.BigInteger;
import java.util.Calendar;

public class IdGenerator {

	private final long twepoch            = 1483240253257L;
	private final int  serviceIdBits      = 41;
	private final long maxserviceId       = -1L ^ (-1L << serviceIdBits);
	private final int  sequenceBits       = 12;
	private final int  serviceIdShift     = sequenceBits;
	private final int  timestampLeftShift = sequenceBits + serviceIdBits;
	private final long sequenceMask       = -1L ^ (-1L << sequenceBits);
	private long serviceId;
	private long sequence      = 0L;
	private long lastTimestamp = -1L;
	private static IdGenerator instance;
	//==============================Constructors=====================================

	public static IdGenerator get() {
		if (instance == null) {
			instance = new IdGenerator();
		}
		return instance;
	}

	private IdGenerator() {
		long nowInMillis = System.currentTimeMillis();
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.YEAR, 2018);
		c1.set(Calendar.MONTH, Calendar.MAY);
		c1.set(Calendar.DAY_OF_MONTH, 1);
		c1.set(Calendar.HOUR_OF_DAY, 0);
		c1.set(Calendar.MINUTE, 0);
		c1.set(Calendar.SECOND, 0);
		c1.set(Calendar.MILLISECOND, 0);
		c1.getTimeInMillis();
		long time51InMillis = c1.getTimeInMillis();
		this.serviceId = nowInMillis - time51InMillis;
	}
	// ==============================Methods==========================================

	/**
	 * 获得下一个ID (该方法是线程安全的)
	 *
	 * @return SnowflakeId
	 */
	private synchronized String nextId() {
		long timestamp = timeGen();
		//如果当前时间小于上一次ID生成的时间戳，说明系统时钟回退过这个时候应当抛出异常
		if (timestamp < lastTimestamp) {
			throw new RuntimeException(
					String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
		}
		//如果是同一时间生成的，则进行毫秒内序列
		if (lastTimestamp == timestamp) {
			sequence = (sequence + 1) & sequenceMask;
			//毫秒内序列溢出
			if (sequence == 0) {
				//阻塞到下一个毫秒,获得新的时间戳
				timestamp = tilNextMillis(lastTimestamp);
			}
		}
		//时间戳改变，毫秒内序列重置
		else {
			sequence = 0L;
		}
		//上次生成ID的时间截
		lastTimestamp = timestamp;
		BigInteger bigInteger = BigInteger.valueOf(timestamp - twepoch);
		bigInteger = bigInteger.shiftLeft(timestampLeftShift);
		BigInteger bigInteger1 = BigInteger.valueOf(serviceId);
		bigInteger1 = bigInteger1.shiftLeft(serviceIdShift);
		BigInteger bigInteger2 = BigInteger.valueOf(sequence);
		BigInteger bigInteger3 = bigInteger.or(bigInteger1).or(bigInteger2);
		return bigInteger3.toString(16);
	}

	/**
	 * 阻塞到下一个毫秒，直到获得新的时间戳
	 *
	 * @param lastTimestamp 上次生成ID的时间截
	 * @return 当前时间戳
	 */
	private long tilNextMillis(long lastTimestamp) {
		long timestamp = timeGen();
		while (timestamp <= lastTimestamp) {
			timestamp = timeGen();
		}
		return timestamp;
	}

	/**
	 * 返回以毫秒为单位的当前时间
	 *
	 * @return 当前时间(毫秒)
	 */
	private long timeGen() {
		return SystemClock.now();
	}

	public static String generateStrId(String prefix) {
		final IdGenerator idGen = IdGenerator.get();
		return prefix + idGen.nextId();
	}

	/**
	 * 测试
	 */
	public static void main(String[] args) {
		final IdGenerator idGen = IdGenerator.get();
		for (int k = 0; k < 10; k++) {
			System.out.println(idGen.nextId());
		}
		long avg = 0;
		/*for (int k = 0; k < 1; k++) {
			List<Callable<String>> partitions = new ArrayList<Callable<String>>();
			final IdGenerator idGen = IdGenerator.get();
			for (int i = 0; i < 140000; i++) {
				partitions.add(new Callable<String>() {

					@Override
					public String call() throws Exception {
						String s = idGen.nextId();
						System.out.println(s);
						return s;
					}
				});
			}
			ExecutorService executorPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
			try {
				long s = System.currentTimeMillis();
				List<Future<String>> futures = executorPool.invokeAll(partitions, 10000, TimeUnit.SECONDS);
				long s_avg = System.currentTimeMillis() - s;
				avg += s_avg;
				System.out.println("完成时间需要: " + s_avg / 1.0e3 + "秒");
				System.out.print("第" + k + "次，排重前数量" + futures.size());
				Set<String> hasRepeat = Collections.synchronizedSet(new HashSet<>());
				futures.parallelStream().forEach(e -> {
					try {
						hasRepeat.add(e.get());
					} catch (Exception ex) {
						System.out.println("get时出现异常了");
					}
				});
				System.out.println("排重后数量" + hasRepeat.size() + "重复数量：" + (futures.size() - hasRepeat.size()));
				executorPool.shutdown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("平均完成时间需要: " + avg / 10 / 1.0e3 + "秒");*/
	}
}
