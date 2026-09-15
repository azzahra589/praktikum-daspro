import java.util.Scanner;

public class KategoriUsia15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan usia Anda: ");
        int usia = input.nextInt();

        //Validasi input angka positif/non-negatif
        if (usia < 0) {
            System.out.println("Error: Usia tidak valid! Usia harus berupa angka positif.");
        } else if (usia <= 12) {
            System.out.println("Kategori Usia: Anak");
        } else if (usia <= 19) {
            System.out.println("Kategori Usia: Remaja");
        } else if (usia <= 64) {
            System.out.println("Kategori Usia: Dewasa");
        } else {
            System.out.println("Kategori Usia: Lansia");
        }   

        input.close();
    }
}