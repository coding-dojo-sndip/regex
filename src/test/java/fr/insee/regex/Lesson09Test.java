package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * All this whitespace  
 * */
public class Lesson09Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	1. abc
	 - match 	2.	 abc
	 - match 	3. 		 abc
	 - skip 	4.abc
	*/
	
	@Test
	public void regexShouldMatch_aaaabcc() {
		assertThat("1. abc").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_aabbbbc() {
		assertThat("2.	 abc").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_aacc() {
		assertThat("3. 		 abc").matches(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_a() {
		assertThat("4.abc").doesNotMatch(pattern);
	}
}


