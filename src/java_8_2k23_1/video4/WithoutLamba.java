package java_8_2k23_1.video4;

public class WithoutLamba implements FunctionalInterface1 {

	public static void main(String[] args) {
		new WithoutLamba().m1();
	}

	@Override
	public void m1() {
		System.out.println("m1 method implementation");
	}
}
