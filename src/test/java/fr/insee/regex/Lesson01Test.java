package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * The 123s
 * */
public class Lesson01Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - contains 	abc123xyz
	 - contains 	define "123"
	 - skip			var g = 'aze';
	*/
	
	@Test
	public void regexShouldMatch_abc123xyz() {
		assertThat("abc123xyz").containsPattern(pattern);
	}
	
	@Test
	public void regexShouldMatch_define_123() {
		assertThat("define \"123\"").containsPattern(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_abc() {
		assertThat("var g = 'aze';").doesNotContainPattern(pattern);
	}
}