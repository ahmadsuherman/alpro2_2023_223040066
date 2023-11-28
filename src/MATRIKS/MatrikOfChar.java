package MATRIKS;

import java.util.Scanner;

public class MatrikOfChar {
	int N=2;
	int M=3;
	int[][] a = new int[N][M];
	
	void isiMatrik() {
		Scanner sc = new Scanner(System.in);
		
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
