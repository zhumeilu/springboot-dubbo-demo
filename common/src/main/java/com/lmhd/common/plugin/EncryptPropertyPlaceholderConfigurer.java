package com.lmhd.common.plugin;

import com.lmhd.common.enums.EncryptField;
import com.lmhd.common.util.CoreCodecUtils;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import static com.lmhd.common.enums.EncryptField.*;

/**
 * 支持加密配置文件插件
 * Created by LMHD.TECGROUP on 2017/2/4.
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	/**遍历properties文件用AES解密对应加密内容*/
	private EncryptField[] propertyNames = { M_JDBC_PASS, S_JDBC_PASS, G_JDBC_PASS };

	/**
	 * 解密指定propertyName的加密属性值
	 *
	 * @param propertyName
	 * @param propertyValue
	 * @return
	 */
	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		for (EncryptField p : propertyNames) {
			if (p.equals(get(propertyName))) {
				return CoreCodecUtils.AESDecode(propertyValue, CoreCodecUtils.AES_DEFAULT_SEED);
			}
		}
		return super.convertProperty(propertyName, propertyValue);
	}
}
