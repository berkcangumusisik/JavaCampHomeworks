public class Product {
    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
        System.out.println("Yapıcı blok çalıştı.");
    }
   public Product() {
        System.out.println("Yapıcı blok çalıştı.");
    }
    private  int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}

/**
 * Classlar özellik barındırır.
 * public her yerden erişilebilir demektir.
 * private sadece kendi classından erişilebilir demektir.
 * get ve set metotları ile private değişkenlere erişebiliriz.
 * get metotları değişkenin değerini döndürür. Okur
 * set metotları değişkenin değerini değiştirir. Yazar
 * this anahtar kelimesi classın kendisini ifade eder.
 */