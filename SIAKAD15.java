import java.util.Scanner;

public class SIAKAD15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        String kelas = sc.nextLine();
        System.out.println("Masukkan nomor absen: ");
        int absen = sc.nextInt();

        // Input nilai
        System.out.println("Masukkan nilai kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian: ");
        double nilaiUjian = sc.nextDouble();

        // Perhitungan nilai akhir
        double nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        // Penentuan nilai huruf dan kualifikasi
        String nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        }  else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        }  else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        }  else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        }  else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        }  else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        }  else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        //Output hasil
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

        sc.close();
    }
}