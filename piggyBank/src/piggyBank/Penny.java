package piggyBank;

public class Penny extends AbstractCash {

    public Penny(int count) {
        super(count);
        value = 0.01;
    }

    // Override default toString method
    @Override
    public String toString() {
        if (count > 1) {
            return "`" + count + " Pennies`";
        } else {
            return "`" + count + " Penny`";
        }
    }
}