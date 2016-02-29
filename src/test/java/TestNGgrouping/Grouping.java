package TestNGgrouping;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups={"performance"})
	public void method1(){
		System.out.println("Method1");
	}
	
	@Test(groups={"regression"})
	public void method2(){
		System.out.println("Method2");
	}

	@Test(groups={"regression","performance"})
	public void method3(){
		System.out.println("Method3");
	}
}
