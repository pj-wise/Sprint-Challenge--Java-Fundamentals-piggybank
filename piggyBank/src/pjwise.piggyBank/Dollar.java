package pjwise.piggyBank;

public class Dollar extends AbstractMoney {

    public Dollar(int count) {
        super(count);
        value = 1;
    }

    // Override default toString method
    @Override
    public String toString() {
        return "`$" + count + "`";
    }
}
