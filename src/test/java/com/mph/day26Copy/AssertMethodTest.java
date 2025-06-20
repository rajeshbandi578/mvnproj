package com.mph.day26Copy;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertMethodTest {
	@Test
	public void testingAssertMethods() {
		String str1 = new String("Rajesh");
		String str2 = new String("Rajesh");
		String str3 = null;
		String str4 = "Rajesh";
		String str5 = "Rajesh";
		
		int num = 100;
		int num1 =200;
		
		String[] arr1 = {"one","two","three"};
		String[] arr2 = {"one","two","three"};
		
		assertEquals(str1,str2);
		assertSame(str4,str5);
		assertNotNull(str4);
		assertNull(str3);
		assertTrue(num1>num);
		assertFalse(num>num1);
		assertArrayEquals(arr1,arr2);
		
		//assertTrue(num>num1);
	}
}
