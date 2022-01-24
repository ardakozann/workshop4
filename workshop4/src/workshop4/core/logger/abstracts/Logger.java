package workshop4.core.logger.abstracts;

import workshop4.entitites.concretes.Car;

public interface Logger {
	void add(Car car);
	void delete(Car car);
	void update(Car car);
}
