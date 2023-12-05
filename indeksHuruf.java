import java.util.Scanner;

public class indeksHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nilai: ");
        double nilai = scanner.nextDouble();

        char indeks;

        if (nilai >= 75) {
            indeks = 'A';
        } else if (nilai >= 65) {
            indeks = 'B';
        } else if (nilai >= 55) {
            indeks = 'C';
        } else if (nilai >= 40) {
            indeks = 'D';
        } else {
            indeks = 'E';
        }

        System.out.println("Indeks = " + indeks);

        scanner.close();
    }
}
