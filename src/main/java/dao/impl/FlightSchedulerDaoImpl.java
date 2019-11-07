package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.IFlightSchedulerDao;
import entity.FlightScheduler;

@Repository
public class FlightSchedulerDaoImpl implements IFlightSchedulerDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<FlightScheduler> find(int offset, int pageSize){
		return jdbcTemplate.query("SELECT * FROM flight_scheduler limit ?,?", 
				new Object[] {offset,pageSize},
				new BeanPropertyRowMapper<FlightScheduler>(FlightScheduler.class));
		
	}
}
