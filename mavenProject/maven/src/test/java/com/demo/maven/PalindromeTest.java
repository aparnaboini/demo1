package com.demo.maven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class PalindromeTest {
	@Test
	public void whenEmptyString_thenAccept() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome("olo"));
	}
}