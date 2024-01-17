package ch05_reference;

import java.util.Arrays;

public class Ex03_MutiDimArray {

	public static void main(String[] args) {
		// 2차원 배열
		int[][] matrix = new int[2][3];
		int score[][] = { { 80, 90, 70 }, { 85, 88, 72 } };
		System.out.println(Arrays.toString(score)); // useless
		System.out.println(Arrays.toString(score[0]));
		System.out.println(Arrays.toString(score[1]));

		// 인덱싱
		System.out.println(score[0][0] + ", " + score[1][1]);

		// 톱니바퀴 모양
		int gear[][] = { { 1, 3, 5, 9 }, { 2, 6 }, { 8, 5, 3 } };

		// dot product
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] c = new int[2][2];

		// 지뢰찾기
		char[][] mines = new char[8][8];
		for (int i = 0; i < mines.length; i++) {
			for (int j = 0; j < mines[i].length; j++) {
				mines[i][j] = (Math.random() > 0.7 ? '*' : '.');
			}
		}
		printMines(mines);
	}

	static void printMines(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
