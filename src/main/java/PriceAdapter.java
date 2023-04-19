public class PriceAdapter {
    private int value;

    public PriceAdapter(int value) {
        this.value = value;
    }

    public double getDecimalValue() {
        return value / 100.0;
    }

    public void setDecimalValue(double decimalValue) {
        this.value = (int) (decimalValue * 100);
    }
}
