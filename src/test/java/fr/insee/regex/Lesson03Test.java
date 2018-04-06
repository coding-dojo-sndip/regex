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
	public void regexShouldMatch_1() {
		assertThat("can").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_2() {
		assertThat("man").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_3() {
		assertThat("fan").matches(pattern);
	}
	
	@Test
	public void regexShouldSkip_1() {
		assertThat("dan").doesNotMatch(pattern);
	}
	
	@Test
	public void regexShouldSkip_2() {
		assertThat("ran").doesNotMatch(pattern);
	}
	
	@Test
	public void regexShouldSkip_3() {
		assertThat("pan").doesNotMatch(pattern);
	}
}


