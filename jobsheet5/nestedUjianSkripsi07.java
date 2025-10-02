import java.util.Scanner;

public class nestedUjianSkripsi07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan = "";

        System.out.println("--- Pendaftaran Ujian Skripsi ---");
        System.out.print("Apakah Anda bebas kompen? (Yes/No): ");
        String bebasKompen = sc.next().trim();

        if (bebasKompen.equalsIgnoreCase("Yes")) {
            System.out.print("Masukkan jumlah bimbingan dengan Pembimbing 1: ");
            int bimbinganP1 = sc.nextInt();

            System.out.print("Masukkan jumlah bimbingan dengan Pembimbing 2: ");
            int bimbinganP2 = sc.nextInt();

            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Selamat, Anda dapat mendaftar ujian skripsi.";
            } else {
                pesan = "Bimbingan belum mencukupi.";
            }
        } else {
            pesan = "Anda tidak bisa mendaftar ujian skripsi karena masih ada kompen.";
        }

        System.out.println(pesan);
        sc.close();
    }
}
