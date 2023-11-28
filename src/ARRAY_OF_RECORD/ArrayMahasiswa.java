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
	
	int seqSearch(int x) {
		int i;
		
		i = 0;
		while((i < N-1) && a[i].Nim != x) {
			i = i + 1;
		}
		
		if(a[i].Nim == x) {
			return i;
		} else {
			return -1;
		}
	}
	
	int binSearch(int x) {
		int iAwal=0, iAkhir=N-1, k = 0;
		boolean ketemu = false;
		
		while((iAwal <= iAkhir) && (ketemu == false)) {
			k = (iAwal + iAkhir) / 2;
			if(a[k].Nim == x) {
				ketemu = true;
			} else if(a[k].Nim > x) {
				iAkhir = k - 1;
			} else {
				iAwal = k + 1;
			}
		}
		
		if(ketemu == true) {
			return k;
		} else {
			return -1;
		}
	}
	
	int binSearch2(int x) {
		int iAwal=0, iAkhir=N-1, k = 0;
		boolean ketemu = false;
		
		while((iAwal <= iAkhir) && (ketemu == false)) {
			k = (iAwal + iAkhir) / 2;
			if(a[k].Nim == x) {
				ketemu = true;
			} else if(a[k].Nim > x) {
				iAwal = k + 1;
			} else {
				iAkhir = k - 1;
			}
		}
		
		if(ketemu == true) {
			return k;
		} else {
			return -1;
		}
	}
	
	//Terurut membesar
	void selectionSort() {
		int imaks;
		Mahasiswa temp = new Mahasiswa();
		for(int pass = 1; pass <= N-1; pass++) {
			imaks = 0;
			for(int i=1; i<= N-pass; i++) {
				if(a[imaks].Nim < a[i].Nim) {
					imaks = i;
				}
			}
			temp = a[imaks];
			a[imaks] = a[N-pass];
			a[N-pass] = temp;
		}
	}
	
	// Terurut mengecil
	void selectionSort2() {
		int imaks;
		Mahasiswa temp = new Mahasiswa();
		for(int pass = 1; pass <= N-1; pass++) {
			imaks = 0;
			for(int i=1; i<= N-pass; i++) {
				if(a[imaks].Nim > a[i].Nim) {
					imaks = i;
				}
			}
			temp = a[imaks];
			a[imaks] = a[N-pass];
			a[N-pass] = temp;
		}
	}
	
	public static void main(String[] args) {
		ArrayMahasiswa A = new ArrayMahasiswa();
		ArrayMahasiswa B = new ArrayMahasiswa();
		
		A.isiArray();
		A.tampilArray();
		
		A.selectionSort();
		A.tampilArray();
		
//		int ix = A.seqSearch(5);
//		System.out.println("Data ketemu di index: "+ ix);
//		
//		ix = A.binSearch(5);
//		System.out.println("Data ketemu di index: "+ ix);
//		
//		ix = A.binSearch2(5);
//		System.out.println("Data ketemu di index: "+ ix);
		
		
		B.isiArray();
		B.tampilArray();
		
	}
}
