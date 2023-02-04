package java_8_2k23_1.video2;

import java.util.HashMap;
import java.util.Map;

// map
public class Example3 {

	public static void main(String[] args) {

		Map<Integer, User> map = new HashMap<>();
		map.put(1, new User(1, "tom", "tom@gmail.com"));
		map.put(2, new User(2, "jerry", "jerry@gmail.com"));
		map.put(3, new User(3, "ben", "ben@gmail.com"));

		// before java 8
		for (Map.Entry<Integer, User> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("----------------------------------------------");

		// using forEach()
		map.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
	}
}
