public class Main {

    public static void main(String[] args) {
	     String[] students = new String[3];
         students[0] = "Berkcan";
         students[1] = "Şevval";
         students[2] = "Nurana";

         for(int i = 0; i < students.length; i++){
             System.out.println(students[i]);
         }

         System.out.println("**********");
         for(String student : students){
                System.out.println(student);
         }
    }
}
/**
 * Yazılımda dizilerin indeksi 0'dan başlar.
 * Dizinin ilk elemanı 0. indeksteki elemandır.
 * veriTürü[] diziAdı = new veriTürü[diziBoyutu]; şeklinde dizi tanımlanır.
 * Dizilerde eleman sayısını aşan indekslere erişmek istendiğinde ArrayIndexOutOfBoundsException hatası alınır.
 */