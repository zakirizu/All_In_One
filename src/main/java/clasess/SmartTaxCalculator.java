package clasess;

public class SmartTaxCalculator {
	
	float cgstRate ;    // CGST percentage
	float sgstRate ;    // SGST percentage
	
	public static void main(String[] args) {
	SmartTaxCalculator ap = new SmartTaxCalculator(9,10);
	}
	
	public SmartTaxCalculator(float x, float y) {
		cgstRate = x;
		sgstRate = y;		
	}

private void anyState() {
    // Given values
   float basePrice = 1000;  // Base cost of the product
   float cgstAmount = (basePrice * cgstRate) / 100;
   float sgstAmount = (basePrice * sgstRate) / 100;        
    // Calculate total price including GST
    float totalPrice = basePrice + cgstAmount + sgstAmount;
    System.out.println("Base Price in (Including GST): " + totalPrice);
	//Test
}

}
