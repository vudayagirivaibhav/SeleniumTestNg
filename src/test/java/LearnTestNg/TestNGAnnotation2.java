package LearnTestNg;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAnnotation2 {

	
	@BeforeSuite
	public void testBeforeSuite(){
		System.out.println("testBeforeSuite");
	}
	
	
	
	@Test
	public void test1(){
		System.out.println("Inside anote Test1");
	}
}
