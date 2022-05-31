package com.testng.pipeline;

public class WithParameter
{
	public void withParameter()
	{
		String browser = System.getProperty("browser");
		System.out.println(browser);
	}
}
