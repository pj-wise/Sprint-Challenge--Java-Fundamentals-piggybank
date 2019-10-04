package pjwise.piggyBank;

public class Nickle extends AbstractMoney {

    public Nickle(int count) {
        super(count);
        value = 0.05;
    }

    // Override default toString method
    @Override
    public String toString() {
        return "`" + count + "Nickle(s)`";
    }
}