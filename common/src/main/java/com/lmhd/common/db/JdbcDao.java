package com.lmhd.common.db;

import com.lmhd.common.db.dsmanage.DBManager;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

/**
 * 功能：
 * Charles on 2017/12/4.
 */
public class JdbcDao extends JdbcTemplate {

	@Override
	protected <T> RowMapper<T> getSingleColumnRowMapper(Class<T> requiredType) {
		if (requiredType.getName().startsWith("java.lang")) {
			return super.getSingleColumnRowMapper(requiredType);
		}
		return new BeanPropertyRowMapper<T>(requiredType);
	}

	public JdbcDao switchNewDbSource(String dataSourcePre) {
		DataSource ds = DBManager.getInstance().getDataSource(dataSourcePre).getDataSource();
		if (ds != null) {
			this.setDataSource(ds);
		}
		return this;
	}
}
