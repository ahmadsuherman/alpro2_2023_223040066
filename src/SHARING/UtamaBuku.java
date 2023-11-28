package SHARING;

import java.util.Scanner;

public class UtamaBuku {
	
	
	static Scanner sc = new Scanner(System.in);
	
	static Buku [] arrBuku = new Buku[3];
	
	
	static void input() {
		String judul, penulis, penerbit;
		int harga;
		
		for(int i=0; i< arrBuku.length; i++)
		{
			System.out.print("Masukkan judul"); judul = sc.next();
			System.out.print("Masukkan penulis"); penulis = sc.next();
			System.out.print("Masukkan penulis"); penerbit = sc.next();
			System.out.print("Masukkan harga"); harga = sc.nextInt();
			
			arrBuku[i] = new Buku();
			arrBuku[i].inputNilai(judul, penulis, penerbit, harga);
		}
	}
	
	static void tampil()
	{
		for(int i=0; i<arrBuku.length; i++)
		{
			arrBuku[i].tampilNilai();
		}
	}
	
	static void cariBuku()
	{
		String cari;
		String status = "Data tidak ditemukan";
		System.out.print("Judul yang dicari "); cari = sc.next();
		
		for(int i =0; i<arrBuku.length; i++) {
			if(cari.equalsIgnoreCase(arrBuku[i].getJudul())) {
				status = "Data ditemukan pada array ke "+ i;
				break;
			}
		}
		
		System.out.print(status);
	}
	
	public static void main(String args[]) {
		input();
		tampil();
		cariBuku();
	}
	
}
