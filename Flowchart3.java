import java.util.Scanner;

public class Flowchart3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan merek (Converse?Sketchers/Nike): ");
        String merk = sc.nextLine();
        System.out.print("Masukkan kategori: ");
        String kategori = sc.nextLine();
        System.out.print("Masukkan ukuran: ");
        int ukuran = sc.nextInt();

        int harga = 0;

        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip on")) {
                harga = 800000;
            } else {
                harga = 1200000;
            }
        } else if (merk.equalsIgnoreCase("Skitchers")) {
            if (kategori.equalsIgnoreCase("Women")) {
                harga = 1000000;
            } else {
                harga = 1800000;
            }
        } else {
            if (kategori.equalsIgnoreCase("Kids")) {
                harga = 750000;
            } else {
                harga = 1500000;
            }
        }
        System.out.print("Harga: " + harga);
    }
}
