package com.benworld.spring.csemall;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	
	public Offer getOffer(String name) {
		String sqlStatement = "select * from offers where name=?";
		
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] {name}, 
				new RowMapper<Offer>() { //anonymous class
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						
						Offer offer = new Offer();
						offer.setId(rs.getInt("id"));
						offer.setName(rs.getString("name"));
						offer.setEmail(rs.getString("email"));
						offer.setText(rs.getString("text"));
						
						return offer;
					}
		});
	}
	
	public List<Offer> getOffers() {
		String sqlStatement = "select * from offers";
		
		return jdbcTemplateObject.query(sqlStatement, 
				new RowMapper<Offer>() { //anonymous class
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						
						Offer offer = new Offer();
						offer.setId(rs.getInt("id"));
						offer.setName(rs.getString("name"));
						offer.setEmail(rs.getString("email"));
						offer.setText(rs.getString("text"));
						
						return offer;
					}
		});
	}
}
