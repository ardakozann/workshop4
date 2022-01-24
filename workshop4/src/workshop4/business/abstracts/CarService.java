package workshop4.business.abstracts;

import workshop4.entitites.concretes.Car;

public interface CarService {
	void add(Car car);
	void delete(Car car);
	void update(Car car);
}
