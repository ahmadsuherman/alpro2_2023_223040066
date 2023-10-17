package ARRAY_OF_RECORD;

import java.util.Scanner;

public class ArrayMahasiswa {
	int N=3;
	Mahasiswa[] a = new Mahasiswa[N];
	
	void isiArray() {
		Scanner  sc = new Scanner(System.in);
		
		Mahasiswa x;
		
		for (int i=0; i < N; i++) {
			
			x = new Mahasiswa();
			System.out.println("element array ke " + i);
			
			x.bacaMahasiswa();
			a[i] = x;
		}
	}
	
	void tampilArray() {
		for (int i=0; i < N; i++) {
			System.out.println("element array ke " + i);
			a[i].tulisMahasiswa();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ArrayMahasiswa A = new ArrayMahasiswa();
		ArrayMahasiswa B = new ArrayMahasiswa();
		
		A.isiArray();
		A.tampilArray();
		
		B.isiArray();
		B.tampilArray();
		
	}
}
