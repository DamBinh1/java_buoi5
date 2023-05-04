package shoppingcart;
import java.util.ArrayList;

public class Cart {
    private int id;
    private String customer;
    private double grandTotal=1000.0;
    private ArrayList<String> productList;
    private String city;

    // Constructor không tham số
    public Cart() {
        productList = new ArrayList<String>();
    }

    // Thêm 1 sản phẩm vào giỏ hàng
    public void addProduct(String product) {
        productList.add(product);
    }

    // Xoá 1 sản phẩm khỏi giỏ hàng
    public void removeProduct(String product) {
        productList.remove(product);
    }

    // Tính tổng tiền
    public void calculateGrandTotal() {
        if (city.equals("Hanoi") || city.equals("Ho Chi Minh City")) {
            grandTotal += grandTotal * 0.01;
        } else {
            grandTotal += grandTotal * 0.02;
        }
    }

    // Getter và setter cho các thuộc tính
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public ArrayList<String> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<String> productList) {
        this.productList = productList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}