package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Characters optional 
 * */
public class Lesson08Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	1 file found?
	 - match 	2 files found?
	 - match 	24 files found?
	 - skip 	No files found.
	*/
	
	@Test
	public void regexShouldMatch_1() {
		assertThat("1 file found?").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_2() {
		assertThat("2 files found?").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_3() {
		assertThat("24 files found?").matches(pattern);
	}
	
	@Test
	public void regexShouldSkip_1() {
		assertThat("No files found.").doesNotMatch(pattern);
	}
}


