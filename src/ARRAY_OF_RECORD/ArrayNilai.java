package ARRAY_OF_RECORD;

import java.util.Scanner;

public class ArrayNilai {
	int N=2;
	Nilai[] a = new Nilai[N];
	
	void isiArray() {
		Scanner  sc = new Scanner(System.in);
		
		Nilai x;
		
		for (int i=0; i < N; i++) {
			
			x = new Nilai();
			System.out.println("element array ke " + i);
			
			x.bacaNilai();
			a[i] = x;
		}
	}
	
	void tampilArray() {
		for (int i=0; i < N; i++) {
			System.out.println("element array ke " + i);
			a[i].tulisNilai();
			System.out.println();
		}
	}
	
	void CariMaks() {
		double maks = a[0].NA;
		int imaks = 0;
		
		for(int i=1; i< N; i++) {
			if(a[i].NA>imaks) {
				maks = a[i].NA;
				imaks = i;
			}
		}

		System.out.println("Nilai maksimal array: "+ a[imaks]);
		System.out.println("Nilai maksimal di-indek array ke: "+ imaks);
		
	}
	
	public static void main(String[] args) {
		ArrayNilai A = new ArrayNilai();
		
		A.isiArray();
		A.tampilArray();
		
		
	}
}
