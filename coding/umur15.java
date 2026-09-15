import java.util.Scanner; 

public class umur15 {
    public static void main (String[] args)  {
// Deklarasi scanner
        Scanner sc = new Scanner(System.in);


        System.out.print("Masukan umur");
        float usia = sc.nextInt();

        if (usia <= 0){
            System.out.println("input tidak valid. usia harus berupa angka positif.");
        } else if (usia <= 12){
            System.out.println("Kategori usia: anak");
        } else if (usia <= 19){
            System.out.println("Kategori usia: Remaja");
        } else if (usia <= 64){
            System.out.println("Kategori dewasa");
        } else {
            System.out.println("kategori usia: Lansia");
        }
        sc.close();
    }
}
