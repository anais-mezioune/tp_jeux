package models;

import java.util.Random;

public enum Ressource {
	ROUGE,
	BLEU,
	JAUNE,
	VERT;
	
	private static final Ressource[] VALUES = values();
	private static final int SIZE = VALUES.length;
	private static final Random RANDOM = new Random();

	public static Ressource getRandomRessource()  {
		return VALUES[RANDOM.nextInt(SIZE)];
	}
}
