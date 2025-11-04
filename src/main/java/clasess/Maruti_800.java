package clasess;

public class Maruti_800 extends EngineRules_Govt {

	public static void main(String[] args) {
		EngineRules_Govt obj = new Maruti_800();
		obj.startEngine();
		obj.accelarator();
		obj.SoundHorn();
		obj.FourTyres();
		obj.SafetyBags();
		

	}

	@Override
	public void startEngine() {
		System.out.println("Driver Should INSERT the Key in the Ignition");
		System.out.println("Driver Should TURN the Key in the Ignition");			
		System.out.println("Starting Maruti 800 Engine");
		System.out.println("Maruti 800 Engine Started");
		System.out.println("Maruti 800 is ready to go");
		
	}

	@Override
	public void accelarator() {
	System.out.println("Driver Should PRESS the Accelarator Pedal to INCREASE the SPEED of Maruti 800");
	System.out.println("Driver Should RELEASE the Accelarator Pedal to DECREASE the SPEED of Maruti 800");
	}
	
	
	
	
	
	
	
	
	

}
