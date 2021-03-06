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
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] {name}, new OfferMapper());
	}
	
	public List<Offer> getOffers() {
		
		String sqlStatement = "select * from offers";
		return jdbcTemplateObject.query(sqlStatement, new OfferMapper());
	}
	
	public boolean insert(Offer offer) {
		
		String name = offer.getName();
		String email = offer.getEmail();
		String text = offer.getText();
		
		String sqlStatement ="insert into offers(name, email, text) values (?, ?, ?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[] {name, email, text})==1);
	}
	
	public boolean update(Offer offer) {
		
		int id = offer.getId();
		String name = offer.getName();
		String email = offer.getEmail();
		String text = offer.getText();
		
		String sqlStatement ="update offers set name=?, email=?, text=? where id=?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[] {name, email, text, id})==1);
	}
	
	public boolean delete(int id) {
		
		String sqlStatement = "delete from offers where id=?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[] {id})==1);
	}
}
