import java.util.Scanner;

public class CicilanLaptop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y, sisaHarga, bungaBulan, cicilanPokok, totalCicilan;
        int z;
        System.out.println("Masukkan harga laptop (x): Rp. ");
        x = sc.nextDouble();
        System.out.println("Masukkan uang muka (y): Rp. ");
        y = sc.nextDouble();
        System.out.println("Masukkan lama cicilan/bulan (z): Rp. ");
        z = sc.nextInt();
        //Perhitungan
        sisaHarga = x - y;
        bungaBulan = 0.02* sisaHarga;
        cicilanPokok = sisaHarga / z;
        totalCicilan = cicilanPokok + bungaBulan;

        System.out.println("------");
        System.out.println("Sisa harga laptop : Rp. " + sisaHarga);
        System.out.println("Bunga per bulan (2%) : Rp. " + bungaBulan);
        System.out.println("Cicilan yang di bayar/bln : Rp. " + totalCicilan);

        sc.close();

    }
}