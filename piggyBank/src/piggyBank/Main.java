package piggyBank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    // format
    static DecimalFormat fp = new DecimalFormat("$###,###.00");

    static double total = 0;

    public static void main(String[] args) {

        ArrayList<AbstractCash> piggyBank = new ArrayList<>();

        // new additions
        piggyBank.add(new Quarter(1));
        piggyBank.add(new Dime(1));
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar(1));
        piggyBank.add(new Penny(10));

        // Print all deposits
        piggyBank.forEach((deposit) -> System.out.println(deposit));

        // Get the total amount of all deposits
        for (AbstractCash deposits : piggyBank) {
            total += deposits.getTotal();
        }
        System.out.println("The piggy bank holds " + fp.format(total));
    }
}