package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.IFlightDao;
import entity.Flight;
import service.prototype.IFlightService;

@Service
public class FlightServiceDaoImpl implements IFlightService{
	
	@Autowired
	private IFlightDao flightDao;

	@Override
	public List<Flight> listFlight(int pageNo, int pageSize) {
		return flightDao.find((pageNo-1)*pageSize, pageSize);
	}

}
