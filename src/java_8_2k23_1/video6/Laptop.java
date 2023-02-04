package java_8_2k23_1.video6;

public interface Laptop {

	default void doVideoCall() {
		System.out.println("default implementation of doVideoCall() inside Laptop");
	}
}
