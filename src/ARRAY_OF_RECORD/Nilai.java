package ARRAY_OF_RECORD;

import java.util.Scanner;

public class Nilai {
	int Nim;
	String Nama;
	double UTS, UAS, Praktikum, NA;
	char idx;
	
	void bacaNilai() {

		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Nim: "); Nim = sc.nextInt();
		System.out.println("Nama: "); Nama = sc.next();
		System.out.println("UTS: "); UTS = sc.nextDouble();
		System.out.println("UAS: "); UAS = sc.nextDouble();
		System.out.println("Praktikum: "); Praktikum = sc.nextDouble();
		hitungNA();
		setIndex();
		
	}
	
	void tulisNilai() {
		System.out.println("Nim: "+ Nim);
		System.out.println("Nama: "+ Nama);
		System.out.println("UTS: "+ UTS);
		System.out.println("UAS: "+ UAS);
		System.out.println("Praktikum: "+ Praktikum);
		System.out.println("NA: "+ NA);
		System.out.println("Index: "+ idx);
	}
	
	void hitungNA() {
		NA = (0.3 * UTS) + (0.45 * UAS) + (0.25 * Praktikum);
		
	}
	
	void setIndex() {
		if(NA >= 80)
			idx = 'A';
		else if(NA >= 70)
			idx = 'B';
		else if(NA >= 55)
			idx = 'C';
		else if(NA >= 45)
			idx = 'D';
		else 
			idx = 'E';
	}
}
