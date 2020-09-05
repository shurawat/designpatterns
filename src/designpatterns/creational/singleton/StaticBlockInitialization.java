package designpatterns.creational.singleton;

public class StaticBlockInitialization {
	
	private static StaticBlockInitialization instance = null;
	
	static {
		instance = new StaticBlockInitialization();
	}
	
	private StaticBlockInitialization() {
	}
	
	public static StaticBlockInitialization getInstance() {
		return instance;
	}

}
