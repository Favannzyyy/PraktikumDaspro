import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah Anda memiliki KTM? (Yes/No): ");
        String kartu = sc.next().trim();

        if (kartu.equalsIgnoreCase("Yes")) {
            System.out.println("Anda bisa meminjam buku.");
        } else {
            System.out.println("Anda tidak bisa meminjam buku. Harap membuat KTM terlebih dahulu.");
        }

        System.out.print("Apakah Anda memiliki akun wifi kampus? (Yes/No): ");
        String wifi = sc.next().trim();

        if (wifi.equalsIgnoreCase("Yes")) {
            System.out.println("Anda bisa mengakses wifi kampus.");
        } else {
            System.out.println("Anda tidak bisa mengakses wifi. Harap registrasi akun dulu.");
        }

        sc.close();
    }
}
