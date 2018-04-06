package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * The Dot
 * */
public class Lesson3Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	cat.
	 - match 	896.
	 - match 	?=+.
	 - skip 	abc1
	*/
	
	@Test
	public void regexShouldMatch_cat() {
		assertThat("cat.").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_896() {
		assertThat("896.").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_signs() {
		assertThat("?=+.").matches(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_abc1() {
		assertThat("abc1").doesNotMatch(pattern);
	}
}
