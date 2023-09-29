import java.util.*;
public class TipCalculator {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("What is the tip percentage? ");
        int tipPercent = scan.nextInt();
        scan.nextLine();

        double foodCostTotal = 0;
        double prices = 0;
        while (prices != -1) {
            foodCostTotal += prices;
            System.out.print("Enter a cost in dollar and cents (-1 to end): ");
            prices = scan.nextDouble();
            scan.nextLine();
            if (prices == -1) {
                break;
            }
            System.out.print("Enter the food: ");
            String food = scan.nextLine();

            arr.add(food);

        }

        System.out.println("Do you know our discount code for the day? Hint: All roads lead to ____");
        String code = scan.nextLine();

        double totalTip = (int) (foodCostTotal * (tipPercent / 100.00) * 100) / 100.0;
        double totalBill = (int) ((totalTip + foodCostTotal) * 100) / 100.0;
        if (code.equals("rome")) {
            System.out.println("Congratulations! You get a 10% discount!");
            totalBill *= 0.9;
        } else {
            System.out.println("Sorry, that is not the discount code.");
        }
        double beforeTip = (int) (foodCostTotal / numPeople * 100) / 100.0;
        double tipPerPerson = (int) (totalTip / numPeople * 100) / 100.0;
        double costPerPerson = (int) (totalBill / numPeople * 100) / 100.0;

        System.out.println("--------------------");
        System.out.println("Total bill before tip and discount: " + foodCostTotal);
        System.out.println("Total percentage: " + tipPercent + "%");
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total bill with tip: " + totalBill);
        System.out.println("Per person cost before tip: " + beforeTip);
        System.out.println("Tip per person: " + tipPerPerson);
        System.out.println("Total cost per person: " + costPerPerson);
        System.out.println("Items ordered: ");
        System.out.println("--------------------");
        for (int i = 0; i <arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
}
