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
	
	public static void main(String[] args) {
		arrayInt A = new arrayInt();
		arrayInt B = new arrayInt();
		
		A.isiArray();
		A.tampilArray();
		A.hitungRataArray();
		A.nilaiMaksArray();
		A.nilaiMaksV2Array();
		
		B.isiArray();
		B.tampilArray();
		
//		SalinLarikAkeB(A,B);
		System.out.println("Array A dan B sama? " + isSamaAB(A,B));
	}
}
