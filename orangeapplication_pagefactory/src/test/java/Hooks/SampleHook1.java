package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class SampleHook1 {
	@Before
	public void method1() {
		System.out.println("Before scenario");
	}
	@BeforeStep
	public void method2() {
		System.out.println("Before each step of the scenario");
		
	}
	@AfterStep
	public void method3() {
		System.out.println("After each step of the scenario");
	}
	@After
	public void method4() {
		System.out.println("After scenario");
		
	}
}
