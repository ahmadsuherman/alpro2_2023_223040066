package ARRAY_OF_RECORD;

import java.util.Scanner;

public class TabMahasiswa {
	int N=3;
	Mahasiswa[] a = new Mahasiswa[N];
	
	void isiArray() {
		Scanner  sc = new Scanner(System.in);
		
		Mahasiswa x;
		
		for (int i=0; i < N; i++) {
			
			x = new Mahasiswa();
			System.out.print("element array ke " + i + ": ");
			
			x.Nim = sc.nextInt();
			x.Nama = sc.next();
			x.IPK = sc.nextDouble();
			a[i] = x;
		}
	}
	
	void tampilArray() {
		for (int i=0; i < N; i++) {
			System.out.println("element array ke " + i + ": " +
		a[i].Nim + a[i].Nama + a[i].IPK);
		}
	}
	
	public static void main(String[] args) {
		TabMahasiswa A = new TabMahasiswa();
		TabMahasiswa B = new TabMahasiswa();
		
		A.isiArray();
		A.tampilArray();
		
		B.isiArray();
		B.tampilArray();
		
	}
}
