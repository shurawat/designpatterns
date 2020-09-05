package designpatterns.creational.prototype;

public class PrototypeTester {
	
	public static void main(String args[]) throws CloneNotSupportedException {
		System.err.println(PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE));
		System.err.println(PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).hashCode());
		System.err.println(PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).hashCode());
		System.err.println(PrototypeFactory.getInstance(PrototypeFactory.ModelType.SHOW));
		System.err.println(PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM));
	}

}
