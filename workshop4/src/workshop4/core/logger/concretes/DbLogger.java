package workshop4.core.logger.concretes;

import workshop4.core.logger.abstracts.Logger;
import workshop4.entitites.concretes.Car;

public class DbLogger implements Logger{
	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Db'ye loglandý.");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Db'den silindi.");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Db'de güncellendi.");
	}

}
