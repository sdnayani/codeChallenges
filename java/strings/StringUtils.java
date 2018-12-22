package com.examples.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringUtils {

	 public static String deleleOddCharacters(String str){
	    	System.out.println(" The String " +str);
	    	StringBuilder Chars= new StringBuilder();
	    	for(int i=0; i<str.length(); i++){
	    		//System.out.println(" The String "+str);
	    		if(i%2==0){
	    			Chars.append(str.charAt(i));
	    	      }
	    	}
	    	return Chars.toString();
	    }

     public static void retrunHighestOccuringCharacter(String str){
    	 
    	 HashMap<Character,Integer>hmap=new HashMap<Character,Integer>();
    	 
    	 for(char ch: str.toCharArray()){
    		 if(!hmap.containsKey(ch)){
    			 hmap.put(ch, 1);
    		 }
    		 else {
    			 hmap.put(ch, hmap.get(ch)+1);
    		 }
    		
    	 }
    	 Iterator<Map.Entry<Character,Integer>>iter= hmap.entrySet().iterator();
    	 int max=Integer.MIN_VALUE;
    	 int min=Integer.MAX_VALUE;
    	 Character max_repeated = null;
    	 Character min_repeated = null;
    	 while(iter.hasNext()){
    		 Map.Entry<Character,Integer>entry=iter.next();
    		// System.out.printf(" The value %d and key are %s \n ",entry.getValue(),entry.getKey());
    		 
    	    if(entry.getValue()>max){
    	    	
    	       max=	entry.getValue();
    	       max_repeated=entry.getKey();
    	       //System.out.println(" The repeated char max " +);
    	    }
    	    if(entry.getValue()<min){
    	    	
     	       min=	entry.getValue();
     	       min_repeated=entry.getKey();
     	       //System.out.println(" The repeated char max " +);
     	    }
    	  	    
    	    
    	 }
    	 System.out.println(" The max repeated char "+max_repeated);
    	 System.out.println(" The min repeated char "+min_repeated);
        
     }
     
     public static String removeSpecificCharacterFromString(String str,char ch){
    	 StringBuilder sb= new StringBuilder(str);
    	   if((str==null)|| str.length()==0){
    		   return null;
    	   }
    	   for(int i=0; i<str.length(); i++){
    		   if(str.charAt(i)==ch){
    			   sb.deleteCharAt(i);
    		   }
    	   }
    	   return sb.toString();
       }

    public static void reverseWordsInSentence(String sentence){
    	String[] reverse=sentence.split(" ");
    	StringBuilder sb= new StringBuilder();
    	System.out.println("The len " +reverse.length);
    	
    	for(int i=reverse.length-1; i>=0; i--){
    		sb.append(reverse[i]).append(" ");
    		
    	}
    	System.out.println(" The reverse Sentence " +sb.toString());  	
    	
    }
    
     public static void removeDuplicateChars(String str){
    	 for(char ch: str.toCharArray()){
    		 
    	 }
     }
}
