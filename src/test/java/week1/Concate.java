package week1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Concate {
	@Test
	public void fun() {
		String fname="Hrithik";
		String lname="roshan";
		System.out.println("Hello "+fname+" "+lname);
		Assert.assertTrue(true);
	}
}
