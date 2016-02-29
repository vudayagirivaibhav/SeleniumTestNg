package TestNg.Batch;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
public class SignUpTest {
	
	@Test
	public void signUpEmail(){
		System.out.println("Sign up via email");
	}
	
	@Test
	public void signUpFacebook(){
		System.out.println("sign up via facebook");
	}
	
	@Test
	public void signUpTwitter(){
		System.out.println("sign up via Twitter");
	}

}
