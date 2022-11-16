public class Main {
    public static void main(String[] args) {
        // double[] myList = new double[4]; //önceki öğrendiğimiz yazım şekli
        double[] myList = {1.2, 6.3, 4.3, 5.6};// new le yazmakla aynı şeydir
        double total = 0; // sayıların toplamını yazdırmak için değişkene 0 veririz
        double max = myList[0];
        for (double number : myList) { //myList içindeki number ları gez
            if (max < number) {
                max = number;

            }
            total = total + number; // toplama işlemi için 0 verdiğimiz değişkeni değer atadığımız number ile + operatörüyle yap
            System.out.println(number); // ekrana sayıları yaz
        }
        System.out.println("Toplam = " + total);
        System.out.println("En Büyük Sayı = " + max);


    }

}