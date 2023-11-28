package ARRAY_OF_RECORD;

import java.util.Scanner;

public class Barang {
	
	String nama;
	String jenis;
	int harga;
	int stok;
	
	void inputBarang() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nama "); nama = sc.next();
		System.out.println("Jenis "); jenis = sc.next();
		System.out.println("Harga "); harga = sc.nextInt();
		System.out.println("Stok "); stok = sc.nextInt();
	}
	
	void DisplayBarang () {
		System.out.println("Nama: " + nama);
		System.out.println("Jenis: "+ jenis);
		System.out.println("Harga: "+ harga);
		System.out.println("Stok: "+ stok);
	}
	
	public static void main(String args[]) {
		int N = 5;
		Barang[] DaftarBarang = new Barang[N];
		
		Barang x;
		Scanner asc = new Scanner(System.in);
		for(int i=0; i<N; i++) {
			x = new Barang();
			x.inputBarang();
			DaftarBarang[i] = x;
		}
		
		
	}
}
