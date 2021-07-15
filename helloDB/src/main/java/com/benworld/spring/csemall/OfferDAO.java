package com.benworld.spring.csemall;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("offerDAO") // beans.xml에서 <bean> 설정 불필요 
public class OfferDAO {
	
	private JdbcTemplate jdbcTemplateObject;
	private DataSource dataSource;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public int getRowCount() {
		String sqlStatement = "select count(*) from offers";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
}
