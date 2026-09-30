import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Erste Zahl: ");
        int zahl1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Zweite Zahl: ");
        int zahl2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Z \tQ \t ZQ");

        for (; zahl1 <= zahl2; zahl1++){

            int zahl =  zahl1;
            int sum = 0;

            while (zahl != 0){
                sum = sum + (zahl % 10);
                zahl = zahl / 10;
            }
            if (zahl1 % sum == 0){
                System.out.println(zahl1 + "\t" + sum + "\t" + zahl1 / sum);
            }
        }
    }
}