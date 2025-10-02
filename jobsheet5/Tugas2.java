import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Program Pengecekan Bilangan Ganjil/Genap ---");
        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah GENAP.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah GANJIL.");
        }

        sc.close();
    }
}
