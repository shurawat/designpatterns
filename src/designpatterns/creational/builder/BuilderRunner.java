package designpatterns.creational.builder;

public class BuilderRunner{
	public static void main(String args[]) {
		User user = new User.UserBuilder("abc", "pass")
				.number("123")
				.build();
		System.err.println(user);
		User user2 = new User.UserBuilder("cba", "ssap")
				.name("shubh")
				.build();
		System.err.println(user2);
	}
}
