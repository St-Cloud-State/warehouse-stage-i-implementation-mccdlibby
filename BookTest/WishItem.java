public class WishItem {
    private Member member;  // Using Member instead of Client
    private Book book;  // Using Book instead of Product
    private int quantity;

    // Constructor
    public WishItem(Member member, Book book, int quantity) {
        this.member = member;
        this.book = book;
        this.quantity = quantity;
    }

    // Getter for member
    public Member getMember() {
        return member;
    }

    // Getter for book
    public Book getBook() {
        return book;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return member.getId() + " wished for " + book.getTitle() + " x " + quantity;
    }
}
