public class Main {
    public static void main(String[] args) {
        //java tip güvenli dildir.Yani değişkenin tipini belirtmek gerekir
        int sayi = 12; // int tam sayı tipini tutar -2 milyarla+2milyar arası tutar
        sayi = 131111111;  // 4 bytes yer kaplar

        byte number =12; //tamsayı tutar. -128 ile +127 arası
        number = 127; // 1 bytes yer kaplar

        //short ve long ta integer sayı tipleridir
        //float ve double ondalıklı sayı tipi tutar 12.5 gibi

        double sayi2 = 32.1;
        sayi2 = 12.5;

        //programcılar genelde int ve double ile çalışır
        //TC kimlik alanları long tutulur ama matematiksel işlem yapılmayacağı için String tutmak mantıklıdır


        //char tek tırnak içinde tek karakter tutar. 1 bytes yer tutar
        char karakter = 'A';

        //boolean veri tipi= true ya da false = doğru -yanlış, 0 ya da 1... 1 bytes yer tutar
        boolean dogruMu = false;







    }
}