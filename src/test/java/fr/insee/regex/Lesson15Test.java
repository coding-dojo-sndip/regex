package fr.insee.regex;


import static org.assertj.core.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * Filtrer les lignes du fichier regex.log :
 * - Conserver uniquement les lignes dont le message contient au moins un caractère alphanumérique
 * - Capturer le nombre en début de ligne
 * */
public class Lesson15Test {

	private static final String regex = "(\\d+) \\[(.*)\\] (.*\\w+.*)"; // TODO
	
	private static final Pattern pattern = Pattern.compile(regex);
	
	@Test
	public void filter_log_nb_lines() throws IOException {
		List<String> lines = Files.readAllLines(Paths.get("src/test/resources/regex.log"))
			.stream()
			.filter(this::matches)
			.collect(Collectors.toList());
		assertThat(lines).hasSize(25);
	}
	
	@Test
	public void capture_first_number() throws IOException {
		int sum = Files.readAllLines(Paths.get("src/test/resources/regex.log"))
			.stream()
			.filter(this::matches)
			.mapToInt(this::mapToInt)
			.sum();
		assertThat(sum).isEqualTo(450_574);
	}
	
	private boolean matches(String line) {
		Matcher matcher = pattern.matcher(line);
		return matcher.matches();
	}
	
	private int mapToInt(String line) {
		Matcher matcher = pattern.matcher(line);
		if(matcher.matches()) {
			return Integer.valueOf(matcher.group(1));
		}
		return 0;
	}
}


