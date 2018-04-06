package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Excluding specific characters
 * */
public class Lesson5Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	hog
	 - match 	dog
	 - skip 	bog
	*/
	
	@Test
	public void regexShouldMatch_hog() {
		assertThat("hog").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_dog() {
		assertThat("dog").matches(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_bog() {
		assertThat("bog").doesNotMatch(pattern);
	}
}


