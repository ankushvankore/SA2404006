package com.TestNGDemos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D09Dependency {
  @Test
  public void login() {
	  System.out.println("This is login test");
	  Assert.assertFalse(false);
  }
  @Test(dependsOnMethods = "login")		
  //This method is depending upon successful execution of login method
  public void logout() {
	  System.out.println("This is logout test");
  }
  
}