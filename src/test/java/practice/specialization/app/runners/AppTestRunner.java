package practice.specialization.app.runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import practice.specialization.app.AppTest;

public class AppTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AppTest.class);
		
		System.out.println("Starting Test");
		
		for (Failure failure: result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.getRunCount());
		System.out.println(result.wasSuccessful());
	}
}
