package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Kleene Star (*) and the Kleene Plus (+)
 * */
public class Lesson07Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	aaaabcc
	 - match 	aabbbbc
	 - match 	aacc
	 - skip 	a
	*/
	
	@Test
	public void regexShouldMatch_1() {
		assertThat("aaaabcc").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_2() {
		assertThat("aabbbbc").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_3() {
		assertThat("aacc").matches(pattern);
	}
	
	@Test
	public void regexShouldSkip_1() {
		assertThat("a").doesNotMatch(pattern);
	}
}


