package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Matching specific characters 
 * */
public class Lesson03Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	can
	 - match 	man
	 - match 	fan
	 - skip 	dan
	 - skip 	ran
	 - skip 	pan
	*/
	
	@Test
	public void regexShouldMatch_can() {
		assertThat("can").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_man() {
		assertThat("man").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_fan() {
		assertThat("fan").matches(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_dan() {
		assertThat("dan").doesNotMatch(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_ran() {
		assertThat("ran").doesNotMatch(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_pan() {
		assertThat("pan").doesNotMatch(pattern);
	}
}


