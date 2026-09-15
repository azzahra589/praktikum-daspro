import java.util.Scanner;

public class BiayaCetak15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        double biayaCetak, totalBiaya;
        final double BIAYA_PER_LEMBAR = 500;
        final double BIAYA_PENJILIDAN = 5000;
        System.out.println("Masukkan jumlah lembar dokumen (x): ");
        x = sc.nextInt();

        //Perhitungan
        biayaCetak = x * BIAYA_PER_LEMBAR;
        totalBiaya = biayaCetak + BIAYA_PENJILIDAN;

        System.out.println("-----");
        System.out.println("Biaya cetak (" + x + " lembar) : Rp. " + biayaCetak);
        System.out.println("Biaya penjilidan : Rp. " + BIAYA_PENJILIDAN);
        System.out.println("Total biaya keseluruhan : Rp. " + totalBiaya);

        sc.close();

    }
}