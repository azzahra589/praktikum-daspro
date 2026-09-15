import java.util.Scanner;

public class Sistem Parker {

    public static void mian(Sting[] args) {
        Scanner input = new Scanner(System.in) ;

        //input jenis kendaraan dari pengguna
        System.out.println("Masukkan jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = input.nextLine().trim();
        
        // Pengecekan kondisi dan perhitungan biaya 
        if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            int biaya = 5000;
            System.out.println("\n--- Detail Pembayaran ---");
            System.out.println("Jenis Kendaraan : Mobil");
            System.out.println("Total Biaya     : Rp " + biaya);
        }else if (jenisKendaraan.equalsIgnoreCase("motor")) {
            int biaya = 3000;
            System.out.println("\n--- Detail Pembayaran ---");
            System.out.println("Jenis Kendaraan : Motor");
            System.out.println("Total Biaya     : Rp " + biaya);
        } else {
            System.out.println("\n jenis kendaraan tidak valid!");
        }
        input.close();
    }
}