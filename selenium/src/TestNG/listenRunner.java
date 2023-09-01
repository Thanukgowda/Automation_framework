package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class listenRunner
{
  @Test
  public void test1()
{
	System.out.println("hello bangalore");
}
  @Test
  public void test2()
  {
	  System.out.println("hello india");
	  Assert.fail();
  }
  @Test(dependsOnMethods = "test2")
  public void test3()
  {
	  System.out.println("hello asia");
  }
}
