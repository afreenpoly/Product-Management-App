import java.util.List;

public class Main{
    public static void main(String[] args) {
        
        ProductService service = new ProductService();
        // service.addProduct(new Product("HP350", "Mouse", "black", 150));
        // service.addProduct(new Product("HP", "Laptop", "black", 50000));
        // service.addProduct(new Product("Realme", "Phone", "blue", 25000));
        // service.addProduct(new Product("Zook", "Speaker", "black", 3000));
        // service.addProduct(new Product("Boat ", "Headset", "blue", 1700));
        // service.addProduct(new Product("Rayban", "Specs", "black", 10000));



        System.out.println("List of Products");
        List<Product> prod= service.getAllProducts();
        for(Product p :prod){
            System.out.println(p);
        }
        System.out.println(" ");



        // System.out.println("Get one product by name");
        // System.out.println(service.getProductByName("Realme"));
        // System.out.println(" ");

        // System.out.println("Get Product by Colour");
        // List<Product> prod1 = service.getProductByColour("black");
        // for (Product p : prod1) {
        //     System.out.println(p);
        // }
        // System.out.println(" ");


        // System.out.println("Get Product Less than 15k");
        // List<Product> prod2 = service.getProductLessThan(15000);
        // for (Product p : prod2) {
        //     System.out.println(p);
        // }
        // System.out.println(" ");



    }
}