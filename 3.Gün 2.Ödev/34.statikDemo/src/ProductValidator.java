public class ProductValidator {
    static {
        System.out.println("Static Yapıcı Blok Çalıştı");
    }

    public ProductValidator(){
        System.out.println("Yapıcı Blok Çalıştı");
    }
    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }
        else {
            return false;
        }

    }
}
