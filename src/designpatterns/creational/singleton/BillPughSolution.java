package designpatterns.creational.singleton;

public class BillPughSolution {
	
	private BillPughSolution() {
	}
	
	public static class LazyHolder {
		private static final BillPughSolution INSTANCE = new BillPughSolution();
	}
	
	public static BillPughSolution getInstance() {
		return LazyHolder.INSTANCE;
	}

}
