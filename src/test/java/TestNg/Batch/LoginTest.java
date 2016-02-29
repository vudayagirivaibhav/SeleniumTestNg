package TestNg.Batch;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LoginTest {
	
	@Test
	public void LoginViaEmail(){
		System.out.println("Login via Email");
		try{
				Assert.assertEquals("vaibhav", "vaibhav", "successful sign in ");
			}
		catch(Throwable t){
			System.out.println(t);			
		}
	}
	
	@Test
	public void LoginViaFacebook(){
		System.out.println("Login via Email");
		try{
		Assert.assertEquals("vaibhav", "vaiav", "successful sign in ");
		}
		catch(Throwable t){
			System.out.println(t);			
		}
	}
	
	@Test
	public void LoginViaTwitter(){
		try{
		System.out.println("Login via Email");
		}
		catch(Throwable t){
			System.out.println(t);			
		}
	}
}
