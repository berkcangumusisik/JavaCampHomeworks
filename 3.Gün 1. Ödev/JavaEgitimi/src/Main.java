public class Main {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);

        System.out.println("************");

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{10,20,30};
        sayilar1 = sayilar2;
        sayilar2[0] = 10000;
        System.out.println(sayilar1[0]);

        CreditManager creditManager = new CreditManager();
        creditManager.Hesapla();
        creditManager.Save();

        System.out.println("************");
        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.setTaxNumber("123456789");
        company.setCompanyName("Kodlama.io");
        company.setId(2);

        CustomerManager customerManager2 = new CustomerManager(new Person(), new TeacherCreditManager());
        Person person = new Person();
        person.setNationalIdentity("12345");



    }
}
