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
		}

	@Override
	public void accelarator() {
	System.out.println("Driver Should PRESS the Accelarator Pedal to INCREASE the SPEED of Maruti 800");
	}
	

	
	
	
	
	
	

}
