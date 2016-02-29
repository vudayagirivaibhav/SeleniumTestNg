package TestNg.Parameters;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class DataParameters {
	
	@Test(dataProviderClass=TestDataFile.class,dataProvider="data")
	public void registerUser(String firstname,
	String lastname,
	String email,
	String password){
	System.out.println(firstname);
	System.out.println(lastname);
	System.out.println(email);
	System.out.println(password);
	}
	@Test(dataProviderClass=TestDataFile.class,dataProvider="data")
	public void LoginUser(
	String email,
	String password){
	System.out.println(email);
	System.out.println(password);
	}
	
}

