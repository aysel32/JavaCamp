public class Main { //kodlar mainden çalışmaya başlar. methodu Main in public inden çağırmamız lazım
    public static void main(String[] args) {
        sayiBulmaca();//methodu çağırıyoruz
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 2;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        String mesaj="";
        if (varMi) {
            mesaj = "Sayı mevcuttur: "+aranacak;
            mesajVer(mesaj);
        } else {
            mesajVer("Sayı mevcut değildir :"+aranacak);
        }
    }
    public static void  mesajVer(String mesaj){//parametreli
        System.out.println(mesaj);
    }
}

