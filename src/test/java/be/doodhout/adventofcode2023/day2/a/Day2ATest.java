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

	@Test
	public void testOnlyOneValidGame() {
		String recordedGames = "Game 1: 1 red, 1 blue";
		assertThat(day2a.calculateCubeGameIdSumForOnlyPossibleGames(recordedGames, 12, 13, 14)).isEqualTo(1);
	}

	@Test

	public void testOneInvalidGame() {
		String invalidGame = "Game 1: 500 red";
		assertThat(day2a.calculateCubeGameIdSumForOnlyPossibleGames(invalidGame, 12, 13, 14)).isEqualTo(0);
	}
}