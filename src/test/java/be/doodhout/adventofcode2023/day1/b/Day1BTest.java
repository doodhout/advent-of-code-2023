package be.doodhout.adventofcode2023.day1.b;

import static org.assertj.core.api.Assertions.assertThat;

import be.doodhout.adventofcode2023.day1.a.Day1A;
import be.doodhout.adventofcode2023.day1.a.Day1ATests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Day1BTest {
	Day1A day1a;
	Day1B day1b;

	@BeforeEach
	public void setup() {
		day1a = new Day1A();
		day1b = new Day1B();
	}

	@Test
	public void testWithWordFirst() {
		String processedInput = day1b.convertWordsToDigits("one2lerfji3");
		assertThat(day1a.calculateCalibrationValue(processedInput)).isEqualTo(13);
	}

	@Test
	public void testWithWordLast() {
		String processedInput = day1b.convertWordsToDigits("xtwone3four");
		assertThat(day1a.calculateCalibrationValue(processedInput)).isEqualTo(24);
	}

	@Test
	public void testSmallSampleInput() {
		String smallSampleInput = """
				two1nine
				eightwothree
				abcone2threexyz
				xtwone3four
				4nineeightseven2
				zoneight234
				7pqrstsixteen
				""";
		String processedInput = day1b.convertWordsToDigits(smallSampleInput);
		assertThat(day1a.calculateCalibrationValue(processedInput)).isEqualTo(281);
	}

	@Test
	public void testActualCalibrationText() {
		String processedInput = day1b.convertWordsToDigits(Day1ATests.actualCalibrationText);
		int calibrationValue = day1a.calculateCalibrationValue(processedInput);
		assertThat(calibrationValue).isEqualTo(54591);
	}

}