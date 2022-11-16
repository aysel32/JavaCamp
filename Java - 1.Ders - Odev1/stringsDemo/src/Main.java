public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);//metni yazdırdık

        System.out.println("Eleman sayısı : " + mesaj.length()); //dizinin eleman sayısını yazdırdık
        System.out.println("5. eleman : " + mesaj.charAt(4)); //4.indexteki elemanı yazdırır
        //charAt = belli bir karakteri yakalamak için kullanırız

        System.out.println(mesaj.concat(" Yaşasın!")); //dizisinin sonuna ekler ama kalıcı olması için eklenecek olanı değişkene atamak lazım
        //mesaj2=mesaj.concat yaşasın yazmak gerekir

        System.out.println(mesaj.startsWith("B"));// B ile başlıyorsa sonuç true döndürür/büyük küçük harf duyarlı
        System.out.println(mesaj.endsWith(".")); // . ile bitiyor mu=true

        //belli bir dizi karakterleri almak için. char array e değişken ata. kaç karakter alacağını [5] belirt
        char[]karakterler = new char[5]; // 5 karakter alacağız
        mesaj.getChars(0, 5,karakterler,0); // 0 dan başla 5 e kadarki elemanları karakterlere ata.son 0 sıfırıncı indeksinden itibaren ata demek
        System.out.println(karakterler);

        //belirtilen karakter dizide kaçıncı eleman bulma
        System.out.println(mesaj.indexOf('a')); // a dizide kaçıncı sırada ilk bulduğu a nın index sayısını yazar (7 yazar)

        //aramaya en sağdan başlamak için sondan yani. yine baştan saymaya başlar ama en sağdaki ilk a nın sayısını verir(9 yazar)
        System.out.println(mesaj.lastIndexOf("a"));


        //18.Video Çalışması
        String mesaj2 = "Bugün hava çok güzel.";
        System.out.println(mesaj2);

        //kod devam ederken verdiğimiz değişkeni başka yerlerde kullanabilmek için değişkene atarız
        String yeniMesaj = mesaj2.replace(' ','-');//dizideki boşlukları - ile değiştir diyoruz
        System.out.println(yeniMesaj); //String fonksiyonlar metni değiştirmez yeni bir çıktı oluşturur. yeni çıktığı kullanabilmek için yeni kodu yeni değişkene atarız

        //dizinin içinden parça almak için
        System.out.println(mesaj2.substring(2));//2.indexten itibaren tüm diziyi al. (gün hava çok güzel yazar)
        System.out.println(mesaj2.substring(2,4)); // 2 den başla 4 e kadar al. 4 dahil değil

        //diziyi parçalamak için
        for (String kelime: mesaj2.split(" ")){
            System.out.println(kelime);// dizideki elemanları alt alta yazdırır
        }
        //dizidekileri küçük harfe dönüştürmek(veritabanlarında arama ifadesi gönderiğimizde kullanırız)
        System.out.println(mesaj2.toLowerCase());// bütün harfleri küçük harfe çevirir
        System.out.println(mesaj2.toUpperCase()); //bütün harfleri büyük harfe çevirir

        //başına ve sonuna boşlukları silmek için
        System.out.println(mesaj2.trim());// başında ve sonunda boşluk varsa siler




    }
}
