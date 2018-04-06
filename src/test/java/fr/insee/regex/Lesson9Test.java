package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Characters optional 
 * */
public class Lesson9Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	1 file found?
	 - match 	2 files found?
	 - match 	24 files found?
	 - skip 	No files found.
	*/
	
	@Test
	public void regexShouldMatch_aaaabcc() {
		assertThat("1 file found?").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_aabbbbc() {
		assertThat("2 files found?").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_aacc() {
		assertThat("24 files found?").matches(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_a() {
		assertThat("No files found.").doesNotMatch(pattern);
	}
}


