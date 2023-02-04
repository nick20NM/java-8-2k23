package java_8_2k23_1.video6;

public interface Mobile {

	void doVoiceCall();
	
//	void doVideoCall();
	
	default void doVideoCall() {
		System.out.println("default implementation of doVideoCall() inside Mobile");
	}
	
	static void sendSMS() {
		System.out.println("sendSMS static method from Mobile interface");
	}
}
