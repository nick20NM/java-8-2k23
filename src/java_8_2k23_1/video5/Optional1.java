package java_8_2k23_1.video5;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) throws Exception {
		String email="tom@gmail.com";
//		String email=null;
		
		// create an empty optional
//		Optional<String> empty = Optional.empty();
//		System.out.println(empty);
		
		
		// create an optional with not-null value
//		Optional<String> notNullOptionalEmail = Optional.of(email);
//		System.out.println(notNullOptionalEmail);
		
		// create an optional with value may or may not be present
		Optional<String> optionalEmail = Optional.ofNullable(email);
		System.out.println(optionalEmail);
		
		// isPresent()
//		if (optionalEmail.isPresent()) {
//			System.out.println("value is present");
//		} else {
//			System.out.println("value is not present");
//		}
		
		// ifPresent()
//		optionalEmail.ifPresent(value -> System.out.println("value "+value));
		
		// get()
//		System.out.println("value "+optionalEmail.get());
//		if (optionalEmail.isPresent()) {
//			System.out.println("value "+optionalEmail.get());
//		} else {
//			System.out.println("value is not present");
//		}
		
		// orElse()
//		System.out.println(optionalEmail.orElse("default email is: abc@gmail.com"));
		
		// orElseGet()
//		System.out.println(optionalEmail.orElseGet(() -> "default email is: abc@gmail.com"));
		
		// orElseThrow
		System.out.println(optionalEmail.orElseThrow(() -> new Exception("email is not present")));
	}
}
