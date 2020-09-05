package designpatterns.creational.abstractfactory;

public class USACarFactory {
	
	private final static Location location = Location.USA;
	
	public static Car buildCar(CarType model) {
		Car car = null;
		model = model == null?CarType.NULL:model;
		switch (model) {
		case SMALL:
			car = new SmallCar(location);
			break;
		case LUXURY:
			car = new LuxuryCar(location);
			break;
		case SEDAN:
			car = new SedanCar(location);
			break;
		default:
			break;
		}
		return car;
	}

}
