package designpatterns.creational.abstractfactory;

public class FactoryExcutor {
	
	public static void main(String[] args) {
		System.err.println(CarFactory.buildCar(CarType.SMALL));
		System.err.println(CarFactory.buildCar(CarType.SEDAN));
		System.err.println(CarFactory.buildCar(CarType.LUXURY));
		System.err.println(CarFactory.buildCar(null));
	}

}
