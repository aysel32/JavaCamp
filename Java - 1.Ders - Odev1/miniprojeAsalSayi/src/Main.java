public class Main {
    public static void main(String[] args) {
        int number = 25;
        int remainder = number % 2; //% kalanlı bölme mod alma
        System.out.println(remainder);

        boolean isPrime = true;// sayımızı asal kabul ediyoruz
        //1 asal sayı değilidr ama bug tan dolayı asal yazar bunu düzeltmek için
        if(number==1){
            System.out.println("Sayı asal değildir");
            return;// 1 girilirse kod çalışmaya devam etmeden bitir.
        }
        if(number<1){
            System.out.println("Geçersiz sayı girdiniz");
        }


        //döngüde herhangi bir sayı verdiğimiz sayıya tam bölünürse sayımız asal değildir diyoruz
        for (int i=2; i<number; i++){ // 2 den 24 e kadar döngü kurduk
           if(number % i ==0){
               isPrime = false;
           }
           if(isPrime){
               System.out.println("Sayı asaldır");
           }else{
               System.out.println("Sayı asal değildir");
           }

        }
    }
}