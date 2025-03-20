// Clasa pentru reprezentarea unui cadou din wishlist
class Gift {
    private String name;
    private double price;
    private boolean isPurchased;

    public Gift(String name, double price) {
        this.name = name;
        this.price = price;
        this.isPurchased = false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public void purchaseGift() {
        if (!isPurchased) {
            isPurchased = true;
            System.out.println(name + " has been purchased.");
        } else {
            System.out.println(name + " was already purchased.");
        }
    }
}
