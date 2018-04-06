package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * More group work 
 * */
public class Lesson13Test {
	
	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - capture 	1280x720 	1280 720
	 - capture 	1920x1600 	1920 1600
	 - capture 	1024x768 	1024 768
	*/
	
	@Test
	public void regexShouldCapture_1() {
		Matcher matcher = pattern.matcher("1280x720");
		boolean matches = matcher.matches();
		assertThat(matches).isTrue();
		assertThat(matches);
		if(matcher.matches()) {
			int groupCount = matcher.groupCount();
			assertThat(groupCount).isGreaterThanOrEqualTo(2);
			if (groupCount >= 2) {
				assertThat(matcher.group(1)).isEqualTo("1280");
				assertThat(matcher.group(2)).isEqualTo("720");
			}
		}
	}
	
	@Test
	public void regexShouldCapture_2() {
		Matcher matcher = pattern.matcher("1920x1600");
		boolean matches = matcher.matches();
		assertThat(matches).isTrue();
		assertThat(matches);
		if(matcher.matches()) {
			int groupCount = matcher.groupCount();
			assertThat(groupCount).isGreaterThanOrEqualTo(2);
			if (groupCount >= 2) {
				assertThat(matcher.group(1)).isEqualTo("1920");
				assertThat(matcher.group(2)).isEqualTo("1600");
			}
		}
	}
	
	@Test
	public void regexShouldCapture_3() {
		Matcher matcher = pattern.matcher("1024x768");
		boolean matches = matcher.matches();
		assertThat(matches).isTrue();
		assertThat(matches);
		if(matcher.matches()) {
			int groupCount = matcher.groupCount();
			assertThat(groupCount).isGreaterThanOrEqualTo(2);
			if (groupCount >= 2) {
				assertThat(matcher.group(1)).isEqualTo("1024");
				assertThat(matcher.group(2)).isEqualTo("768");
			}
		}
	}
}


