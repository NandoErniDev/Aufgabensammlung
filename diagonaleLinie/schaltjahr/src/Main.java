import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prüfen, ob es sich um ein Schaltjahr handelt:");
        System.out.println("---------------------------------------------");
        boolean running = true;

        while (running) {
            System.out.print("Eingabe Jahr (q to quit): ");
            String input = scanner.nextLine();
            if (!input.equals("q")) {
                try {
                    int jahr = Integer.parseInt(input);
                    if (jahr % 4 == 0) {
                        if (jahr % 100 == 0) {
                            if (jahr % 400 == 0) {
                                System.out.println(jahr + " ist kein Schaltjahr!");
                            } else {
                                System.out.println(jahr + " ist ein Schaltjahr!");
                            }

                        } else {
                            System.out.println(jahr + " ist kein Schaltjahr!");
                        }

                    } else {
                        System.out.println(jahr + " ist kein Schaltjahr!");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                }

            } else {
                System.out.println("Programm erfolgreich beendet!");
                running = false;
            }
        }
    }
}