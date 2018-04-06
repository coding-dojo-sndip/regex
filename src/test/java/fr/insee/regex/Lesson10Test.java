package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Starting and ending  
 * */
public class Lesson10Test {

	private static final String regex = "^Mission: successful"; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	Mission: successful
	 - skip 	Last Mission: unsuccessful
	 - skip 	Next Mission: successful upon capture of target
	*/
	
	@Test
	public void regexShouldMatch_Mission_successful() {
		assertThat("Mission: successful").containsPattern(pattern);
	}
	
	@Test
	public void regexShouldMatch_Last_Mission_unsuccessful() {
		assertThat("Last Mission: unsuccessful").doesNotContainPattern(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_Next_Mission_successful_upon_capture_of_target() {
		assertThat("Next Mission: successful upon capture of target").doesNotContainPattern(pattern);
	}
}


