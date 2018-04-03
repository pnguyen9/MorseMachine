package morseMachine;

import java.util.List;

import morseMachine.MorseService.Morse;

public class Main {

	public static void main(String[] args) {
		MorseService morseService = new MorseService();

		String textToEncode = "High seas are a force of alarming scope Luckily with trained shipmates you have not one fear to entertain With radios developed via JW Witherscram SOS is easy";
		List<Morse> morses = morseService.encodeStringToMorse(textToEncode);

		for (Morse morse : morses) {
			System.out.print(morse + " ");
		}
		System.out.println();

		System.out.println(morseService.decodeMorseFromMorseList(morses));
	}

}
