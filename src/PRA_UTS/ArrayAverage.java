package PRA_UTS;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);

        // Memasukkan elemen-elemen array dari keyboard
        System.out.println("Masukkan lima elemen array:");
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }

        // Menghitung nilai rata-rata elemen array
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += array[i];
        }

        double average = (double) sum / 5;

        // Menampilkan nilai rata-rata elemen array
        System.out.println("Rata-rata elemen array: " + average);
    }
}
