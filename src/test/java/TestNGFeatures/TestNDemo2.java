package TestNGFeatures;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNDemo2 {
	@Test(priority=3)
	public void tc_1()
	{
		System.out.println("this is first tectcase");
	}
	@Test(priority=1)
	public void tc_2()
	{
		System.out.println("this is 2nd testcase");
		Assert.assertEquals(12, 10);
	}
	@Test(priority=0)
	public void tc_3()
	{
		System.out.println("this is the 3rd testcase");
	}
	@Test(priority=2)
	public void tc_4()
	{
		System.out.println("this is the test case 4");
	}

}
