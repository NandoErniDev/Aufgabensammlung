import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            String[] forbiddenWords = {"viagra", "sex", "porno", "fick", "schlampe", "arsch"};
            int counter = 0;

            System.out.print("Kommentar: ");
            String comment = scanner.nextLine();

            for (int i = 0; i < forbiddenWords.length; i++) {
                if (comment.toLowerCase().contains(forbiddenWords[i])) {
                    counter++;
                }
            }

            if (counter > 0) {
                System.out.println("Dein Kommentar enthält " + counter + " verbotene(s) Wort/Wörter.");
            } else {
                System.out.println("Dein Kommentar ist in Ordnung.");
            }
        }
    }
}