package ARRAY;

import java.util.Scanner;

public class arrayChar {
	int N=5;
	char[] a = new char[N];
	
	void isiArray() {
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("String: "); String S=sc.nextLine();
		int l =S.length(); System.out.println("Panjang string: "+ l);
		for (int i=0; i < N; i++) {
			a[i] = S.charAt(i);
		}
	}
	
	void tampilArray() {
		for (int i=0; i < N; i++) {
			System.out.println("element array ke " + i + ": " + a[i]);
		}
	}
	
	void nilaiMaksArray() {
		char maks = a[0];
		
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
	
	void cekPalindrom() {
		
		boolean lanjut = true;
		int i = 0;
		
		while((i<N/2) && (lanjut == true)) {
			if(a[i] == a[N-i-1]) 
				i++;
			else 
				lanjut = false;
		}
		
		System.out.println("Apakah kata ini palindrom: "+ lanjut);
	}
	
	char GetElemen(int i) {
		return a[i];	
	}
	
	void SetElemen(int i, char x) {
		a[i]=x;
	}
	
	static void SalinLarikAkeB(arrayChar A, arrayChar B) {
		char x;
		for (int i=0; i<A.N; i++) {
			x = A.GetElemen(i);
			B.SetElemen(i, x);
		}
		B.tampilArray();
	}
	
	static void MembalikKata(arrayChar A, arrayChar B) {
		char x;
		for (int i=0; i<A.N; i++) {
			x = A.GetElemen(i);
			B.SetElemen(A.N-i-1, x);
		}
		B.tampilArray();
	}
	
	static boolean isSamaAB(arrayChar A, arrayChar B) {
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
	
	public static void main(String[] args) {
		arrayChar A = new arrayChar();
		arrayChar B = new arrayChar();
		
		A.isiArray();
		A.tampilArray();
		A.nilaiMaksArray();
		A.nilaiMaksV2Array();
		A.cekPalindrom();
		
		
		B.isiArray();
		B.tampilArray();
		B.MembalikKata(A, B);
//		SalinLarikAkeB(A,B);
		System.out.println("Array A dan B sama? " + isSamaAB(A,B));
	}
}
