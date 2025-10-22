package clasess;
public class TaxCalculation {
	
	public static void main(String[] args) {
		TaxCalculation taxCaluculator = new TaxCalculation();
		taxCaluculator.TamilNaduTax();
		taxCaluculator.AndhraPradeshTax();
		taxCaluculator.TelanganaTax();
		}
	
	void TamilNaduTax() {
        // Given values
       float basePrice = 1000;  // Base cost of the product
       float cgstRate = 9;    // CGST percentage
       float sgstRate = 10;    // SGST percentage
               // Calculate CGST and SGST amounts
        float cgstAmount = (basePrice * cgstRate) / 100;
        float sgstAmount = (basePrice * sgstRate) / 100;        
        // Calculate total price including GST
        float totalPrice = basePrice + cgstAmount + sgstAmount;
        System.out.println("Base Price in (Including GST): " + totalPrice);
		//Test
	}

	private void TelanganaTax() {
        // Given values
       float basePrice = 1000;  // Base cost of the product
       float cgstRate = 14;    // CGST percentage
       float sgstRate = 12;    // SGST percentage        
        // Calculate CGST and SGST amounts
        float cgstAmount = (basePrice * cgstRate) / 100;
        float sgstAmount = (basePrice * sgstRate) / 100;        
        // Calculate total price including GST
        float totalPrice = basePrice + cgstAmount + sgstAmount;
        System.out.println("Base Price in  (Including GST): " + totalPrice);		
	}

	private void AndhraPradeshTax() {
        // Given values
        float basePrice = 1000;  // Base cost of the product
        float cgstRate = 16;    // CGST percentage
        float sgstRate = 14;    // SGST percentage        
        // Calculate CGST and SGST amounts
        float cgstAmount = (basePrice * cgstRate) / 100;
        float sgstAmount = (basePrice * sgstRate) / 100;        
        // Calculate total price including GST
        float totalPrice = basePrice + cgstAmount + sgstAmount;
        System.out.println("Base Price in  (Including GST): " + totalPrice);
		
	}
	
	

}
