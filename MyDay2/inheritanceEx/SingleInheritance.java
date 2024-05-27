package inheritanceEx;

class Mobile{
	
	public void voiceCall() {
		
		System.out.println("Starting voice call....");
	}
	
	public void textMessage() {
		
		System.out.println("Sending text message....");
	}
}

class Mobile_2 extends Mobile{
	
	public void videoCall() {
		System.out.println("Starting camera for video call..");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Mobile_2 m=new Mobile_2();
		m.textMessage();
		m.voiceCall();
		m.videoCall();

	}

}
