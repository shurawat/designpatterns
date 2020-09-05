package designpatterns.creational.abstractfactory;

public class SedanCar extends Car{


	public SedanCar(Location location) {
		super(CarType.SEDAN, location);
		construct();
	}

	@Override
	public void construct() {
		System.err.println("construct call for sedan class");
	}

}
