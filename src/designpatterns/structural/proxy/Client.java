package designpatterns.structural.proxy;

public class Client {
	
	public static void main(String args[]) {
		
		RealObject obj = new Proxy4Real();
		obj.doSomething();
		
	}

}
