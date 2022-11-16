public class Main {
    public static void main(String[] args) {
        //sayının bölenlerinin toplamı kendinin iki katı olan sayılar mükemmel sayılardır
        // mesela 6  1+2+3+6=12 6 nın iki katıdır 28 de mükemmel sayıdır
        int number = 28;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + 1;
            }
        }
        if (total == number) {
            System.out.println("Mükemmel sayıdır");
        } else {
            System.out.println("Mükemmel sayı değildir");

        }

    }
}
// Sayıyı 1 den başlayıp kendisi dahil olmayacak şekilde tüm sayılara böldürmek ve toplam almak mükemmel olup olmadığını bulma yoludur