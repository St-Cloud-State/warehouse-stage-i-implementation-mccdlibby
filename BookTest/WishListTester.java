public class WishListTester {

    public static void main(String[] args) {
        // Create Clients
        Client client1 = new Client("C1", "Alice");
        Client client2 = new Client("C2", "Bob");

        // Create Products
        Product product1 = new Product("P1", "Laptop", 5, "TechCo", 999.99f);
        Product product2 = new Product("P2", "Smartphone", 10, "PhoneInc", 499.99f);

        // Create and test WishItem
        WishItem wishItem1 = new WishItem(client1, product1, 2);
        WishItem wishItem2 = new WishItem(client2, product2, 1);

        System.out.println(wishItem1);  // Should print: C1 wished for Laptop x 2
        System.out.println(wishItem2);  // Should print: C2 wished for Smartphone x 1

        // Add items to client wishlists
        client1.addProductToWishlist(wishItem1);
        client2.addProductToWishlist(wishItem2);

        // Display client's wishlist
        System.out.println("Client 1's wishlist:");
        Iterator<WishItem> client1Wishlist = client1.getWishlist();
        while (client1Wishlist.hasNext()) {
            System.out.println(client1Wishlist.next());
        }

        System.out.println("Client 2's wishlist:");
        Iterator<WishItem> client2Wishlist = client2.getWishlist();
        while (client2Wishlist.hasNext()) {
            System.out.println(client2Wishlist.next());
        }

        // Create and test WishList
        WishList wishList = new WishList();
        wishList.addToWishList(client1, product1, 2);
        wishList.addToWishList(client2, product2, 1);

        System.out.println("Wishlist before saving:");
        wishList.displayWishList();  // Should display the wishlist with the above items

        // Save and load the wishlist
        wishList.saveWishList("wishlist.ser");
        WishList loadedWishList = WishList.loadWishList("wishlist.ser");

        System.out.println("Wishlist after loading:");
        if (loadedWishList != null) {
            loadedWishList.displayWishList();  // Should display the same items after loading
        }
    }
}