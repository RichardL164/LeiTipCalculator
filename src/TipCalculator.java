import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.println("What is the tip percentage? ");
        int tipPercent = scan.nextInt();
        scan.nextLine();
        double totalTip = numPeople * tipPercent;

        double total = 0;
        double prices = 0;
        while (prices != -1) {
            total += prices;
            System.out.print("Enter a cost in dollar and cents (-1 to end): ");
            prices = scan.nextDouble();
        }

        System.out.println();
        System.out.println("Total bill before tip: " + total);
        System.out.println("Total percentage: " + tipPercent);
        System.out.println("Total tip: " + totalTip);


    }
}
