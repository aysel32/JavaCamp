public class Main {
    public static void main(String[] args) {
        // claslar reference type tir
        customerManager CustomerManager = new customerManager();
        customerManager CustomerManager2 = new customerManager();
        CustomerManager = CustomerManager2;
        CustomerManager.Add();
        CustomerManager.Remove();
        CustomerManager.Update();

        // Ders 29 // ÖNEMLİİİİ - ANLAAAAA--
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2); //sayi2 nin değeri nedir??

        //sayi2 ye sayi1 in değerini atıyoruz
        //Artık sayi2 nin değeri 10 dur. sayi1 in değeri 30 olsa da artık sayi1 i çöpçüler süpürdü :)(kör olaaasııı çöpçüleeerr sayi1 i götürdüleerrr :))

        // DİĞER ÖRNEK
        int[]sayilar1 = new int[]{1,2,3}; //int[]sayilar1={1,2,3} de yazılabilir ilki tercih et
        int[]sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);//sayilar2 nin sıfırıncı indeks değeri nedir??
//sayilar2 ye sayilar 1 in değerlerini atadık. Artık sayilar2 nin referans değeri sayılar1 nki oldu
//sayilar1 in sıfırıncı indeksini 10 ile değiştirmiştir
// dememiz o ki artık sayilar2 nin sıfırıncı indeksi 10 oldu hayırlı olsun sayilar2 ye :)

    }


}
//classların en temel özelliği gruplama yapmaktır.
