package workshop4.dataAccess.abstracts;

import workshop4.entitites.concretes.Car;

public interface CarDao {
	void add(Car car);
	void delete(Car car);
	void update(Car car);
}
