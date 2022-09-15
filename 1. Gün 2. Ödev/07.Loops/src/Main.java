public class Main {

    public static void main(String[] args) {
        // For Döngüsü
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("-------------");

        for (int i = 0; i < 10; i += 2) {
            System.out.println("i = " + i);

        }
        System.out.println("-------------");
        // While Döngüsü
        int i = 1;
        while (i < 10){
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("-------------");

        // Do While Döngüsü
        int j = 1;
        do {
            System.out.println("j = " + j);
            j+=2;
        }while (j < 10);
    }
}

/**
 for (başlangıç; bitiş; artış) {
    // kodlar
 }

 While Döngüsü
 while (koşul) {
        // kodlar
 }
 - While döngüsü koşul doğru olduğu sürece çalışır.
 - Eğer bir sayaç yoksa sonlandırma koşulu olmadığı için sonsuz döngüye girer.

 Do While Döngüsü
 do {
    // kodlar
 } while (koşul);
 - Do while döngüsü koşul doğru olsa da yanlış olsa da en az bir kere çalışır.
 */