package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Character ranges 
 * */
public class Lesson05Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	Ana
	 - match 	Bob
	 - match 	Cpc
	 - skip 	aax
	 - skip 	bby
	 - skip 	ccz
	*/
	
	@Test
	public void regexShouldMatch_1() {
		assertThat("Ana").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_2() {
		assertThat("Bob").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_3() {
		assertThat("Cpc").matches(pattern);
	}
	
	@Test
	public void regexShouldSkip_1() {
		assertThat("aax").doesNotMatch(pattern);
	}
	
	@Test
	public void regexShouldSkip_2() {
		assertThat("bby").doesNotMatch(pattern);
	}
	
	@Test
	public void regexShouldSkip_3() {
		assertThat("ccz").doesNotMatch(pattern);
	}
}


