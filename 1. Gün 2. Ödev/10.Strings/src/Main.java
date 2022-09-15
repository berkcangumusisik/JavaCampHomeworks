public class Main {

    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        System.out.println(message);
        System.out.println("Eleman Sayısı : " + message.length());
        System.out.println("5. Eleman : " + message.charAt(4));
        System.out.println(message.concat(" yaşasın"));
        System.out.println(message.startsWith("Bugün"));
        System.out.println(message.endsWith("güzel"));
        char[] karakterler = new char[5];
        message.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));
        System.out.println(message.replace(" ", "-"));
        System.out.println(message.substring(2,5));
        for (String kelime : message.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }

}

/**
 * .length() metodu ile String ifadelerin uzunluğunu öğrenebiliriz.
 * .charAt() metodu ile String ifadelerin belirli bir indeksindeki karakterini öğrenebiliriz.
 * .concat() metodu ile String ifadelerin sonuna yeni bir ifade ekleyebiliriz.
 * .startsWith() metodu ile String ifadelerin belirli bir ifade ile başlayıp başlamadığını öğrenebiliriz.
 * .endsWith() metodu ile String ifadelerin belirli bir ifade ile bitip bitmediğini öğrenebiliriz.
 * .getChars() metodu ile String ifadelerin belirli bir aralığını başka bir karakter dizisine kopyalayabiliriz.
 * .indexOf() metodu ile String ifadelerin belirli bir ifadenin ilk indeksini öğrenebiliriz.
 * .lastIndexOf() metodu ile String ifadelerin belirli bir ifadenin son indeksini öğrenebiliriz.
 * .replace() metodu ile String ifadelerin belirli bir ifadeyi başka bir ifade ile değiştirebiliriz.
 * .substring() metodu ile String ifadelerin belirli bir aralığını başka bir String ifadesine kopyalayabiliriz.
 * .split() metodu ile String ifadeleri belirli bir ifadeye göre parçalayabiliriz.
 * .toLowerCase() metodu ile String ifadelerin tüm karakterlerini küçük harfe çevirebiliriz.
 * .toUpperCase() metodu ile String ifadelerin tüm karakterlerini büyük harfe çevirebiliriz.
 * .trim() metodu ile String ifadelerin başındaki ve sonundaki boşlukları kaldırabiliriz.
 */