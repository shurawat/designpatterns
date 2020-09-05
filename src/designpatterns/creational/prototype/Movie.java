package designpatterns.creational.prototype;

public class Movie implements PrototypeCapable{
	
	private String name;
	
	@Override
	public Movie clone() throws CloneNotSupportedException {
		return (Movie) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Movie []";
	}
	
}
