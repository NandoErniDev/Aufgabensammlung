import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zahl eingeben: ");
        int zahl = Integer.parseInt(scanner.nextLine());
        int input = zahl;
        int sum = 0;

        while (zahl != 0){
            sum = sum + (zahl % 10);
            zahl = zahl / 10;
        }

        System.out.println("Die Quersumme von " + input + " ist: " + sum);
    }
}