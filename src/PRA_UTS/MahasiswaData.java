package PRA_UTS;

import java.util.Scanner;

public class MahasiswaData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahMahasiswa = 3; // Ubah sesuai dengan jumlah mahasiswa yang ingin Anda masukkan
        String[] nrp = new String[jumlahMahasiswa];
        String[] nama = new String[jumlahMahasiswa];
        double[] ipk = new double[jumlahMahasiswa];

        // Memasukkan data mahasiswa dari keyboard
        System.out.println("Masukkan data mahasiswa:");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("NRP Mahasiswa ke-" + (i + 1) + ": ");
            nrp[i] = input.next();

            System.out.print("Nama Mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = input.next();

            System.out.print("IPK Mahasiswa ke-" + (i + 1) + ": ");
            ipk[i] = input.nextDouble();
        }

        // Memasukkan nilai IPK yang akan dijadikan filter
        System.out.print("Masukkan nilai IPK minimal: ");
        double nilaiMin = input.nextDouble();

        // Menampilkan data IPK mahasiswa yang memenuhi kondisi
        System.out.println("Data IPK mahasiswa dengan IPK lebih besar atau sama dengan " + nilaiMin + ":");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (ipk[i] >= nilaiMin) {
                System.out.println(nrp[i] + " " + nama[i] + " " + ipk[i]);
            }
        }
    }
}

