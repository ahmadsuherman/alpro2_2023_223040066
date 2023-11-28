package PRA_UTS;

import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);

        // Memasukkan elemen-elemen array dari keyboard
        System.out.println("Masukkan lima elemen array:");
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }

        // Menampilkan nilai-nilai elemen array
        System.out.println("Nilai-nilai elemen array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
