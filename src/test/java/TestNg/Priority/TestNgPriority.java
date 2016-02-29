package TestNg.Priority;

import org.testng.annotations.Test;

public class TestNgPriority {

	@Test(priority=2)
	public void login(){
		System.out.println("Login");
	}
	
	@Test(dependsOnMethods={"login"})
	public void navigation(){
		System.out.println("navigation");
	}
	
	@Test(priority=5)
	public void logout(){
	System.out.println("Logout");
	}
}
