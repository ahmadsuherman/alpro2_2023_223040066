package PRA_UTS;

import java.util.Scanner;

public class DiagonalMatrixSum {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        Scanner input = new Scanner(System.in);

        // Memasukkan elemen-elemen matriks dari keyboard
        System.out.println("Masukkan elemen-elemen matriks 4x4:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Menghitung total elemen diagonal
        int totalDiagonal = 0;
        for (int i = 0; i < 2; i++) {
            totalDiagonal += matrix[i][i];
        }

        // Menampilkan hasil
        System.out.println("Total elemen diagonal matriks: " + totalDiagonal);
    }
}


