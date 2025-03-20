import java.util.ArrayList;
import java.util.List;



// Clasa principală pentru testarea funcționalității
public class Main
{
    public static void main(String[] args) {
        Wishlist wishlist = new Wishlist("Alice");
        Gift gift1 = new Gift("Smartwatch", 199.99);
        Gift gift2 = new Gift("Wireless Earbuds", 79.99);

        wishlist.addGift(gift1);
        wishlist.addGift(gift2);

        wishlist.showWishlist();

        // Achiziționarea unui cadou
        gift1.purchaseGift();

        wishlist.remove(gift2);

        wishlist.showWishlist();
    }
}