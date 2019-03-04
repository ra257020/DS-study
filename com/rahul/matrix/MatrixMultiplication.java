package com.rahul.matrix;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] matrixOne = getMatrixOne();
		int[][] matrixTwo = getMatrixTwo();

		int[][] c = multiplyMatrix(matrixOne, matrixTwo);

		printMatrix(c);
	}

	private static int[][] multiplyMatrix(int[][] m1, int[][] m2) {
		int resultRow = m1.length;
		int resultCol = m2[0].length;
		int[][] c = new int[resultRow][resultCol];

		for (int i = 0; i < resultRow; i++) {
			for (int j = 0; j < resultCol; j++) {
				int sum = 0;
				for (int k = 0; k < m1[0].length; k++) {
					sum += (m1[i][k] * m2[k][j]);
				}
				c[i][j] = sum;
			}
		}
		return c;
	}

	private static int[][] getMatrixOne() {
		return new int[][] { { 2, 5, 7, 9 }, { 8, 4, 2, 1, }, { 5, 8, 9, 6 } };
	}

	private static int[][] getMatrixTwo() {
		return new int[][] { { 5, 4, 1, 2, 8 }, { 2, 4, 5, 8, 7 }, { 4, 8, 4, 2, 6 }, { 8, 4, 2, 9, 1 } };
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
