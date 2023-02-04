package java_8_2k23_1.video2;

import java.util.ArrayList;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {

		List<User> list = new ArrayList<User>();
		list.add(new User(1, "tom", "tom@gmail.com"));
		list.add(new User(2, "jerry", "jerry@gmail.com"));
		list.add(new User(3, "ben", "ben@gmail.com"));

		// stream & forEach()
		list.stream().forEach(user -> {
			System.out.println(user.toString());
		});
	}
}
