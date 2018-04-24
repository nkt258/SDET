package com.maven.test;

import org.testng.annotations.Test;

public class CustomerTest 
{
	
	@Test
 public void testcreateCustomer()
 {
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		System.out.println("browser name -->"+browser);
		System.out.println("URL -->"+url);
	 System.out.println("Created customer.....");
 }
	
	@Test
    public void testDeleteCustomer()
   {
	 System.out.println("Deleted customer.....");
   }
}
