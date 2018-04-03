package morseMachine;

import java.util.List;

import morseMachine.MorseService.Morse;

public class Main {

	public static void main(String[] args) {
		MorseService morseService = new MorseService();

		String textToEncode = "Thisisademotext";
		List<Morse> morses = morseService.encodeStringToMorse(textToEncode);

		for (Morse morse : morses) {
			System.out.print(morse + " ");
		}
		System.out.println();

		System.out.println(morseService.decodeMorseFromMorseList(morses));
	}

}
