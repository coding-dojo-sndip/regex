package fr.insee.regex;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * It's all conditional
 * (abc|def) 	Matches abc or def
 * */
public class Lesson14Test {
	
	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	I love cats
	 - match 	I love dogs
	 - skip 	I love logs
	 - skip 	I love cogs
	*/
	
	@Test
	public void regexShouldMatch_1() {
		assertThat("I love cats").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_2() {
		assertThat("I love dogs").matches(pattern);
	}
	
	@Test
	public void regexShouldSkip_1() {
		assertThat("I love logs").doesNotMatch(pattern);
	}
	
	@Test
	public void regexShouldSkip_2() {
		assertThat("I love cogs").doesNotMatch(pattern);
	}
}


