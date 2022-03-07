package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueinStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;

    }

    public String toString() {
        return  name
                + " | "
                + "Price: $ "
                + String.format("%.2f", price)
                + " | "
                + "Quantity: "
                + quantity
                + " | "
                + "Total: $ "
                + String.format("%.2f", totalValueinStock());
    }
}
