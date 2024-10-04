package be.doodhout.adventofcode2023.day1.b;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day1B {
	public String convertWordsToDigits(String inputWithWords) {
		return Stream.of(inputWithWords.split("\\R"))
				.map(this::replaceFirstWordWithDigit)
				.map(this::replaceLastWordWithDigit)
				.collect(Collectors.joining(System.lineSeparator()));
	}

	private String replaceLast(String text, String regex, String replacement) {
		return text.replaceFirst("(?s)" + regex + "(?!.*?" + regex + ")", replacement);
	}

	private String replaceFirstWordWithDigit(String line) {
		for (int i = 0; i < line.length(); i++) {
			if (line.substring(i).startsWith("one")) {
				return line.replaceFirst("one", "1ne");
			} else if (line.substring(i).startsWith("two")) {
				return line.replaceFirst("two", "2wo");
			} else if (line.substring(i).startsWith("three")) {
				return line.replaceFirst("three", "3hree");
			} else if (line.substring(i).startsWith("four")) {
				return line.replaceFirst("four", "4our");
			} else if (line.substring(i).startsWith("five")) {
				return line.replaceFirst("five", "5ive");
			} else if (line.substring(i).startsWith("six")) {
				return line.replaceFirst("six", "6ix");
			} else if (line.substring(i).startsWith("seven")) {
				return line.replaceFirst("seven", "7even");
			} else if (line.substring(i).startsWith("eight")) {
				return line.replaceFirst("eight", "8ight");
			} else if (line.substring(i).startsWith("nine")) {
				return line.replaceFirst("nine", "9ine");
			} else if (line.substring(i).startsWith("zero")) {
				return line.replaceFirst("zero", "0ero");
			}
		}
		return line;
	}

	private String replaceLastWordWithDigit(String line) {
		for (int i = line.length(); i > 0; i--) {
			if (line.substring(0, i).endsWith("one")) {
				return replaceLast(line, "one", "1ne");
			} else if (line.substring(0, i).endsWith("two")) {
				return replaceLast(line, "two", "2wo");
			} else if (line.substring(0, i).endsWith("three")) {
				return replaceLast(line, "three", "3hree");
			} else if (line.substring(0, i).endsWith("four")) {
				return replaceLast(line, "four", "4our");
			} else if (line.substring(0, i).endsWith("five")) {
				return replaceLast(line, "five", "5ive");
			} else if (line.substring(0, i).endsWith("six")) {
				return replaceLast(line, "six", "6ix");
			} else if (line.substring(0, i).endsWith("seven")) {
				return replaceLast(line, "seven", "7even");
			} else if (line.substring(0, i).endsWith("eight")) {
				return replaceLast(line, "eight", "8ight");
			} else if (line.substring(0, i).endsWith("nine")) {
				return replaceLast(line, "nine", "9ine");
			} else if (line.substring(0, i).endsWith("zero")) {
				return replaceLast(line, "zero", "0ero");
			}
		}
		return line;
	}

}
