package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.IFlightDao;
import entity.Flight;

@Repository
public class FlightDaoImpl implements IFlightDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Flight> find(int offset, int pageSize) {
		return jdbcTemplate.query("select * from flight limit ?,?",
				new Object[] {offset,pageSize},
				new BeanPropertyRowMapper<Flight>(Flight.class));
	}
}
