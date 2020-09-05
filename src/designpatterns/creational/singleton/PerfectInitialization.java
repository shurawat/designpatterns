package designpatterns.creational.singleton;

import java.io.Serializable;

public class PerfectInitialization implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7269979399642829538L;
	
	private PerfectInitialization() {
	}
	
	public static class LazyHolder {
		private static final PerfectInitialization INSTANCE = new PerfectInitialization();
	}
	
	public Object readResolve() {
		return getInstance();
	}
	
	public static PerfectInitialization getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	private int i = 10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	

}
