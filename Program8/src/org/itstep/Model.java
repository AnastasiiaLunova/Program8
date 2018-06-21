package org.itstep;

import java.util.Scanner;

public class Model {
	private String word1;
	private String word2;
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getWord1() {
		return word1;
	}

	public void setWord1(String word1) {
		this.word1 = word1;
	}
	
	public String getWord2() {
		return word2;
	}

	public void setWord2(String word2) {
		this.word2 = word2;
	}

	public Model(String word1, String word2, byte number) {
		super();
		this.word1 = word1;
		this.word2 = word2;
		this.number = number;
	}

	public Model() {
		super();
	}

	public String inputWordByScanerWord1(String word1) {
		if (word1.equals("Anastasiia")) { // Имя студента
			String correctWord = word1;
			return correctWord;
		} else {
			return null;
		}
	}
	
	public String inputWordByScanerWord2(String word2) {
		if (word2.equals("Lunova")) { // Фамилия студента
			String correctWord = word2;
			return correctWord;
		} else {
			return null;
		}
	}

	public int inputWordByScanerNumber(int number) {
		if (number == 8) {
			int correctNumber = number;
			return correctNumber;
		} else {
			return 0;
		}
	}

	public String writeSentence(String word1, String word2, int number) {
		return word1 + " " + word2 + " " + number;
	}
}
