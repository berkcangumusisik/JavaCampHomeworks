public class ProductManager {
    public void Add(Product product) {
        System.out.println(product.getName() + " eklendi.");
    }

    public void Update(Product product) {
        System.out.println(product.getName() + " güncellendi.");
    }

    public void Delete(Product product) {
        System.out.println(product.getName() + " silindi.");
    }

    public void Add2(int id, String name, String description, double price, int stockAmount) {
        System.out.println(name + " eklendi.");
    }
}
