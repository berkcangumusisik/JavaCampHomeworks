public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());

        customerManager.Add();

    }
}
/**
 * Interface ler sadece imza içerirler.
 * Interface lerdeki metotlar public ve abstracttir.
 * Interface uygulayan sınıflar interface içerisindeki metotları override etmek zorundadır.
 * Interface implement eden sınıfların referansını tutabilir.
 * Class lar birden fazla interface i implement edebilir.
 */