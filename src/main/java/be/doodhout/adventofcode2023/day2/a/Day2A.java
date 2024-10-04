package be.doodhout.adventofcode2023.day2.a;

public class Day2A {
	public int calculateCubeGameIdSumForOnlyPossibleGames(String recordedGames, int numberOfRedCubes, int numberOfGreenCubes, int numberOfBlueCubes) {
		String[] game = recordedGames.replaceFirst("^Game ", "").split(":");
		int sum = 0;
		if (game.length == 2) {
			String id = game[0];
			String grabs = game[1];
			String[] everyGrab = grabs.split(";");
			boolean hasInvalidGrab = false;
			for (String grab : everyGrab) {
				if (isInvalidGrab(grab, numberOfRedCubes, numberOfGreenCubes, numberOfBlueCubes)) {
					hasInvalidGrab = true;
					break;
				}
			}
			if (!hasInvalidGrab) {
				sum += Integer.parseInt(id);
			}
		}
		return sum;
	}

	private boolean isInvalidGrab(String grab, int numberOfRedCubes, int numberOfGreenCubes, int numberOfBlueCubes) {
		boolean isInvalidGrab = false;
		String[] differentColours = grab.split(",");
		for (String differentColour : differentColours) {
			if (differentColour.contains("red")) {
				String numberOfRed = differentColour.replaceAll(" red", "").trim();
				if (numberOfRed.matches("\\d+") && Integer.parseInt(numberOfRed) > numberOfRedCubes) {
					isInvalidGrab = true;
					break;
				}
			} else if (differentColour.contains("green")) {
				String numberOfGreen = differentColour.replaceAll(" green", "").trim();
				if (numberOfGreen.matches("\\d+") && Integer.parseInt(numberOfGreen) > numberOfGreenCubes) {
					isInvalidGrab = true;
					break;
				}
			} else if (differentColour.contains("blue")) {
				String numberOfBlue = differentColour.replaceAll(" blue", "").trim();
				if (numberOfBlue.matches("\\d+") && Integer.parseInt(numberOfBlue) > numberOfBlueCubes) {
					isInvalidGrab = true;
					break;
				}
			}
		}
		return isInvalidGrab;
	}
}
