package piggyBank;

public abstract class AbstractCash {

    // fields
    // num of coin
    public int count;
    // value of coin
    public double value;

    public AbstractCash(int count) {
        this.count = count;
    }

    // Get the total value for each deposit
    public double getTotal() {
        return value * count;
    }
}