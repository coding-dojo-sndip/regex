package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * All this whitespace
 * \s 	Any Whitespace
 * \S 	Any Non-whitespace character
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
	public void regexShouldMatch_1() {
		assertThat("1. abc").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_2() {
		assertThat("2.	 abc").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_3() {
		assertThat("3. 		 abc").matches(pattern);
	}
	
	@Test
	public void regexShouldSkip_1() {
		assertThat("4.abc").doesNotMatch(pattern);
	}
}


