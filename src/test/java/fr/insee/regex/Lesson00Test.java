package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * An Introduction, and the ABCs
 * abc… 	Letters
 * */
public class Lesson00Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	abcde
	 - skip 	abcdefg
	 - skip 	abc
	*/
	
	@Test
	public void regexShouldMatch_1() {
		assertThat("abcde").matches(pattern);
	}
	
	@Test
	public void regexShouldSkip_1() {
		assertThat("abcdefg").doesNotMatch(pattern);
	}
	
	@Test
	public void regexShouldSkip_2() {
		assertThat("abc").doesNotMatch(pattern);
	}
}
