package com.examples.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayUtils {
	
	/**
	 * Find the Missing Number using Sum...
	 * This will let you to find only 1 missing number..
	 * @param arr
	 * @param n
	 * @return
	 */
	
	public static int findMissingNumber(int[] arr,int n){
		int expectedSum=n*(n+1)/2;
		int actualSumn=0;
		
		for(int i:arr){
			actualSumn=actualSumn+i;	
		}
		
		return expectedSum-actualSumn;
		
		
	}
	
	/**
	 * Find the Missing Numbers using BitSet...
	 * This is using more than 1 number...
	 * @param numbers
	 * @param count
	 * @return
	 */
	public static void findMissingNumberUsingBitSet(int[] numbers ,int count){
		
		int missingCount=count-numbers.length;
		BitSet bitSet= new BitSet(count);
		
		for(int number:numbers){
			bitSet.set(number-1);
		}
		System.out.println(bitSet.get(0));
		int lastMissingIndex=0;
		
		for(int i=0;i<missingCount; i++){
			
			lastMissingIndex=bitSet.nextClearBit(lastMissingIndex);
			System.out.println(" The next lastMissingIndex "+ ++lastMissingIndex);
			
		}
	
		
	}

	/**
	 * Find the duplicates in a array..
	 */
	public static void findDuplicatesInArrayAndRemoveDuplicates(int[]numbers ){
		//sort the array so all the duplicates some next to each other...
		Arrays.sort(numbers);
		
		int[] result=new int[numbers.length];
		int prev=numbers[0];
		result[0]=prev;
		for(int i=1; i<numbers.length; i++){
			if(prev!=numbers[i]){
				result[i]=numbers[i];
			}
			prev=numbers[i];
		}
		System.out.printf(" Array %s  before  removing duplicates %s after removing duplicates" ,Arrays.toString(numbers),Arrays.toString(result));
	}

	/**
	 * Binary Search will give performance in n(log n) time..
	 * 
	 * @param numbers
	 * @param searchKey
	 * @return
	 */
	
	public static Boolean binarySearchInArray(int[] numbers,int searchKey){
		Arrays.sort(numbers);
		int low=0;
		int high=numbers.length-1;
		int mid=(low+high)/2;
		Boolean found=false;
		for(int i=0; i<numbers.length; i++){
			
		  if(numbers[mid]==searchKey){
				found=true;
				return found;
			}
		  
		  if(numbers[mid]<searchKey){
			  low=mid+1;
		  }
		  if(numbers[mid]>searchKey){
			  high=mid-1;
		  }
		  mid=low+high/2;
		}
		
		return found;
	}

	/**
	 * Search the element using generics...
	 * Searches for a String or any integer..
	 * @param array
	 * @param e
	 * @return
	 */
  public static <T> Boolean searchElementUsingGenerics(final T[] array,final T v){
	  
	  for(final T e:array){
		  if((e==v) || ((e!=null ) && e.equals(v))){
			  return true;
		  }
	  }
	  return false;
	  
  }
  
  public static <T> Boolean searchElementsConvetingToList(final T[] array,T e){	  
	       return Arrays.asList(array).contains(e);	  
  }

  /**
   * This is the program to find the smallest and largest elements in the array...
   * 
   * @param array
   */
  
   public static void printSmallestAndLargest(int[] array){
	   int largest=Integer.MIN_VALUE;
	   int smallest=Integer.MAX_VALUE;
	   for(int i=0; i<array.length; i++){
		   
		   if(array[i]>largest) {
			   largest=array[i];
		   }
		   if(array[i]<smallest){
			   smallest=array[i];
		   }
	   }
	   
	   System.out.printf(" The largest %d and smallest %d %n",largest,smallest);
	   
   }

   public static void printArrayPairsEqualToTheNumber(int[] array,int pairNumber){
	   Arrays.sort(array);
	   int low=0,high=array.length-1;
	   
	   while(low<high){
		   
		   int sum=array[low]+array[high];
		   
		   if(sum==pairNumber){
			   
			System.out.printf(" The pair ( %d , %d  ) number %n ",array[low],array[high]);
			low=low+1;
			high=high-1;
		   }
		   if(sum<pairNumber){
			   low=low+1;
		   }
		   if(sum>pairNumber){
			   high=high-1;
		   }
	   }
	   
   }

   /**
    * Returns a random nunber in range 0-15
    * @param n
    * @return
    */
   public static int[] getRandomArray(int n){
	   
	   int[] random=new int[n];
	   for(int i=0; i<n; i++){
		   random[i] =(int)(Math.random()*15);
	   }
	   return random;
   }
   
   
   public static void printArrayPairsUsingSet(int[] numbers,int n){
        HashSet set= new HashSet(numbers.length);
        
	     for(int value: numbers){
	    	 int target=n-value;
	    	 
	    	  if(!set.contains(target)){
	    		  set.add(value);
	    	  }
	    	  else{
	    		  System.out.printf(" The pair ( %d , %d  ) number %n ",target,value);
	    	  }
	     }
   }

    public static void prettyPrint(int[] randomArray,int n){
    	System.out.printf(" The random Array %s  Array ",Arrays.toString(randomArray));
    	System.out.printf("The Sum is  %d ",n);
    	printArrayPairsUsingSet(randomArray,n);
    }

    /**
     * program to find the repeated numbers with multiple duplicate elements...
     * @param array
     */
    public static void findRepeatedNumberWithMultipleDuplicates(int[] array){
    	
    	System.out.printf(" The %s to search for duplicates",Arrays.toString(array));
      HashMap<Integer,Integer>duplicateElements= new HashMap<Integer,Integer>();
      
      for(Integer key:array){
    	   if(!duplicateElements.containsKey(key)){
    		   duplicateElements.put(key,1);
    	   }
    	   else{
    		   duplicateElements.put(key,duplicateElements.get(key)+1);
    	   }
     }
    	Iterator<Map.Entry<Integer, Integer>> it= duplicateElements.entrySet().iterator();
    	
    	while(it.hasNext()){
    		Map.Entry<Integer, Integer> entry=it.next();
    		//System.out.printf(" %nThe key is %d and value is %d ",entry.getKey(),entry.getValue());
    		if(entry.getValue()>1){
    			System.out.printf(" %nThe key %d  repeated %d times %n",entry.getKey(),entry.getValue());
    			
    		}
    	}
    	
    }

    public static HashSet<Integer> removeDuplicateElementsInArrayUsingHashSet(int[] array){
    	HashSet<Integer>hs= new HashSet<Integer>();
    	
    	for(int x : array){
    		hs.add(x);
    	}
    	
    	return hs;
    	
    }

    public static void findIntersectionSets(Integer[] array1, Integer[] array2){
    	
    	HashSet<Integer>hs1= new HashSet<Integer>(Arrays.asList(array1));
    	HashSet<Integer>hs2= new HashSet<Integer>(Arrays.asList(array2));
    	HashSet<Integer>Intersection= new HashSet<Integer>(hs1);
    	Intersection.retainAll(hs2);
    	System.out.println("The Common elements in the sets " +Intersection);
    	
    }
    
    public static void findNonDuplicateElement(Integer[] array){
    	HashMap<Integer,Integer>nonDuplicates= new HashMap<Integer,Integer>();
    	for(Integer e:array){
    		if(!nonDuplicates.containsKey(e)){
    			nonDuplicates.put(e, 1);
    		}
    		else {
    			nonDuplicates.put(e, nonDuplicates.get(e)+1);
    		}
    	}
    	Iterator<Map.Entry<Integer,Integer>> iter= nonDuplicates.entrySet().iterator();
    	while(iter.hasNext()){
    		Entry<Integer,Integer>entry= iter.next();
    		  if(entry.getValue()==1){
    			  System.out.printf(" The non duplicate element %d  ",entry.getKey());
    		  }
        }
    
  }
    
    public static void findKthSmallestunSortedArray(Integer[] array,int k){
    	Arrays.sort(array);
    	System.out.println(array[k-1]);
    }

    
    public static Integer[] rotateArray(Integer[] originalArray,int d){
    	int[] tmp= new int[d];
    	//move the d elements to tmp array..
    	
    	for(int i=0; i<d; i++){
    		tmp[i]=originalArray[i];
    	}
    	for(int j=0; j<d; j++){
    		
    	for(int i=0; i<originalArray.length-1; i++){
    		originalArray[i]=originalArray[i+1];
    	   }
    	}
    	System.out.printf(" The orig Array %s ",Arrays.toString(originalArray));
    	
    	for(int i=originalArray.length-d,j=0; i<originalArray.length; i++,j++){
    		originalArray[i]=tmp[j];
    		
    	}
    	
    	System.out.printf(" The Rotated Array %s ",Arrays.toString(originalArray));
    	
    	return originalArray;
    }
   
     public static void findGCDOfTwoNumbers(int n1, int n2){
    	 
        int gcd = 0;
    	 for( int i=1; i<=n1 && i<=n2; i++){
    		 
    	     if(((n1%i)==0 && (n2%i)==0)){
    	    	 gcd=i;
    	     }    	 
           }
    	 
    	 System.out.printf(" The GCD of numbers %d and %d is %d %n",n1,n2,gcd);
    	 
     } 	 
   
     public static void countPossibleTriangles(int[] sides){
    	 
    	 Arrays.sort(sides);
    	 
    	 if(sides.length<3){
    		 return;
    	 }
    	 int i=0,j=i+1, k=j+1;
    	 int n=sides.length;
    	 int count=0;
    	 
    	 while(i< n-2){
    		 System.out.println(" The sides of i " +sides[i]);
        	 System.out.println(" The sides of j " +sides[j]);
        	 System.out.println(" The sides of k " +sides[k]);
    		 System.out.printf(" The sum of sides sides are %d %n",sides[i]+sides[j]);
    	 if(sides[i]+sides[j]> sides[k]){
    		 
    		 j=j+1;
    		 k=k+1;
    		if(j==n-1){
    			
    			//reset i and j...
    			i=i+1;
    			j=i+1;
    			k=j+1;
    	     	}
    		
    		    count=count+1;
    	     }
    	 }
    	 
    	 System.out.printf("The count of number of triangles are  %d ",count);
     }
     
     public static ArrayList<Integer> findTheLeadersInArray(int[] arr){
    	 int n=arr.length;
    	 int mfr=arr[arr.length-1];
    	 ArrayList<Integer>Leaders=new ArrayList<Integer>();
    	 Leaders.add(mfr);
    	 for(int i=n-2;i>=0; i--){
    		 
    		 if((arr[i])>mfr){
    			 Leaders.add(arr[i]);
    			 mfr=arr[i];
    		 }
    		
    	 }
    	 return Leaders;
    	 
    	 
     }
     
      public static void rightRotate(Integer[] arr,int k){
    	  int[] tmp=new int[k];
          //move the first k chars to the tmp array.
    	  
    	  for(int i=arr.length-k,j=0; i<arr.length; i++,j++){
    		  tmp[j]=arr[i];
    	  }
    	  //arr.length-k-1 to the begining of array..
    	  int l=arr.length-k-1;
    	  for(int i=l; i>=0; i--){
    		  arr[i+2]=arr[i];
    		 // System.out.printf(" The arr %s ",Arrays.toString(arr)); 
    	  }
    	  for(int i=0; i<k; i++){
    		  arr[i]=tmp[i];
    	  }
    	 // System.out.printf(" The tmp %s ",Arrays.toString(tmp));
    	  System.out.printf(" The arr %s ",Arrays.toString(arr)); 
    	  
      }
}