package java_8_2k23_1.video4;

public class WithLambda {

	public static void main(String[] args) {
		FunctionalInterface1 f = ()->System.out.println("m1 method implementation");
		f.m1();
	}
}
