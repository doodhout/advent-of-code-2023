package be.doodhout.adventofcode2023.day2.a;

public class Day2A {
	public int calculateCubeGameIdSumForOnlyPossibleGames(String recordedGames, int numberOfRedCubes, int numberOfGreenCubes, int numberOfBlueCubes) {
		String[] game = recordedGames.replaceFirst("^Game ", "").split(":");
		int sum = 0;
		if (game.length == 2) {
			String id = game[0];
			String grabs = game[1];
			sum += Integer.parseInt(id);
		}
		return sum;
	}
}
