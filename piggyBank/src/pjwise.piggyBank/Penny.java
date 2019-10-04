package pjwise.piggyBank;

public class Penny extends AbstractMoney {

    public Penny(int count) {
        super(count);
        value = 0.01;
    }

    // Override default toString method
    @Override
    public String toString() {
        return "`" + count + "Penny(s)`";
    }
}