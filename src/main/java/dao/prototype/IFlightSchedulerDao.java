package dao.prototype;

import java.util.List;

import entity.FlightScheduler;

public interface IFlightSchedulerDao {
	List<FlightScheduler> find(int offset,int pageSize);
}
