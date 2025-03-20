import java.util.ArrayList;
import java.util.List;

// Clasa pentru reprezentarea unui retailer
class Retailer {
    private String name;
    private int stock; // cantitatea de produse disponibile
    private String location;

    public Retailer(String name, int stock, String location) {
        this.name = name;
        this.stock = stock;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public String getLocation() {
        return location;
    }

    public void reduceStock() {
        if (stock > 0) {
            stock--;
            System.out.println("One item sold by " + name + ". Remaining stock: " + stock);
        } else {
            System.out.println(name + " is out of stock for this product.");
        }
    }

    public boolean isInStock() {
        return stock > 0;
    }
}
