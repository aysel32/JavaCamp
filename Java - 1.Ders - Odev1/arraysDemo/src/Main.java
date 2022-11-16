public class Main {
    public static void main(String[] args) {
        String ogrenci1="Aysel";
        String ogrenci2="Nisa";
        String ogrenci3="Ela";
        String ogrenci4="Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("**********");

        //indexler sıfırdan başlar
        String[] ogrenciler = new String[4];// kaç elemandan oluşacaksa sayıyı belirttik
        ogrenciler[0] ="Aysel";
        ogrenciler[1]="Nisa";
        ogrenciler[2]="Ela";
        ogrenciler[3]="Ahmet";

        for(int i=0;i<ogrenciler.length;i++){//sıfırdan başla i öğrencilerin eleman sayısından küçük(lenght) olduğu sürece
            System.out.println(ogrenciler[i]);
        }

        System.out.println("~~~~~~~~~~");

        //öğrenciler dizisindeki her bir öğrenciyi gez
        for(String ogrenci:ogrenciler){ //daha doğru for kullanımı budur. Bunu tercih et
            System.out.println(ogrenci);
        }

    }
}