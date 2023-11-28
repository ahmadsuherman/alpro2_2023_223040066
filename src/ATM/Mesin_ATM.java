package ATM;

import java.util.Scanner;

public class Mesin_ATM {
	int N=1;
	int pilihan;
	ATM x = new ATM();
	
	void Halaman_Utama() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Selamat datang");
			System.out.println("Silakan pilih opsi yang anda inginkan: ");
			System.out.println("1. Cek Saldo");
			System.out.println("2. Setor Tunai");
			System.out.println("3. Tarik Tunai");
			System.out.println("4. Keluar");
			pilihan = sc.nextInt();
			
			switch(pilihan) {
			case 1:
				x.Cek_Saldo();
				break;
			case 2:
				x.Setor_Uang();
				break;
			case 3:
				x.Tarik_Uang();
				break;
			case 4:
				System.out.println("Terima kasih");
				System.exit(0);
				break;
			 default:
                 System.out.println("Pilihan tidak valid, silakan coba lagi.");
			}
		}
		
	}

	public static void main(String[] args) {
		Mesin_ATM A = new Mesin_ATM();
		A.Halaman_Utama();
		
	}

}