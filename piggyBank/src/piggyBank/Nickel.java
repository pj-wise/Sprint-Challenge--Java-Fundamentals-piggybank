package piggyBank;

public class Nickel extends AbstractCash {

    public Nickel(int count) {
        super(count);
        value = 0.05;
    }

    // Override default toString method
    @Override
    public String toString() {
        if (count > 1) {
            return "`" + count + " Nickels`";
        } else {
            return "`" + count + " Nickel`";
        }
    }
}