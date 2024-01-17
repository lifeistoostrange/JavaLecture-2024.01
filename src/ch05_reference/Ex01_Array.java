package ch05_reference;

import java.util.Arrays;

public class Ex01_Array {

	public static void main(String[] args) {
		int[] score = { 80, 90, 78, 93, 65 };
		char grade[] = { 'B', 'A', 'C', 'A', 'D' };
		int[] newArray = new int[10];

		System.out.println(score[0] + ", " + score[4]);
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] + " ");
		}
		System.out.println();

		score[0] = 90;
		grade[0] = 'A';
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = 1 + (int) (Math.random() * 6);
		}
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(score));
	}

}
