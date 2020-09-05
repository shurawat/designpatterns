package designpatterns.creational.abstractfactory;

public abstract class Car {

	private CarType model = null;
	
	private Location location = null;
	
	public abstract void construct();
	
	public Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
		process();
	}

	private void process() {
		System.err.println("creating car of type -" + this.model + "in location" + this.location);
	}

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
	
	
}
