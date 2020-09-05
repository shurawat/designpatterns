package designpatterns.creational.singleton;

public final class LazyInitialization {
	
	private static volatile LazyInitialization instance = null;
	
	private LazyInitialization() {
	}

	public static LazyInitialization getInstance() {
		if (instance == null) {
			synchronized (LazyInitialization.class) {
				instance = new LazyInitialization();
			}
		}
		return instance;
	}
	
}
