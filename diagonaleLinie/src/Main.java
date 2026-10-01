import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie lang soll die Linie sein? ");
        System.out.print("Deine Eingabe: ");

        int laenge = scanner.nextInt();

        for (int i = 0; i < laenge; i++) {
            for (int j = 0; j < laenge; j++) {
                if (i == j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}