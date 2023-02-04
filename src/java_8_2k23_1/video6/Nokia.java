package java_8_2k23_1.video6;

public class Nokia implements Mobile {

	@Override
	public void doVoiceCall() {
		System.out.println("doVoiceCall() implementation inside Nokia");
	}
	
	// we cannot override static methods
//	@Override
//	public static void sendSMS() {
//		
//	}

}
