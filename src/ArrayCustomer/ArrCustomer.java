package ArrayCustomer;
import java.util.Scanner;

public class ArrCustomer {
    int N = 3;
    Customer[] a = new Customer[N];
    void IsiArray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.println("A[" + i + "]: ");
            Customer R = new Customer();
            R.BacaRec();
            a[i] = R;
        }
    }
    void TampilArray() {
        for (int i = 0; i < N; i++) {
            System.out.println("A[" + i + "]: ");
            a[i].TampilRec();
        }
    }
    void CekSaldo(int i) {
        a[i].TampilRec();
    }
    void Pengambilan(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah: ");
        double X = sc.nextDouble();
        a[i].saldo = a[i].saldo - X;
        a[i].TampilRec();
    }
    int Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Tampil Array ");
        System.out.println("2. Pengambilan ");
        System.out.println("3. Cek Saldo ");
        System.out.println("0. Keluar ");
        System.out.print("Pilihan anda ");
        int X = sc.nextInt();
        return X;
    }
    int Login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Logiiin... ");
        System.out.print("Norek: ");
        String norek = sc.next();
        boolean ketemu;
        int i;
        int ulang = 1;
        do {
            System.out.print("Pin: ");
            String pinku = sc.next();
            i = 0;
            ketemu = false;
            while ((ketemu == false) && (i < N)) {
                if ((a[i].norek.equals(norek)) &&
                    (a[i].pin.equals(pinku)))
                    ketemu = true;
                else
                    i++;
            }
            ulang++;
        } while ((ketemu == false) && (ulang <= 3));
        if (ketemu == true) {
            System.out.print("Selamat Datang: ");
            a[i].TampilRec();
            return i;
        } else
            return -1;
    }
    
    public static void main(String[] args) {
        ArrCustomer A = new ArrCustomer();
        int active; //index customer yang login
        A.IsiArray();
        active = A.Login();
        if (active != -1) {
            int pilih = A.Menu();
            while (pilih != 0) {
                switch (pilih) {
                case 1:
                    A.TampilArray();
                    break;
                case 2:
                    A.Pengambilan(active);
                    break;
                case 3:
                    A.CekSaldo(active);
                    break;
                case 0:
                    System.exit(pilih);
                    break;
                default:
                    System.out.print("Pilihan salah! ");

                }
                pilih = A.Menu();
            }
        }
    }
}