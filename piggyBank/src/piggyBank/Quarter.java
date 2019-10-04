package piggyBank;

public class Quarter extends AbstractCash {

    // for empty tests

    public Quarter(int count) {
        super(count);
        value = 0.25;
    }

    // Override default toString method
    @Override
    public String toString() {
        if (count > 1) {
            return "`" + count + " Quarters`";
        } else {
            return "`" + count + " Quarter`";
        }
    }
}