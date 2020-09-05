package designpatterns.creational.builder;

public class User {

	private User(UserBuilder builder) {
		this.name = builder.name;
		this.pass = builder.pass;
		this.userName = builder.userName;
		this.number = builder.number;
	}

	private String name;
	private String pass;
	private String userName;
	private String number;
	
	

	@Override
	public String toString() {
		return "User [name=" + name + ", pass=" + pass + ", userName=" + userName + ", number=" + number + "]";
	}

	public static class UserBuilder {

		public UserBuilder(String userName, String pass) {
			this.userName = userName;
			this.pass = pass;
		}

		private String name;
		private String pass;
		private String userName;
		private String number;

		public UserBuilder name(String name) {
			this.name = name;
			return this;
		}

		public UserBuilder pass(String pass) {
			this.pass = pass;
			return this;
		}

		public UserBuilder userName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder number(String number) {
			this.number = number;
			return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}

	}

}
