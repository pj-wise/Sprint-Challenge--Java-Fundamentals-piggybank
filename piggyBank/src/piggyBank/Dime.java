package piggyBank;

public class Dime extends AbstractCash {

    // for empty tests

    public Dime(int count) {
        super(count);
        value = 0.10;
    }

    // Override default toString method
    @Override
    public String toString() {
        if (count > 1) {
            return "`" + count + " Dimes`";
        } else {
            return "`" + count + " Dime`";
        }
    }
}