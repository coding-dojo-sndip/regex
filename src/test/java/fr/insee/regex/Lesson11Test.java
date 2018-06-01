package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Match groups
 * (…) 	Capture Group
 * */
public class Lesson11Test {
	
	private static final String regex = ""; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	/*
	 - capture 	 	file_record_transcript.pdf  	file_record_transcript
	 - capture 	 	file_07241999.txt				file_07241999
	 - skip 	 	testfile_fake.pdf.tmp
	*/
	
	@Test
	public void regexShouldCapture_1() {
		Matcher matcher = pattern.matcher("file_record_transcript.pdf");
		boolean matches = matcher.matches();
		assertThat(matches).isTrue();
		if(matches) {
			int groupCount = matcher.groupCount();
			assertThat(groupCount).isGreaterThanOrEqualTo(1);
			if (groupCount >= 1) {
				assertThat(matcher.group(1)).isEqualTo("file_record_transcript");
			}
		}
	}
	
	@Test
	public void regexShouldCapture_2() {
		Matcher matcher = pattern.matcher("file_07241999.txt");
		boolean matches = matcher.matches();
		assertThat(matches).isTrue();
		assertThat(matches);
		if(matcher.matches()) {
			int groupCount = matcher.groupCount();
			assertThat(groupCount).isGreaterThanOrEqualTo(1);
			if (groupCount >= 1) {
				assertThat(matcher.group(1)).isEqualTo("file_07241999");
			}
		}
	}
	
	@Test
	public void regexShouldSkip_1() {
		assertThat("testfile_fake.pdf.tmp").doesNotMatch(pattern);
	}
}


