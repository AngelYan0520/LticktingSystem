package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.IFlightSchedulerDao;
import entity.FlightScheduler;
import service.prototype.IFlightSchedulerService;

@Service
public class FlightSchedulerServiceDaoImpl implements IFlightSchedulerService{

	@Autowired
	private IFlightSchedulerDao flightSchedulerDao;

	@Override
	public List<FlightScheduler> listFlightSchedulers(int pageNo, int pageSize) {
		return flightSchedulerDao.find((pageNo-1)*pageSize, pageSize);
	}
	
	
}
