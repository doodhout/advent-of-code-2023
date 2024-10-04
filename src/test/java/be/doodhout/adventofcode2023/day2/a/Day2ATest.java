package be.doodhout.adventofcode2023.day2.a;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Day2ATest {
	private Day2A day2a;

	@BeforeEach
	public void setup() {
		day2a = new Day2A();
	}

	@Test
	public void testNothing() {
		assertThat(true).isTrue();
	}

	@Test
	public void testEmptyStringGivesSumOfZero() {
		assertThat(day2a.calculateCubeGameIdSumForOnlyPossibleGames("", 12, 13, 14)).isEqualTo(0);
	}
}