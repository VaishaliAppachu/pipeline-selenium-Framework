package com.testng.pipeline;

public class WithParameter
{
	public void withParameter()
	{
		String brow = System.getProperty("browser");
		System.out.println(brow);
	}
}
