public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", "Asus Laptop", 15000, 10, "Siyah");

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Mouse");
        product2.setDescription("Asus Mouse");
        product2.setPrice(150);
        product2.setStockAmount(100);
        product2.setRenk("Siyah");
        System.out.println(product1.getName());

        ProductManager productManager = new ProductManager();
        productManager.Add(product1);
        productManager.Update(product1);
        productManager.Delete(product1);



    }
}
