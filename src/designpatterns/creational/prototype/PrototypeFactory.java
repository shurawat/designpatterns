package designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	
	public static Map<String, PrototypeCapable> instances = new HashMap<>();
	
	public static class ModelType
    {
        public static final String MOVIE = "movie";
        public static final String ALBUM = "album";
        public static final String SHOW = "show";
    }
	
	static {
		instances.put(ModelType.MOVIE, new Movie());
		instances.put(ModelType.SHOW, new Show());
		instances.put(ModelType.ALBUM, new Album());
	}
	
	public static PrototypeCapable getInstance(String s) throws CloneNotSupportedException {
		return instances.get(s).clone();
	}

}
