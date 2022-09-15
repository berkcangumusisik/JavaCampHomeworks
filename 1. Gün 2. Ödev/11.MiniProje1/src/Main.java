public class Main {

    public static void main(String[] args) {
        int number = 2;
        int remiender = number % 2;
        boolean isPrime = true;
        if (number == 1) {
            System.out.println("Sayı Asal Değildir.");
            return;
        }
        if (number < 1){
            System.out.println("Geçersiz Sayı");
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }
    }
}

/**
 * Asal sayı bulma programı
 */

