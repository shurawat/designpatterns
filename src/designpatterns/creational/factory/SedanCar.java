package designpatterns.creational.factory;

public class SedanCar extends Car{


	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	public void construct() {
		System.err.println("construct call for sedan class");
	}

}
