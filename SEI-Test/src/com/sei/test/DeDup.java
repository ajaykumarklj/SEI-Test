/**
 * 
 */
package com.sei.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ajay
 *
 */
public class DeDup implements Cloneable{
	
	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
			18, 4, 9, 3,20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6, 19,
			13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	public int[] removeDuplicateBySet(int[] intArray) {

		Set<Integer> set = new LinkedHashSet<>();
		int k = 0;
		for (int i = 0; i < intArray.length; i++) {
			set.add(intArray[i]);
		}
		int[] uniqueOutput = new int[set.size()];
		for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = iterator.next();
			uniqueOutput[k] = integer.intValue();
			k++;
		}
		return uniqueOutput;
	}

	public int[] removeDuplicateByList(int[] intArray) {

		List<Integer> list = new ArrayList<>();
		list.add(0, intArray[0]);
		int previousValue = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] != previousValue && !list.contains(intArray[i])) {
				list.add(intArray[i]);
				previousValue = intArray[i];
			}
		}
		int[] output = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			output[i] = (Integer) list.get(i).intValue();
		}
		return output;
	}

	public int[] removeDuplicate(int[] intArray) {

		int[] output = new int[intArray.length];
		output[0] = intArray[0];
		int k = 1;
		int[] tempArray = new int[intArray.length];
		tempArray[0] = intArray[0];
		int previousValue = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if (previousValue != intArray[i] && !isExist(intArray[i], tempArray)) {
				output[k] = intArray[i];
				previousValue = intArray[i];
				k++;
				tempArray[i] = intArray[i];
			}
		}
		return output;
	}

	public static boolean isExist(int n, int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {
			if (n == intArray[i]) {
				return true;
			}
		}
		return false;
	}
}
