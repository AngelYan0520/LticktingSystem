package dao.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import dao.prototype.IFlightDao;
import entity.Flight;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class FlightDaoTest {
	@Autowired
	private IFlightDao flightDao;
	
	@Test
	public void find() {
		List<Flight> pager =(List<Flight>)flightDao.find(1, 10);
		
		System.out.println(pager);
	}
}