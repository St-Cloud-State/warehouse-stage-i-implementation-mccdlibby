public class WishListTester {
    public static void main(String[] args) {
        // Initialize members
        Member member1 = new Member("m1");
        Member member2 = new Member("m2");

        // Initialize books (which are acting as products in the wishlist)
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "b1");
        Book book2 = new Book("1984", "George Orwell", "b2");

        // Initialize the wishlist
        WishList wishList = new WishList();

        // Add items to the wishlist
        wishList.addToWishList(member1, book1, 1);
        wishList.addToWishList(member2, book2, 2);

        // Display the wishlist
        wishList.displayWishList();
    }
}
