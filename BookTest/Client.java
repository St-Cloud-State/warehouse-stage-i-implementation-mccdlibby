import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    private String id;
    private String name;
    private List<WishItem> wishlist;

    // Constructor to initialize the Client
    public Client(String id, String name) {
        this.id = id;
        this.name = name;
        this.wishlist = new ArrayList<>();
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to add a product to the wishlist
    public boolean addProductToWishlist(WishItem wishItem) {
        return wishlist.add(wishItem);
    }

    // Method to retrieve the wishlist
    public Iterator<WishItem> getWishlist() {
        return wishlist.iterator();
    }

    // AddClient method (parameters address and phone are placeholders, could be included if necessary)
    public void addClient(String name, String address, String phone) {
        this.name = name;
        // Assume we handle address and phone elsewhere
    }

    @Override
    public String toString() {
        return "Client ID: " + id + ", Name: " + name;
    }
}