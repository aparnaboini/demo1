package com.demo.maven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */





public class Palindrome {
	
	public boolean isPalindrome(String inputString) {
	    if (inputString.length() == 0) {
	        return true;
	    } else {
	    	String rev = "";
	    	int length = inputString.length();
	    	 
	        for ( int i = length - 1; i >= 0; i-- )
	           rev = rev + inputString.charAt(i);
	   
	        if (inputString.equals(rev))
	           return true;
	        else
	           return false;
	    }
	}
	
	public static void main(String args[]) {
		
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		Palindrome p=new Palindrome();
		System.out.println(p.isPalindrome(str));
		 
	}

}

