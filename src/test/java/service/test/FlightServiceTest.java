package service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import entity.Flight;
import service.prototype.IFlightService;
import util.Pager;

/**
 * 用户业务单元测试
 * @author windows
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class FlightServiceTest {
	@Autowired
	private IFlightService flightService;
	
	@Test
	public void find() {
		Pager<Flight> pager = (Pager<Flight>)flightService.listFlight(1, 10);
		for (Flight flight : pager.getData()) {
			System.out.println(flight);
		}System.out.println(pager.getTotal());
	}
}
