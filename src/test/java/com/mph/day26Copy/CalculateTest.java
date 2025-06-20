package com.mph.day26Copy;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mph.day26Copy.Calculate;

public class CalculateTest {

	 Calculate cal;
	 
	 @BeforeClass
	 public static void setUpBeforeClass() throws Exception{
	 	
	 	System.out.println("@BeforeClass Called");
	 }
	 @AfterClass
	 public static void tearDownAfterClass() throws java.lang.Exception
	 {
	 	System.out.println("@AfterClass Called");
	 }
	 
	 @Before
	 public void createOutputFile() {
		 System.out.println("@Before Called");
	        cal= new Calculate();
	 }
	 @After
	 public void deleteOutputFile() {
		 cal=null;
		 System.out.println("@After called");
	 }
	 
	 
	@Test
	 public void testMultiply() {
		 assertEquals(210,cal.multiply(2,10),1);
		 System.out.println("Multiply Test");
	 }
	
	 @Test
	 public void testAdd() {
		 System.out.println("Add Test");
		  assertEquals(100, cal.add(70+30+0));
	 }
}
