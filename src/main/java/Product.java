public class Product {
    private String name;
    private PriceAdapter price;

    public Product(String name, int price) {
        this.name = name;
        this.price = new PriceAdapter(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price.getDecimalValue();
    }

    public void setPrice(double price) {
        this.price.setDecimalValue(price);
    }

    public int getStoredPrice() {
        return price.getStoredValue();
    }
}
