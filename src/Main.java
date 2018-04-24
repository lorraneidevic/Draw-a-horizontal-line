import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type the number (integer) of asterisks:");
        int numberOfAsterisks = scanner.nextInt();

        for(int i = 0; i < numberOfAsterisks; i++) {
            System.out.print("*");
        }
    }
}
