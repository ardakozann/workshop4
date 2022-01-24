package workshop4;

import workshop4.business.concretes.CarManager;
import workshop4.core.logger.concretes.FileLogger;
import workshop4.dataAccess.concretes.MsSqlimpls.MsSqlDao;
import workshop4.dataAccess.concretes.Oracleimpls.OracleDao;
import workshop4.entitites.concretes.Brand;
import workshop4.entitites.concretes.Car;
import workshop4.entitites.concretes.Color;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car(1,"AA",new Brand(1,"Mercedes"),new Color(1,"Siyah"));
		CarManager carManager = new CarManager(new MsSqlDao(),new FileLogger());
		carManager.add(car);
		carManager.update(car);
		carManager.delete(car);
	}

}
