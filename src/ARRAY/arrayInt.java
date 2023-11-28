package ARRAY;

import java.util.Scanner;

public class arrayInt {
	int N=5;
	int[] a = new int[N];
	
	void isiArray() {
		Scanner  sc = new Scanner(System.in);
		
		for (int i=0; i < N; i++) {
			System.out.print("element array ke " + i + ": ");
			a[i] = sc.nextInt();
		}
	}
	
	void tampilArray() {
		for (int i=0; i < N; i++) {
			System.out.println("element array ke " + i + ": " + a[i]);
		}
	}
	
	void hitungRataArray() {
		double Total=0; 
		double Rata=0;
		
		for(int i=0; i< N; i++) {
			Total = Total + a[i];
		}
		Rata = Total/N;
		System.out.println("Rata rata array: "+ Rata);
	}
	
	void nilaiMaksArray() {
		int maks = a[0];
		
		for(int i=1; i< N; i++) {
			if(maks < a[i]) {
				maks = a[i];
			}
		}
		
		System.out.println("Nilai maksimal array: "+ maks);
		
	}
	
	void nilaiMaksV2Array() {
		int imaks = 0;
		
		for(int i=1; i< N; i++) {
			if(a[i] > a[imaks]) {
				imaks = i;
			}
		}

		System.out.println("Nilai maksimal array: "+ a[imaks]);
		System.out.println("Nilai maksimal di-indek array ke: "+ imaks);
		
	}
	
	int GetElemen(int i) {
		return a[i];	
	}
	
	void SetElemen(int i, int x) {
		a[i]=x;
	}
	
	int seqSearch(int x) {
		int i;
		
		i = 0;
		while((i < N-1) && a[i] != x) {
			i = i + 1;
		}
		
		if(a[i] == x) {
			return i;
		} else {
			return -1;
		}
	}
	
	int BinSearch(int x) {
		int iAwal=0, iAkhir=N-1, k = 0;
		boolean ketemu=false;
		
		while ((iAwal <= iAkhir) && (ketemu == false)) {
			k = (iAwal + iAkhir)/2;
			if (a[k] == x)
				ketemu = true;
			else if (a[k] > x)
					iAkhir = k - 1;
				else
					iAwal = k + 1;
		}
		if (ketemu == true)
			return k;
		else 
			return -1;
	}
	
	
	static void SalinLarikAkeB(arrayInt A, arrayInt B) {
		int x;
		for (int i=0; i<A.N; i++) {
			x = A.GetElemen(i);
			B.SetElemen(i, x);
		}
		B.tampilArray();
	}
	
	static boolean isSamaAB(arrayInt A, arrayInt B) {
		boolean sama = true;
		
		int i = 0;
		while(i < A.N && (sama == true)) {
			if(A.GetElemen(i) == B.GetElemen(i)) {
				i = i +1;
			} else {
				sama = false;
			}
		}
		
		return sama;
	}
	
	//Terurut membesar
	void selectionSort() {
		int imaks, temp;
		for(int pass = 1; pass <= N-1; pass++) {
			imaks = 0;
			for(int i=1; i<= N-pass; i++) {
				if(a[imaks] < a[i]) {
					imaks = i;
				}
			}
			temp = a[imaks];
			a[imaks] = a[N-pass];
			a[N-pass] = temp;
		}
	}
	
	//Terurut mengecil
	void selectionSort2() {
		int imaks, temp;
		for(int pass = 1; pass <= N-1; pass++) {
			imaks = 0;
			for(int i=1; i<= N-pass; i++) {
				if(a[imaks] > a[i]) {
					imaks = i;
				}
			}
			temp = a[imaks];
			a[imaks] = a[N-pass];
			a[N-pass] = temp;
		}
	}
	
	int binSearch2(int x) {
		int iAwal=0, iAkhir=N-1, k = 0;
		boolean ketemu = false;
		
		while((iAwal <= iAkhir) && (ketemu == false)) {
			k = (iAwal + iAkhir) / 2;
			if(a[k] == x) {
				ketemu = true;
			} else if(a[k] > x) {
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
	
	public static void main(String[] args) {
		arrayInt A = new arrayInt();
		arrayInt B = new arrayInt();
		
		A.isiArray();
		A.tampilArray();
		A.selectionSort();
		A.tampilArray();
		
		A.selectionSort2();
		A.tampilArray();
		
		int ix = A.binSearch2(5);
		System.out.println("Data ketemu di index: "+ ix);
		
//		A.hitungRataArray();
//		int ix = A.seqSearch(5);
//		System.out.println("Data ketemu di index: "+ ix);
//		A.nilaiMaksArray();
//		A.nilaiMaksV2Array();
		
		B.isiArray();
		B.tampilArray();
		
//		SalinLarikAkeB(A,B);
		System.out.println("Array A dan B sama? " + isSamaAB(A,B));
	}
}
