package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Catching some zzz's 
 * */
public class Lesson7Test {

	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - match 	wazzzzzup
	 - match 	wazzzup
	 - skip 	wazup
	*/
	
	@Test
	public void regexShouldMatch_wazzzzzup() {
		assertThat("wazzzzzup").matches(pattern);
	}
	
	@Test
	public void regexShouldMatch_wazzzup() {
		assertThat("wazzzup").matches(pattern);
	}
	
	@Test
	public void regexShouldNotMatch_aax() {
		assertThat("wazup").doesNotMatch(pattern);
	}
}


