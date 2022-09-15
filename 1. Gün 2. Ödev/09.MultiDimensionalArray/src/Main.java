public class Main {

    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kırıkkale";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Mardin";

        for (int i = 0; i < sehirler.length; i++) {
            System.out.println("**********");
            for (int j = 0; j < sehirler[i].length; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}

/**
 * Çok boyutlu diziler
 * VeriTürü[][] diziAdi = new VeriTürü[boyut1][boyut2];
 * VeriTürü[][] diziAdi = {{veri1,veri2,veri3},{veri4,veri5,veri6},{veri7,veri8,veri9}};
 */
