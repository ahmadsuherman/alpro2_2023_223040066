package ARRAY;

import java.util.Scanner;

public class ArrString {
	int N=5;
	String[] a = new String[N];
	
	void isiArray() {
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i < N; i++) {
			System.out.print("element array ke " + i + ": ");
			a[i] = sc.next();
		}
	}
	
	void tampilArray() {
		for (int i=0; i < N; i++) {
			System.out.println("element array ke " + i + ": " + a[i]);
		}
	}
	

	void CariElemen() {
		Scanner as = new Scanner(System.in);
		System.out.println("String yang dicari: ");
		
		String cari = as.next();
		
		for(int i=1; i< N; i++) {
			if(a[i] == cari) {
				System.out.println("ketemu diindeks: "+i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		arrayInt A = new arrayInt();
		
		A.isiArray();
		A.tampilArray();
		
	}
}
