public class Main {
    public static void main(String[] args) {
        char grade = 'h';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B': // iki kodda aynı çıktıyı alma
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");


        }

    }
}