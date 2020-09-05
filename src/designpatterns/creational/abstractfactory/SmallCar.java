package designpatterns.creational.abstractfactory;

public class SmallCar extends Car{


	public SmallCar(Location location) {
		super(CarType.SMALL, location);
		construct();
	}

	@Override
	public void construct() {
		System.err.println("construct call for small class");
	}

}
