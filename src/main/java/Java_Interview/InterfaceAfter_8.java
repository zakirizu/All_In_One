package Java_Interview;

interface  DemoInterFaceAfter_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			test(10,9);
			
	}
	

	
	// Abstract Method - Does NOT have implementation	
	public void welcomeMessage();
	public void addition(int x,int y);
	public void multiplication(int x,int y);
	
	//Non Abstract Method - Does Have the implementation
		//Static Method
	public static void test	(int x, int y) {		
		System.out.println("I am a Public Method, I can sit in Interface after 8");
	}
	
	//Default Method
	 default void DefaultMethod() {
		System.out.println("I am a Default Method, I can sit in Interface after 8");
	}
	
	 //private Method
	 	 private void privateMethod() {
		System.out.println("I am a Private Method, I can sit in Interface after 8");
	}
	

}
