//ürünü kaydederken kurallara uygun olup olmadığını kontrol ediyoruz
public class ProductValidator {
    static {//birden fazla static blok yazılabilir ama yaygın kullanılmaz
        System.out.println("Static yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");// çalışması için new lemek lazım managerda
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;

        }else{
            return false;
        }
    }
    public void bisey(){

    }
//    public static class BaskaBirClass{ //inner class denir yani klasın içinde başka bir klas
//        public static void Sil(){
//
//        }
   // }

}
