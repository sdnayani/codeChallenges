package com.examples.arrays;

import java.util.Arrays;

public class ArrayTests {
public static void main(String[] args){
	int[] missingNumber=new int[] {1,2,3,6};
	int[] duplicatesArray=new int[] {1,3,4,6,1,3,8,9,6};
	
	//int missing=ArrayUtils.findMissingNumber(missingNumber, 6);
	//System.out.printf(" The Array %s has the missibg element %d ",Arrays.toString(arr), missing);
	//ArrayUtils.findMissingNumberUsingBitSet(missingNumber, 6);
	//ArrayUtils.findDuplicatesInArrayAndRemoveDuplicates(duplicatesArray);
	int[] searchElementsArray=new int[] {1,3,4,6,1,3,8,9,6};
	Integer[] searchIntElementsArray=new Integer[] {1,3,4,6,1,3,8,9,6};
	 //Boolean found= ArrayUtils.binarySearchInArray(searchElementsArray, 1);
	 //System.out.println(" The element is found "+found);
	//System.out.printf(" Does array %s contains %d ? %b %n" ,Arrays.toString(searchIntElementsArray),10, 
			//ArrayUtils.searchElementUsingGenerics(searchIntElementsArray, 10));
	
	 //String[] searchStrElements=new String[] {"JP","KP","RP","FP"};
	 ///System.out.printf(" Does array %s contains %s ? %b %n" ,Arrays.toString(searchStrElements),"JP", 
			// ArrayUtils.searchElementUsingGenerics(searchStrElements,"JP"));
	 int[] largestAndSmallest=new int[] {-20, 34, 21, -87, 92, Integer.MAX_VALUE};
	 //ArrayUtils.printSmallestAndLargest(largestAndSmallest);
	 int[] numbersWithDuplicates={2, 4, 3, 5, 6, -2, 4, 7, -2, 9 };

	// ArrayUtils.printArrayPairsEqualToTheNumber(numbersWithDuplicates, 7);
	// ArrayUtils.prettyPrint(numbersWithDuplicates, 6);
	 
	
	// ArrayUtils.findRepeatedNumberWithMultipleDuplicates(numbersWithDuplicates);
	 
	// int[] array1={{21, 34, 41, 22, 35};
	   Integer[] array1={21, 34, 41, 22, 35};
	   Integer[] array2={61, 34, 45, 21, 11};
	   
	   //ArrayUtils.findIntersectionSets(array1, array2); 
	   Integer[] array3={1,2,3,4,5,6};
	   
	  ArrayUtils.rightRotate(array3, 2);
	   //ArrayUtils.findGCDOfTwoNumbers(20, 28);
	   int[] sides={7,3,6,4};
	   
	   //ArrayUtils.countPossibleTriangles(sides);
	   int[] leaders={15,16,3,2,6,1,4};
	  //System.out.println( ArrayUtils.findTheLeadersInArray(leaders));
         }

    }

