public class RobotArm15 {
    public static void main(String[] args) {
        // Kondisi awal
        String nampanA = "Bintang";
        String nampanB = "Bulan";
        String nampanC = "Kosong";

        //Langkah 1: Ambil bola di nampan A, taruh di nampan C
        nampanC = nampanA;
        nampanA = "Kosong";
        System.out.println("Setelah Langkah 1: Nampan A = " + nampanA + ", NampanB = " + nampanB + ", NampanC = " + nampanC);

        //Langkah 2: Ambil bola di nampan B, taruh di nampan A
        nampanA = nampanB;
        nampanB = "Kosong";
        System.out.println("Setelah Langkah 2: Nampan A = " + nampanA + ", NampanB = " + nampanB + ", NampanC = " + nampanC);

        //Langkah 3: Ambil bola di nampan C, taruh di nampan B
        nampanB = nampanC;
        nampanC = "Kosong";
        System.out.println("Setelah Langkah 3: Nampan A = " + ", NampanB = " + nampanB + ", NampanC = " + nampanC);

        //Kesimpulan
        System.out.println("Kesimpulan: Pernyataan yang benar adalah (a) Kedua bola sudah bertukar tempat dan (e) Nampan C kosong");
    }
}