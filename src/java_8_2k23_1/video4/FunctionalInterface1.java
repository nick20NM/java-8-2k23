package java_8_2k23_1.video4;

@FunctionalInterface
public interface FunctionalInterface1 {
	
	void m1();
	
//	void m2();
	
	default void defaultMethod() {
		System.out.println("default method implementation");
	}
	
	static void staticMethod() {
		System.out.println("static method implementation");
	}
}
