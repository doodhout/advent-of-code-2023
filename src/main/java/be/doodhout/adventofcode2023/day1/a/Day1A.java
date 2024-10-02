package be.doodhout.adventofcode2023.day1.a;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day1A {
	public int calculateCalibrationValue(String input) {
		return Stream.of(input.split("\\R")) // \R is the universally compatible line separator pattern since Java 8
				.map(this::getCalibrationValueForSingleLine)
				.collect(Collectors.summingInt(Integer::intValue));
	}

	private int getCalibrationValueForSingleLine(String singleLine) {
		List<Character> characters = singleLine.chars().mapToObj(c -> (char) c).toList();
		int firstDigit = findFirstDigitCharacterIn(characters).orElse(0);
		int lastDigit = findFirstDigitCharacterIn(characters.reversed()).orElse(0);
		return firstDigit * 10 + lastDigit;
	}

	private Optional<Integer> findFirstDigitCharacterIn(List<Character> characters) {
		return characters.stream()
				.filter(Character::isDigit)
				.map(String::valueOf)
				.map(Integer::valueOf)
				.findFirst();
	}
}
