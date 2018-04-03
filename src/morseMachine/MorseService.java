package morseMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MorseService {

	private Map<String, Morse> morseDecoder;
	private Map<String, Morse> morseEncoder;

	public enum Morse {
		A(".-"), //
		B("-..."), //
		C("-.-."), //
		D("-.."), //
		E("."), //
		F("..-."), //
		G("--."), //
		H("...."), //
		I(".."), //
		J(".---"), //
		K("-.-"), //
		L(".-.."), //
		M("--"), //
		N("-."), //
		O("---"), //
		P(".--."), //
		Q("--.-"), //
		R(".-."), //
		S("..."), //
		T("-"), //
		U("..-"), //
		V("...-"), //
		W(".--"), //
		X("-..-"), //
		Y("-.--"), //
		Z("--.."); //

		private Morse(String code) {
			this.code = code;
		}

		private String code;

		public String decipher() {
			return this.name();
		}

		@Override
		public String toString() {
			return code;
		}
	}

	public String getStringFromMorse(String morseCode) {
		if (morseDecoder == null) {
			morseDecoder = new HashMap<String, Morse>();

			for (Morse morse : Morse.values()) {
				morseDecoder.put(morse.toString(), morse);
			}
		}

		return morseDecoder.get(morseCode).decipher();
	}

	public Morse getMorseForCharacter(String character) {
		if (morseEncoder == null) {
			morseEncoder = new HashMap<String, Morse>();

			for (Morse morse : Morse.values()) {
				morseEncoder.put(morse.decipher(), morse);
			}
		}

		return morseEncoder.get(character);
	}

	public String decodeMorseFromMorseList(List<Morse> morses) {
		String decodedString = "";

		for (Morse morse : morses) {
			decodedString += morse.decipher();
		}

		return decodedString;
	}

	public List<Morse> encodeStringToMorse(String string) {
		List<Morse> morses = new ArrayList<Morse>();

		for (char character : string.replace(" ", "").toCharArray()) {
			Morse morse = getMorseForCharacter(Character.toString(character).toUpperCase());
			morses.add(morse);
		}

		return morses;
	}

}
