package ARRAY_OF_RECORD;

import java.util.Scanner;

public class Mahasiswa {
	int Nim;
	String Nama;
	double IPK;
	
	void bacaMahasiswa() {

		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Nim: "); Nim = sc.nextInt();
		System.out.println("Nama: "); Nama = sc.next();
		System.out.println("IPK: "); IPK = sc.nextDouble();
	}
	
	void tulisMahasiswa() {
		System.out.println("Nim: "+ Nim);
		System.out.println("Nama: "+ Nama);
		System.out.println("IPK: "+ IPK);
	}
}
