package workshop4.dataAccess.concretes.Oracleimpls;

import workshop4.dataAccess.abstracts.CarDao;
import workshop4.entitites.concretes.Car;

public class OracleDao implements CarDao{
	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Oracle'a eklendi.");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Oracle'dan silindi.");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Oracle'da güncellendi.");
	}

}
