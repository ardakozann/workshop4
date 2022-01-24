package workshop4.core.logger.concretes;

import workshop4.core.logger.abstracts.Logger;
import workshop4.entitites.concretes.Car;

public class FileLogger implements Logger{
	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Dosyaya loglandý.");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Dosyadan silindi");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Dosyada güncellendi.");
	}

}
