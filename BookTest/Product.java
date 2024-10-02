public class Product {
    private String id;
    private String name;
    private int quantity;
    private String manufacturer;
    private float price;

    // Constructor to initialize the Product
    public Product(String id, String name, int quantity, String manufacturer, float price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Getter for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    // Getter for price
    public float getPrice() {
        return price;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Setter for manufacturer
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Setter for price
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Manufacturer: " + manufacturer + ", Price: " + price;
    }
}