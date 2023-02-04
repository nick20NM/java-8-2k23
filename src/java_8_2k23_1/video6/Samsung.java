package java_8_2k23_1.video6;

public class Samsung implements Mobile, Laptop {

	@Override
	public void doVoiceCall() {
		System.out.println("doVoiceCall() implementation inside Samsung");
	}

	@Override
	public void doVideoCall() {
//		System.out.println("doVideoCall() implementation inside Samsung");
//		Mobile.super.doVideoCall();
		Laptop.super.doVideoCall();
	}

}
