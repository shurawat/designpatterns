package designpatterns.creational.factory;

public class SmallCar extends Car{


	public SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	@Override
	public void construct() {
		System.err.println("construct call for small class");
	}

}
