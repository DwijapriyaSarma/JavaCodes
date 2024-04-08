package Assignment;

public class product {
    private int productId;
    private String productName;
    private double price;
    private static double totalPrice;

    public product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        totalPrice+=price;
    }
    public static double getTotalPrice(){
        return product.totalPrice;
    }

}
