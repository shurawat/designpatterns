package designpatterns.creational.factory;

public abstract class Car {

	private CarType model = null;
	
	public abstract void construct();
	
	public Car(CarType model) {
		this.model = model;
		process();
	}

	private void process() {
		System.err.println("creating car of type -" + this.model);
	}

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
	
	
	
}
