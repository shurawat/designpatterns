package designpatterns.structural.proxy;

public class Proxy4Real extends RealObjectImpl {
	
	public void doSomething() {
		System.err.println("proxy");
		super.doSomething();
	}

}
