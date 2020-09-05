package designpatterns.creational.abstractfactory;

public class CarFactory {
	
	public static Car buildCar(CarType model) {
		Car car = null;
		model = model == null?CarType.NULL:model;
		Location location = Location.ASIA;
		
		switch (location) {
		case ASIA:
			car = ASIACarFactory.buildCar(model);
			break;
		case USA:
			car = USACarFactory.buildCar(model);
			break;
		case DEFAULT:
			car = DEFAULTCarFactory.buildCar(model);
		}
		return car;
	}

}
