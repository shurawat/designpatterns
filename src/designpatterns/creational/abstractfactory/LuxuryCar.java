package designpatterns.creational.abstractfactory;

public class LuxuryCar extends Car{


	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	public void construct() {
		System.err.println("construct call for sedan class");
	}

}
