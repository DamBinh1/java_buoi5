package company;

public class Product {
    private int id;
    private String productName;
    private int qty;
    private double price;

    public Product(int id, String productName, int qty, double price) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }

    public String checkQty() {
        if (this.qty > 0) {
            return "còn hàng";
        } else {
            return"hết hàng";
        }
    }

}


