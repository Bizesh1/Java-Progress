class Product{
    private int productId;
    private String productName;
    private double price;

    Product(int id, String name, double price){
        this.productId = id;
        this.productName = name;
        this.price = price;
    }

    public void display(){
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}
public class EcommerceSystem{
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 189999);
        Product product2 = new Product(2, "Smartphone", 62999);

        product1.display();
        product2.display();
    }
}