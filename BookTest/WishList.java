import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WishList implements Serializable {
    private List<WishItem> wishItems;

    public WishList() {
        wishItems = new ArrayList<>();
    }

    // Add item to the wishlist
    public void addToWishList(Member member, Book book, int quantity) {
        WishItem wishItem = new WishItem(member, book, quantity);
        wishItems.add(wishItem);
    }

    // Display the wishlist
    public void displayWishList() {
        if (wishItems.isEmpty()) {
            System.out.println("The wishlist is empty.");
        } else {
            for (WishItem wishItem : wishItems) {
                System.out.println(wishItem);
            }
        }
    }
}
