public class WishItem {
    private Client client;  // The client adding items to their wishlist
    private Product product;  // The product they are adding
    private int quantity;  // The quantity of the product desired

    // Constructor to initialize the WishItem
    public WishItem(Client client, Product product, int quantity) {
        this.client = client;
        this.product = product;
        this.quantity = quantity;
    }

    // Getters for the fields
    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return client.getId() + " wished for " + product.getName() + " x " + quantity;
    }
}