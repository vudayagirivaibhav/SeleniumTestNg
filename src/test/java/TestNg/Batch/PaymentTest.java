package TestNg.Batch;

import org.testng.annotations.Test;

public class PaymentTest {

	@Test
	public void PayinDollar(){
		System.out.println("Dollars paid");
	}
	
	@Test
	public void PayinEuros(){
		System.out.println("euros paid");
	}
}
