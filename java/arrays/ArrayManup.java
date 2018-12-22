package com.examples.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String[] ele=sc.nextLine().split("\\s* ");
		int n=Integer.parseInt(ele[0]);
		int m=Integer.parseInt(ele[1]);
		int[][] manip= new int[m+1][n];
		int[] manip1= new int[n];
		//input arr
		int[][] queries= new int[m][3];		
		System.out.println(" The number of Queries..." +m);	
		for(int i=0; i<m; i++){
				String[] input=sc.nextLine().split(" ");				
				queries[i][0]=Integer.parseInt(input[0]);
				queries[i][1]=Integer.parseInt(input[1]);
				queries[i][2]=Integer.parseInt(input[2]);				
			}
		
		
		printArray(queries);
		
		System.out.println("==============");
		
	   arrayManipulation1(queries,manip1);
	 

	}
	public static void arrayManipulation(int[][] queries,int[][] manip){
		
			
			for(int i=0; i<queries.length; i++){
				
				for(int k=0; k<queries[i].length-1; k++){
					
					//apply this on all the elements in the manip..
					for(int j=1; j<manip.length; i++){
						
						for(int l=queries[i][k]; l<=queries[i][k+1]; l++ ){
							System.out.println("coming here");
							manip[j][l-1]=manip[j][l-1]+queries[i][queries[i].length-1]	;
								
							}
						printArray(manip);
						
					}
				}
										
			}
		}
	
	public static void arrayManipulation1(int[][] queries,int[] manip){
		
		for(int i=0; i<queries.length; i++){
			
			for(int j=queries[i][0]; j<=queries[i][1]; j++){
				manip[j-1]=manip[j-1]+queries[i][2];				
			}
		}
		
		System.out.printf(" The Array %s  ",Arrays.toString(manip));
		
		
	}
	
	
	public static void printArray(int[][] arr1){
		
		//System.out.println(" The arr len" +arr1.length);
		
		for(int i=0; i<arr1.length; i++){
			//System.out.println(" The arr len1 " +arr1[0].length);
			
			for(int j=0; j<arr1[i].length; j++){
				System.out.print(arr1[i][j] + " ");
			}
			//System.out.println("Coming here");
			System.out.println();
		}
	}

}
