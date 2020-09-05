package designpatterns.creational.singleton;

public final class DoubleCheckLazyInitialization {

	/*Please be sure to use “volatile” keyword with instance variable 
	otherwise you can run into an out of order write error scenario, 
	where reference of an instance is returned before actually the object is constructed 
	i.e. JVM has only allocated the memory and constructor code is still not executed. 
	In this case, your other thread,
	which refers to the uninitialized object may throw null pointer exception and can even crash the whole application.*/
	private static volatile DoubleCheckLazyInitialization instance = null;
	
	private DoubleCheckLazyInitialization() {
	}

	public static DoubleCheckLazyInitialization getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckLazyInitialization.class) {
				if(instance == null) {
					instance = new DoubleCheckLazyInitialization();
				}
			}
		}
		return instance;
	}
	
}
