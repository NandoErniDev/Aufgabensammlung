import java.util.Scanner;
void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie viele Kilometer möchtest du rennen: ");
        int anzahlKm = Integer.parseInt(scanner.nextLine());

        if (anzahlKm >= 42) {
            System.out.println(anzahlKm + "km? Das schaffst du nicht!");
        } else {
            int bahnrunden = anzahlKm * 1000 / 400;
            System.out.println("Das sind " + bahnrunden + " Runden. Bist du bereit? (y/n)");

            String bereit = scanner.nextLine();

            if (bereit.equals("y")) {
                for (int i = 1; i <= bahnrunden; i++) {
                    System.out.println("Du läufst Runde " + i);
                }
                System.out.println("Du hast es geschafft! Du bist " + bahnrunden + " Runden gelaufen.");
            }
        }
    }
