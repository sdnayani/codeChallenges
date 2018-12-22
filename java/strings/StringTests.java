package com.examples.strings;

public class StringTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str=StringUtils.deleleOddCharacters("Geeks");
		//System.out.println(" The string " +str);
		//StringUtils.retrunHighestOccuringCharacter("aaaaaaaaaaaaaaaaabbbbcddddeeeeee");
		String str=StringUtils.removeSpecificCharacterFromString("HelloWorld", 'W');
		System.out.println(" The str " +str);
		StringUtils.reverseWordsInSentence("Hello How are you");
		
	}

}
