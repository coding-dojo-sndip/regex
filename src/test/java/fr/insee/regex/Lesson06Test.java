package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Catching some zzz's
 * {m} 	m Repetitions
 * {m,n} 	m to n Repetitions
 * */
public class Lesson06Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	wazzzzzup
	 - match 	wazzzup
	 - skip 	wazup
	*/
	
	@Test
	public void regexShouldMatch_1() {
		assertThat("wazzzzzup").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_2() {
		assertThat("wazzzup").matches(pattern);
	}
	
	@Test
	public void regexShouldSkip_1() {
		assertThat("wazup").doesNotMatch(pattern);
	}
}


