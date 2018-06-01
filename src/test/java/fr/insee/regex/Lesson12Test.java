package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Nested groups
 * (a(bc)) 	Capture Sub-group
 * */
public class Lesson12Test {
	
	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - capture 	 	Jan 1987  	Jan 1987 1987
	 - capture 	 	May 1969	May 1969 1969
 	 - capture 	 	Aug 2011	Aug 2011 2011
	*/
	
	@Test
	public void regexShouldCapture_1() {
		Matcher matcher = pattern.matcher("Jan 1987");
		boolean matches = matcher.matches();
		assertThat(matches).isTrue();
		assertThat(matches);
		if(matcher.matches()) {
			int groupCount = matcher.groupCount();
			assertThat(groupCount).isGreaterThanOrEqualTo(2);
			if (groupCount >= 2) {
				assertThat(matcher.group(1)).isEqualTo("Jan 1987");
				assertThat(matcher.group(2)).isEqualTo("1987");
			}
		}
	}
	
	@Test
	public void regexShouldCapture_2() {
		Matcher matcher = pattern.matcher("May 1969");
		boolean matches = matcher.matches();
		assertThat(matches).isTrue();
		assertThat(matches);
		if(matcher.matches()) {
			int groupCount = matcher.groupCount();
			assertThat(groupCount).isGreaterThanOrEqualTo(2);
			if (groupCount >= 2) {
				assertThat(matcher.group(1)).isEqualTo("May 1969");
				assertThat(matcher.group(2)).isEqualTo("1969");
			}
		}
	}
	
	@Test
	public void regexShouldCapture_3() {
		Matcher matcher = pattern.matcher("Aug 2011");
		boolean matches = matcher.matches();
		assertThat(matches).isTrue();
		assertThat(matches);
		if(matcher.matches()) {
			int groupCount = matcher.groupCount();
			assertThat(groupCount).isGreaterThanOrEqualTo(2);
			if (groupCount >= 2) {
				assertThat(matcher.group(1)).isEqualTo("Aug 2011");
				assertThat(matcher.group(2)).isEqualTo("2011");
			}
		}
	}
}


