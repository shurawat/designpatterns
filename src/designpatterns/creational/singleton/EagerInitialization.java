package designpatterns.creational.singleton;

public final class EagerInitialization {
	

	private static EagerInitialization instance = new EagerInitialization();
	
	private EagerInitialization() {
	}
	
	public static EagerInitialization getInstance() {
		return instance;
	}
	
}
