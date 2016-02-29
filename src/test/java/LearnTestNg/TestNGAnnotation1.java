package LearnTestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation1 {

	@BeforeClass
	public void beforeClass(){
		System.out.println("Initialize selinum");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method");
	}
	
	@Test
	public void test1(){
		System.out.println("Inside Test1");
	}
	
	@Test
	public void test2(){
		System.out.println("Inisde Test2");
		}

	@AfterMethod
	public void afterMethod(){
		System.out.println(" After Method");
	}
	
	@AfterClass
	public void AfterClass(){
		System.out.println(" After Class");
	}
	
	
	
	
}
