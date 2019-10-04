package pjwise.piggyBank;

public class Quarter extends AbstractMoney {

    public Quarter(int count) {
        super(count);
        value = 0.25;
    }

    // Override default toString method
    @Override
    public String toString() {
        return "`" + count + "Quarter(s)`";
    }
}