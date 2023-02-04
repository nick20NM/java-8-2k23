package java_8_2k23_1.video2;

import java.util.ArrayList;
import java.util.List;

// list
public class Example1 {

	public static void main(String[] args) {

		List<User> list = new ArrayList<User>();
		list.add(new User(1, "tom", "tom@gmail.com"));
		list.add(new User(2, "jerry", "jerry@gmail.com"));
		list.add(new User(3, "ben", "ben@gmail.com"));

		// before java 8
		for (User user : list) {
			System.out.println(user.toString());
		}

		System.out.println("-------------------------------------------");

		// using forEach()
		list.forEach(user -> {
			System.out.println(user.toString());
		});
	}
}
