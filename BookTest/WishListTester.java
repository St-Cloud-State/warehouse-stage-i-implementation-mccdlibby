public class WishListTester {
    public static void main(String[] args) {
        // Initialize clients and products
        Client client1 = new Client("John Doe");
        Client client2 = new Client("Jane Smith");

        Product product1 = new Product("P1", "Laptop");
        Product product2 = new Product("P2", "Smartphone");

        // Initialize wishlist
        WishList wishList = new WishList();

        // Add items to the wishlist
        wishList.addToWishList(client1, product1, 1);
        wishList.addToWishList(client2, product2, 2);

        // Display the wishlist
        wishList.displayWishList();

        // Save the wishlist to a file
        wishList.saveWishList("wishlist_data.dat");

        // Load the wishlist back from the file
        WishList loadedWishList = WishList.loadWishList("wishlist_data.dat");
        if (loadedWishList != null) {
            System.out.println("Loaded wishlist:");
            loadedWishList.displayWishList();
        }
    }
}
