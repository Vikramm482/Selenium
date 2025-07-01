package com.SELENIUMAMPRACTICE;
interface webdriver
{
	void get();
}
public class chromedriver implements webdriver
{
	public void get()
	{
		System.out.println("this is get method");
	}
	

	public static void main(String[] args) 
	{
		chromedriver driver=new chromedriver();
				driver.get();
				
		  webdriver driver1=new chromedriver();
		  driver1.get();
		  
             
	}
	
}
