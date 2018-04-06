package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Character ranges 
 * */
public class Lesson6Test {

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
	public void regexShouldMatch_Ana() {
		assertThat("Ana").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_Bob() {
		assertThat("Bob").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_Cpc() {
		assertThat("Cpc").matches(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_aax() {
		assertThat("aax").doesNotMatch(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_bby() {
		assertThat("bby").doesNotMatch(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_ccz() {
		assertThat("ccz").doesNotMatch(pattern);
	}
}


