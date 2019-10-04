package pjwise.piggyBank;

public class Dime extends AbstractMoney {

    public Dime(int count) {
        super(count);
        value = 0.10;
    }

    // Override default toString method
    @Override
    public String toString() {
        return "`" + count + "Dime(s)`";
    }
}