package workshop4.business.concretes;

import workshop4.business.abstracts.CarService;
import workshop4.core.logger.abstracts.Logger;
import workshop4.dataAccess.abstracts.CarDao;
import workshop4.entitites.concretes.Car;

public class CarManager implements CarService {

	private CarDao carDao;
	private Logger Logger;
	
	public CarManager() {
		super();
	}

	public CarManager(CarDao carDao, Logger Logger) {
		super();
		this.carDao = carDao;
		this.Logger = Logger;
	}

	@Override
	public void add(Car car) {
		carDao.add(car);
		Logger.add(car); 
		
	}

	@Override
	public void delete(Car car) {
		carDao.delete(car);
		Logger.delete(car);
		
	}

	@Override
	public void update(Car car) {
		carDao.update(car);
		Logger.update(car);
	}
}
