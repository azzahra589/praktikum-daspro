import java.util.Scanner;

public class Flowchart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (Kamus/Novel/Lainya): ");
        String jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = sc.nextInt();

        double diskon = 0;

        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            if (jumlahBuku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.10;
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            if (jumlahBuku > 3) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            } else {
                diskon = 0.0;
            }
        }

        double jumlahDiskonPersen = diskon * 100;
        System.out.println("Diskon: " +(int)jumlahDiskonPersen + "%");
    }
}