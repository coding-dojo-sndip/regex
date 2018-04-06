package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

public class Lesson1Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	@Test
	public void regexShouldMatch_abcde() {
		assertThat("abcde").matches(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_abcdefg() {
		assertThat("abcdefg").doesNotMatch(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_abc() {
		assertThat("abc").doesNotMatch(pattern);
	}
}
