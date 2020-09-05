package designpatterns.creational.prototype;

public class Show implements PrototypeCapable{

	private String name;
	
	@Override
	public Show clone() throws CloneNotSupportedException {
		return (Show) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Show []";
	}
	
}
