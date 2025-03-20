import java.util.ArrayList;
import java.util.List;

// Clasa pentru Wishlist-ul unui utilizator
class Wishlist {
    private String owner;
    private List<Gift> gifts;

    public Wishlist(String owner) {
        this.owner = owner;
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
        System.out.println(gift.getName() + " has been added to " + owner + "'s wishlist.");
    }
    public void remove(Gift gift) {
        gifts.remove(gift);
        System.out.println(gift.getName() + " has been removed from " + owner + "'s wishlist.");
    }

    public void showWishlist() {
        System.out.println(owner + "'s Wishlist:");
        for (Gift gift : gifts) {
            System.out.println("- " + gift.getName() + " ($" + gift.getPrice() + ") " + (gift.isPurchased() ? "[Purchased]" : "[Available]"));
        }
    }
}
