package com.lmhd.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class IdUtils {

    /**
     * 生成订单ID:业务字符+日期+随机数
     * @param prefixStr
     * @return
     */
    public static String createOrderId(String prefixStr) {
        String now = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {// 有可能是负数
            hashCodeV = -hashCodeV;
        }
        return prefixStr + now + hashCodeV;
    }

    /**
     *
     * @param prefixStr
     * @return
     */
    public static String createOrderIdShort(String prefixStr) {
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {// 有可能是负数
            hashCodeV = -hashCodeV;
        }
        return prefixStr + hashCodeV;
    }

}
