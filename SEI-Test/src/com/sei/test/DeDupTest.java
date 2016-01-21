/**
 * 
 */
package com.sei.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Ajay
 *
 */
public class DeDupTest {

	DeDup deDup;
	int expectedArray[] = { 1, 2, 34, 25, 45, 3, 26, 85, 4, 86, 43, 10000, 11, 16, 19, 18, 9, 20, 17, 8, 15, 6, 5, 10,
			14, 12, 13, 7 };

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	 deDup = new DeDup();

	}

	@Test
	public void testRemoveDuplicateBySet() { 
		assertArrayEquals(expectedArray, deDup.removeDuplicateBySet(deDup.randomIntegers));
	} 

	@Test 
	public void testRemoveDuplicateByList() { 
		assertArrayEquals(expectedArray, deDup.removeDuplicateByList(deDup.randomIntegers));
	} 
	@Test
	public void testRemoveDuplicate() { 
		assert(deDup.removeDuplicate(deDup.randomIntegers).length>0);
	}
}
