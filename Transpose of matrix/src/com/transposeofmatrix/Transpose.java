package com.transposeofmatrix;

public class Transpose {

	public static void main(String[] args) {
		
		int orginal[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int transpose [][] = new int[3][3];
		
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				transpose[i][j]=orginal[j][i];
			}
		}
		
		System.out.println("The transpose of matrix");
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
