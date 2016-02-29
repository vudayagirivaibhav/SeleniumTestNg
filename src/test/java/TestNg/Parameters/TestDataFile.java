package TestNg.Parameters;

import org.testng.annotations.DataProvider;

public class TestDataFile {
	@DataProvider(name="data")
	public static Object[][] testData(){
		Object[][] obj = new Object[3][4];
		obj[0][0] ="Vaibhav";
		obj[0][1] ="V";
		obj[0][2] ="vvaibhav@gmail.com";
		obj[0][3] ="1234";
		
		obj[1][0] ="Varun";
		obj[1][1] ="U";
		obj[1][2] ="hellosd@gmail.com";
		obj[1][3] ="455654";
		
		obj[2][0] ="Dan Harjey";
		obj[2][1] ="D";
		obj[2][2] ="dharkeysd@gmail.com";
		obj[2][3] ="134345f";
		
		return obj;
		
	}

}
