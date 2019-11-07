package dao.prototype;

import java.util.List;

import entity.Flight;

/**
 * FilghtDao
 * @author windows
 *
 */
public interface IFlightDao {
	List<Flight> find(int offset,int pageSize);
}
