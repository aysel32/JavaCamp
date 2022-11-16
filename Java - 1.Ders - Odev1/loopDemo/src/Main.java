public class Main {
    public static void main(String[] args) {
        //For
        System.out.println("For Döngüsü");
        for(int i=1;i<10;i++){ //ilk noktalı virgüle kadar olan kısım sayaç, sonrası şart son kısım sayacın kaçar artacağıdır
            System.out.println(i);
        }
        System.out.println("***************************");
        for(int i=1;i<10;i+=2){ //sayıları 2 atlayarak yazdırır.1-10 arası tek sayıları yazdırır
            System.out.println(i);
        }
        System.out.println("***************************");
        for(int i=2;i<10;i+=2){ //i=2 verdiğimiz için döngü 2 den başlayarak 2 artarak yazacağı için çift sayıları yazdırır
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");
        //While Döngüsü
        System.out.println("While Döngüsü");
        //bir değişken tanımlandığı blok içinde geçerlidir. i ye verdiğimiz değer for bloğunda geçerli
        int i=1;
       // while(i<10) {//1 her zaman 10 dan küçük olduğu ve koşul vermediğimiz için sonsuz döngüye girer.
        while(i<10){
            System.out.println(i);
            //i++; //sayacın artışını belirtiriz i yi birer artırarak yazdır diyoruz

            i+=2; //i yi 2 şer artırarak yazdır
        }
        System.out.println("***************************");
        int j=2;// 1-10 arası 2 şer atlayarak 2 den başla yazdır
        while(j<10){

            System.out.println(j);
            j+=2;
        }
        System.out.println("While Döngüsü Bitti");
        //Do-While
        System.out.println("Do-While Döngüsü");
        int a=1;
        do{
            System.out.println(a);
            a+=2;
        }while(a<10);
        System.out.println("Do-While Döngüsü Bitti");
        //do-while döngüsünün farkı koşul sağlanmasa da kod bir kez çalışır.
        //a=100 deseydik 100 10 dan küçük olmadığı halde kod ekrana a ya verilen değeri yazar

    }
}