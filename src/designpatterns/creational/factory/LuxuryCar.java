package designpatterns.creational.factory;

public class LuxuryCar extends Car{


	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	@Override
	public void construct() {
		System.err.println("construct call for sedan class");
	}

}
