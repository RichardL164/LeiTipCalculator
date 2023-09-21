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

        double foodCostTotal = 0;
        double prices = 0;
        while (prices != -1) {
            foodCostTotal += prices;
            System.out.print("Enter a cost in dollar and cents (-1 to end): ");
            prices = scan.nextDouble();
        }

        double totalTip = foodCostTotal * (tipPercent / 100.00);
        double totalBill = totalTip + foodCostTotal;
        double beforeTip = foodCostTotal / numPeople;
        double tipPerPerson = totalTip / numPeople;
        double costPerPerson = totalBill / numPeople;

        System.out.println();
        System.out.println("Total bill before tip: " + foodCostTotal);
        System.out.println("Total percentage: " + tipPercent + "%");
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total bill with tip" + totalBill);
        System.out.println("Per person cost before tip: " + beforeTip);
        System.out.println("Tip per person: " + tipPerPerson);
        System.out.println("Total cost per person: " + costPerPerson);

    }
}
