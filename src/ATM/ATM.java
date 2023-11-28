package ATM;

import java.util.Scanner;

public class ATM {
	double saldo = 200000;
	int tarik, setor;
//	String Nnasabah;
	
	void Cek_Saldo() {
		System.out.println("Sisa saldo anda : Rp. " + saldo);
	}
	
	void Tarik_Uang() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Masukan jumlah uang: Rp. ");
		tarik = sc.nextInt();
		
		if (tarik > saldo)
			System.out.println("Saldo anda tidak mencukupi");
		else
			ambil();
			System.out.println("Anda telah menarik sebesar Rp. " + tarik);
			System.out.println("Sisa saldo anda sebesar Rp. " + saldo);
	}
	
	void Setor_Uang() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Jumlah uang yang bisa dimasukkan hanya pecahan Rp 50.000 dan Rp 100.000");
		System.out.println("Masukan jumlah uang: Rp. ");
		setor = sc.nextInt();
		
		if (setor < 50000)
			System.out.println("Jumlah yang bisa dimasukkan minimal sebesar Rp 50.000");
		else
			System.out.println("Anda telah menyetorkan sebesar Rp. " + setor);
			tabung();
			System.out.println("Jumlah saldo anda sebesar Rp. " + saldo);
	}
	
	//fuction
	void ambil() {
		saldo -= tarik;
	}
	
	void tabung() {
		saldo += setor;
	}

}
