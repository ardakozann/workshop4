package workshop4.dataAccess.concretes.MsSqlimpls;

import workshop4.dataAccess.abstracts.CarDao;
import workshop4.entitites.concretes.Car;

public class MsSqlDao implements CarDao {
	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		System.out.println("MsSql'e eklendi.");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		System.out.println("MsSql'den silindi.");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		System.out.println("MsSql'de güncellendi.");
	}

}
