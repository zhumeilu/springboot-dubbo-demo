package com.lmhd.common.base;

import com.github.pagehelper.PageHelper;
import com.lmhd.common.annotation.MasterDB;
import com.lmhd.common.annotation.SlaveDB;
import com.lmhd.common.util.SpringContextUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * 实现BaseService抽象类
 * Created by LMHD.TECGROUP on 2017/01/07.
 */
public abstract class BaseServiceImpl<Mapper, Record, Example> implements BaseService<Record,Example> {

	protected static final Logger log = LoggerFactory.getLogger(BaseServiceImpl.class);
	public                 Mapper mapper;

	@Override
	@SlaveDB
	public int countByExample(Example example) {
		try {
			Method countByExample = getMapperClass().getDeclaredMethod("countByExample", example.getClass());
			Object result = countByExample.invoke(mapper, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	@MasterDB
	public int deleteByExample(Example example) {
		try {
			Method deleteByExample = getMapperClass().getDeclaredMethod("deleteByExample", example.getClass());
			Object result = deleteByExample.invoke(mapper, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	@MasterDB
	public int deleteByPrimaryKey(Integer id) {
		try {
			Method deleteByPrimaryKey = getMapperClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
			Object result = deleteByPrimaryKey.invoke(mapper, id);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	@MasterDB
	public int insert(Record record) {
		try {
			Method insert = getMapperClass().getDeclaredMethod("insert", record.getClass());
			Object result = insert.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	@MasterDB
	public int insertSelective(Record record) {
		try {
			Method insertSelective = getMapperClass().getDeclaredMethod("insertSelective", record.getClass());
			Object result = insertSelective.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	@SlaveDB
	public List<Record> selectByExampleWithBLOBs(Example example) {
		try {
			Method selectByExampleWithBLOBs = getMapperClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
			Object result = selectByExampleWithBLOBs.invoke(mapper, example);
			return (List<Record>) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@SlaveDB
	public List<Record> selectByExample(Example example) {
		try {
			Method selectByExample = getMapperClass().getDeclaredMethod("selectByExample", example.getClass());
			Object result = selectByExample.invoke(mapper, example);
			return (List<Record>) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@SlaveDB
	public List<Record> selectByExampleWithBLOBsForStartPage(Example example, Integer pageNum, Integer pageSize) {
		try {
			Method selectByExampleWithBLOBs = getMapperClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
			PageHelper.startPage(pageNum, pageSize, false);
			Object result = selectByExampleWithBLOBs.invoke(mapper, example);
			return (List<Record>) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@SlaveDB
	public List<Record> selectByExampleForStartPage(Example example, Integer pageNum, Integer pageSize) {
		try {
			Method selectByExample = getMapperClass().getDeclaredMethod("selectByExample", example.getClass());
			PageHelper.startPage(pageNum, pageSize, false);
			Object result = selectByExample.invoke(mapper, example);
			return (List<Record>) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@SlaveDB
	public List<Record> selectByExampleWithBLOBsForOffsetPage(Example example, Integer offset, Integer limit) {
		try {
			Method selectByExampleWithBLOBs = getMapperClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
			PageHelper.offsetPage(offset, limit, false);
			Object result = selectByExampleWithBLOBs.invoke(mapper, example);
			return (List<Record>) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@SlaveDB
	public List<Record> selectByExampleForOffsetPage(Example example, Integer offset, Integer limit) {
		try {
			Method selectByExample = getMapperClass().getDeclaredMethod("selectByExample", example.getClass());
			PageHelper.offsetPage(offset, limit, false);
			Object result = selectByExample.invoke(mapper, example);
			return (List<Record>) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@SlaveDB
	public Record selectFirstByExample(Example example) {
		try {
			Method selectByExample = getMapperClass().getDeclaredMethod("selectByExample", example.getClass());
			List<Record> result = (List<Record>) selectByExample.invoke(mapper, example);
			if (null != result && result.size() > 0) {
				return result.get(0);
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@SlaveDB
	public Record selectFirstByExampleWithBLOBs(Example example) {
		try {
			Method selectByExampleWithBLOBs = getMapperClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
			List<Record> result = (List<Record>) selectByExampleWithBLOBs.invoke(mapper, example);
			if (null != result && result.size() > 0) {
				return result.get(0);
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@SlaveDB
	public Record selectByPrimaryKey(Integer id) {
		try {
			Method selectByPrimaryKey = getMapperClass().getDeclaredMethod("selectByPrimaryKey", id.getClass());
			Object result = selectByPrimaryKey.invoke(mapper, id);
			return (Record) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@MasterDB
	public int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example) {
		try {
			Method updateByExampleSelective = getMapperClass().getDeclaredMethod("updateByExampleSelective", record.getClass(), example.getClass());
			Object result = updateByExampleSelective.invoke(mapper, record, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	@MasterDB
	public int updateByExampleWithBLOBs(@Param("record") Record record, @Param("example") Example example) {
		try {
			Method updateByExampleWithBLOBs = getMapperClass().getDeclaredMethod("updateByExampleWithBLOBs", record.getClass(), example.getClass());
			Object result = updateByExampleWithBLOBs.invoke(mapper, record, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	@MasterDB
	public int updateByExample(@Param("record") Record record, @Param("example") Example example) {
		try {
			Method updateByExample = getMapperClass().getDeclaredMethod("updateByExample", record.getClass(), example.getClass());
			Object result = updateByExample.invoke(mapper, record, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	@MasterDB
	public int updateByPrimaryKeySelective(Record record) {
		try {
			Method updateByPrimaryKeySelective = getMapperClass().getDeclaredMethod("updateByPrimaryKeySelective", record.getClass());
			Object result = updateByPrimaryKeySelective.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	@MasterDB
	public int updateByPrimaryKeyWithBLOBs(Record record) {
		try {
			Method updateByPrimaryKeyWithBLOBs = getMapperClass().getDeclaredMethod("updateByPrimaryKeyWithBLOBs", record.getClass());
			Object result = updateByPrimaryKeyWithBLOBs.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	@MasterDB
	public int updateByPrimaryKey(Record record) {
		try {
			Method updateByPrimaryKey = getMapperClass().getDeclaredMethod("updateByPrimaryKey", record.getClass());
			Object result = updateByPrimaryKey.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	@MasterDB
	public int deleteByPrimaryKeys(String ids) {
		try {
			if (StringUtils.isBlank(ids)) {
				return 0;
			}
			String[] idArray = ids.split("-");
			int count = 0;
			for (String idStr : idArray) {
				if (StringUtils.isBlank(idStr)) {
					continue;
				}
				Integer id = Integer.parseInt(idStr);
				Method deleteByPrimaryKey = getMapperClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
				Object result = deleteByPrimaryKey.invoke(mapper, id);
				count += Integer.parseInt(String.valueOf(result));
			}
			return count;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public void initMapper() {
		this.mapper = SpringContextUtil.getBean(getMapperClass());
	}

	/**
	 * 获取类泛型class
	 *
	 * @return
	 */
	public Class<Mapper> getMapperClass() {
		return (Class<Mapper>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
}