package MATRIKS;

import java.util.Scanner;

public class MatrikInt {
	int N=2;
	int M=3;
	int[][] a = new int[N][M];
	
	void isiMatrik() {
		Scanner  sc = new Scanner(System.in);
		
		for (int i=0; i < N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print("element matrik ke " + i + "," + j + ": ");
				a[i][j] = sc.nextInt();
			}
			
		}
	}
	
	void tampilMatrik() {
		for (int i=0; i < N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(a[i][j]+ " ");
			}
			
			System.out.println();
			
		}
	}
	
//	void hitungRataArray() {
//		double Total=0; 
//		double Rata=0;
//		
//		for(int i=0; i< N; i++) {
//			Total = Total + a[i];
//		}
//		Rata = Total/N;
//		System.out.println("Rata rata array: "+ Rata);
//	}
//	
//	void nilaiMaksArray() {
//		int maks = a[0];
//		
//		for(int i=1; i< N; i++) {
//			if(maks < a[i]) {
//				maks = a[i];
//			}
//		}
//		
//		System.out.println("Nilai maksimal array: "+ maks);
//		
//	}
//	
//	void nilaiMaksV2Array() {
//		int imaks = 0;
//		
//		for(int i=1; i< N; i++) {
//			if(a[i] > a[imaks]) {
//				imaks = i;
//			}
//		}
//
//		System.out.println("Nilai maksimal array: "+ a[imaks]);
//		System.out.println("Nilai maksimal di-indek array ke: "+ imaks);
//		
//	}
	
	int GetElemen(int i, int j) {
		return a[i][j];	
	}
	
	void SetElemen(int i, int j, int x) {
		a[i][j]=x;
	}
	
	static void SalinLarikAkeB(MatrikInt A, MatrikInt B) {
		int x;
		for (int i=0; i<A.N; i++) {
			for(int j=0; j<A.M; j++) {
				x = A.GetElemen(i, j);
				B.SetElemen(i,j, x);
			}
			
		}
		B.tampilMatrik();
	}
	
	static MatrikInt PenjumlahanMatrik(MatrikInt A, MatrikInt B) {
		MatrikInt T = new MatrikInt();
		int x,y;
		
		for (int i=0; i<A.N; i++) {
			for(int j=0; j<A.M; j++) {
				x = A.GetElemen(i, j);
				y = B.GetElemen(i, j);
				
				T.SetElemen(i,j, x+y);
			}
			
		}
		return T;
	}
	
	static MatrikInt PenguranganMatrik(MatrikInt A, MatrikInt B) {
		MatrikInt T = new MatrikInt();
		int x,y;
		
		for (int i=0; i<A.N; i++) {
			for(int j=0; j<A.M; j++) {
				x = A.GetElemen(i, j);
				y = B.GetElemen(i, j);
				
				T.SetElemen(i,j, x-y);
			}
			
		}
		return T;
	}
	
	static MatrikInt PerkalianMatrik(MatrikInt A, MatrikInt B) {
		MatrikInt T = new MatrikInt();
		int x,y;
		
		
		for (int i=0; i<A.N; i++) {
			for(int j=0; j<A.M; j++) {
				
				
				T.SetElemen(i,j, 0);
			}
			
		}
		
		
		for (int i=0; i<A.N; i++) {
			for(int j=0; j<A.M; j++) {
				for(int k =0; k<B.M; k++) {
					
				}
				x = A.GetElemen(i, j);
				y = B.GetElemen(i, j);
				
				T.SetElemen(i,j, x-y);
			}
			
		}
		return T;
	}
	
	
	public static void main(String[] args) {
		MatrikInt A = new MatrikInt();
		MatrikInt B = new MatrikInt();
		MatrikInt C = new MatrikInt();
		
		A.isiMatrik();
		A.tampilMatrik();

		B.isiMatrik();
		B.tampilMatrik();
		
		C = C.PenjumlahanMatrik(A, B);
		System.out.println("Hasil Penjumlahan Matrik A dan B: ");
		C.tampilMatrik();
		
		C = C.PenguranganMatrik(A, B);
		System.out.println("Hasil Pengurangan Matrik A dan B: ");
		C.tampilMatrik();
		
	}
}
