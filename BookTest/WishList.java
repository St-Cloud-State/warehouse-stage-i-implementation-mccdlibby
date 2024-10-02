import java.io.*;
import java.util.*;

public class WishList implements Serializable {
    private List<WishItem> wishItems;  // A list of all the WishItems

    // Constructor to initialize an empty wishlist
    public WishList() {
        wishItems = new ArrayList<>();
    }

    // Add an item to the wishlist
    public void addToWishList(Client client, Product product, int quantity) {
        WishItem wishItem = new WishItem(client, product, quantity);
        wishItems.add(wishItem);
    }

    // Display all wishlist items
    public void displayWishList() {
        if (wishItems.isEmpty()) {
            System.out.println("The wishlist is empty.");
        } else {
            for (WishItem wishItem : wishItems) {
                System.out.println(wishItem);
            }
        }
    }

    // Serialize the wishlist to a file
    public void saveWishList(String filename) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filename))) {
            output.writeObject(this);
            System.out.println("Wishlist saved successfully.");
        } catch (IOException ioe) {
            System.out.println("Error saving wishlist: " + ioe.getMessage());
        }
    }

    // Deserialize and load the wishlist from a file
    public static WishList loadWishList(String filename) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename))) {
            return (WishList) input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading wishlist: " + e.getMessage());
            return null;
        }
    }
}