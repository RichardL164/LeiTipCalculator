import java.util.*;
public class TipCalculator {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList(); //creates list
        Scanner scan = new Scanner(System.in); //creates scanner
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt(); //gets number of people
        scan.nextLine();
        System.out.print("What is the tip percentage? ");
        int tipPercent = scan.nextInt(); //gets tip percentage
        scan.nextLine();

        double foodCostTotal = 0;
        double prices = 0;
        while (prices != -1) { //loop goes until user enters -1
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
        if (code.equals("rome")) {
            System.out.println("Congratulations! You get a 10% discount!");
        } else {
            System.out.println("Sorry, that is not the discount code.");
        }
        System.out.println("--------------------");
        System.out.println("Total bill before tip and discount: " + foodCostTotal);
        System.out.println("Total percentage: " + tipPercent + "%");
        double totalTip = (int) ((foodCostTotal * (tipPercent / 100.00)) * 100) / 100.0; //gets total tip the customers need to pay
        if (code.equals("rome")) {
            totalTip *= 0.9; //10% discount off total bill
        }
        double totalBill = (int) ((totalTip + foodCostTotal) * 100) / 100.0; //total bill customer needs to pay
        if (code.equals("rome")) {
            totalBill *= 0.9; //10% discount off total bill
        }
        double beforeTip = (int) (foodCostTotal / numPeople * 100) / 100.0;
        if (code.equals("rome")) {
            beforeTip *= 0.9; //10% discount off total bill
        }
        double tipPerPerson = (int) (totalTip / numPeople * 100) / 100.0; //how much every person needs to tip
        if (code.equals("rome")) {
            tipPerPerson *= 0.9; //10% discount off total bill
        }
        double costPerPerson = (int) (totalBill / numPeople * 100) / 100.0; //how much everyone needs to pay

        System.out.println("Total tip: " + (int) (totalTip * 100) / 100.0);
        System.out.println("Total bill with tip: " + (int) (totalBill * 100) / 100.0);
        System.out.println("Per person cost before tip: " + (int) (beforeTip * 100) / 100.0);
        System.out.println("Tip per person: " + (int) (tipPerPerson * 100) / 100.0);
        System.out.println("Total cost per person: " + costPerPerson);
        System.out.println("Items ordered: ");
        System.out.println("--------------------");
        for (int i = 0; i <arr.size(); i++) {
            System.out.println(arr.get(i)); // prints out each item in the list
        }

    }
}
