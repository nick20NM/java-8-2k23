package java_8_2k23_1.video2;

import java.util.HashSet;
import java.util.Set;

// set
public class Example2 {

	public static void main(String[] args) {

		Set<User> set = new HashSet<>();
		set.add(new User(1, "tom", "tom@gmail.com"));
		set.add(new User(2, "jerry", "jerry@gmail.com"));
		set.add(new User(3, "ben", "ben@gmail.com"));

		// before java 8
		for (User user : set) {
			System.out.println(user.toString());
		}

		System.out.println("-------------------------------------------");

		// using forEach()
		set.forEach(user -> {
			System.out.println(user.toString());
		});
	}
}
