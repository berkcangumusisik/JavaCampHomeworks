public class Main {

    public static void main(String[] args) {
        char harf = 'A';
        switch (harf) {
            case 'A':
            case 'U':
            case 'I':
            case 'O':
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("İnce Sesli Harf");
                break;
        }

    }
}
