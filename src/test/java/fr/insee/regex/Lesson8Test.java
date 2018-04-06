package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Kleene Star (*) and the Kleene Plus (+)
 * */
public class Lesson8Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	aaaabcc
	 - match 	aabbbbc
	 - match 	aacc
	 - skip 	a
	*/
	
	@Test
	public void regexShouldMatch_aaaabcc() {
		assertThat("aaaabcc").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_aabbbbc() {
		assertThat("aabbbbc").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_aacc() {
		assertThat("aacc").matches(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_a() {
		assertThat("a").doesNotMatch(pattern);
	}
}


