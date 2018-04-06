package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Non capturing groups
 * */
public class Lesson15Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - capture 	ranked 1st 1
	 - capture 	ranked 2nd 2
	 - capture 	ranked 3rd 3
	 - capture 	ranked 4th 4
	 - capture 	ranked 5th 5
	*/
	
	@Test
	public void regexShouldMatch_1() {
		shouldCapture("ranked 1st", 1);
	}
	
	@Test
	public void regexShouldMatch_2() {
		shouldCapture("ranked 2nd", 1);
	}
	
	@Test
	public void regexShouldMatch_3() {
		shouldCapture("ranked 3rd", 1);
	}
	
	@Test
	public void regexShouldMatch_4() {
		shouldCapture("ranked 4th", 1);
	}
	
	@Test
	public void regexShouldMatch_5() {
		shouldCapture("ranked 5th", 1);
	}

	private void shouldCapture(String string, int capture) {
		Matcher matcher = pattern.matcher(string);
		boolean matches = matcher.matches();
		assertThat(matches).isTrue();
		assertThat(matches);
		if(matcher.matches()) {
			int groupCount = matcher.groupCount();
			assertThat(groupCount).isEqualTo(1);
			if (groupCount == 1) {
				assertThat(matcher.group(1)).isEqualTo(String.valueOf(capture));
			}
		}
	}
}


