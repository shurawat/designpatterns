package designpatterns.creational.prototype;

public interface PrototypeCapable extends Cloneable{
	
	PrototypeCapable clone() throws CloneNotSupportedException;

}
