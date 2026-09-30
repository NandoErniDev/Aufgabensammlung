import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib Zahlen kommagetrennt ein (z.B. 4,11,2,-3):");
        String eingabe = scanner.nextLine();

        String[] eingabeArray = eingabe.split(",");

        int[] zahlen = new int[eingabeArray.length];
        for (int i = 0; i < eingabeArray.length; i++) {
            zahlen[i] = Integer.parseInt(eingabeArray[i]);
        }
        int[] ergebnis = sumUp(zahlen);

        System.out.println("Ergebnis: " + Arrays.toString(ergebnis));

        scanner.close();
    }

    static int[] sumUp(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int[] result = new int[arr.length];

        result[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result[i] = result[i - 1] + arr[i];
        }

        return result;
    }
}