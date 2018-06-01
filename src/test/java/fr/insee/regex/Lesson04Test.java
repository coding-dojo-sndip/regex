package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Excluding specific characters
 * [^abc] 	Not a, b, nor c
 * */
public class Lesson04Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	hog
	 - match 	dog
	 - skip 	bog
	*/
	
	@Test
	public void regexShouldMatch_1() {
		assertThat("hog").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_2() {
		assertThat("dog").matches(pattern);
	}
	
	@Test
	public void regexShouldSkip_1() {
		assertThat("bog").doesNotMatch(pattern);
	}
}


