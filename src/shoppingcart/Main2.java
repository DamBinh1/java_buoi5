package shoppingcart;

public class Main2 {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.setCustomer("Bình");
        cart.setCity("Hanoi");

        cart.addProduct("Tivi");
        cart.addProduct("Tủ lạnh");
        cart.addProduct("Máy Giặt");

        cart.calculateGrandTotal();

        System.out.println("Khách hàng: " + cart.getCustomer());
        System.out.println("Thành phố: " + cart.getCity());
        System.out.println("Danh sách sản phẩm: " + cart.getProductList());
        System.out.println("Tổng tiền: " + cart.getGrandTotal()+"$");
    }
}

