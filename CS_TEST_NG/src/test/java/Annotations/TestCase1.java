package Annotations;

import org.testng.annotations.*;

public class TestCase1 {
	
	@BeforeMethod
	public void beforemethod() 
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void aftermethod() 
	{
		System.out.println("After method");
	}
	
	@BeforeClass
	public void beforeclass() 
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void Afterclass() 
	{
		System.out.println("after class");
	}
	
	
//*******************************************************************
	@Test
	public void test1() 
	{
		System.out.println("its test1");
	}

	@Test
	public void test2() 
	{
		System.out.println("its test2");
	}














}
