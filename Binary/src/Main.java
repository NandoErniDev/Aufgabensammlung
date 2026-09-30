import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bin = "";
        int rest = 0;
        int wert = 0;

        System.out.print("Enter a number: ");
        int input = Integer.parseInt(scanner.nextLine());
        wert = input / 2;

        while (wert != 0) {
            rest = input % 2;
            bin = (rest + bin);

            wert = input / 2;
            input = wert;
        }

        System.out.println(bin);
    }
}



