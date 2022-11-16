public class Main {
    public static void main(String[] args) {
        //çok boyutlu dizileri tanımla yöntemi 3satır 3 sütundan oluştuğunu gösteriyoruz
        String[][] sehirler = new String[3][3];//tek[] tek satırlık array [][] satır ve sutündan oluşan demek

        sehirler[0][0] = "İstanbul";// 0.satırın 0.elemanı
        sehirler[0][1] = "Bursa"; // 0.satırın 1.elemanı.....
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";
        // ilerde veritabanıyla dinamik çekebileceğiz

        for(int i = 0; i<=2;i++){ //satırları döngüyle gezeceğiz
            System.out.println("-----------------");
            for(int j=0;j<=2;j++){ //
                System.out.println(sehirler[i][j]);//i nin j ninci elemanını yazdır 0 ın 0 ıncı elemanını, 0 ın 1.elemanını...
            }

        }



    }
}