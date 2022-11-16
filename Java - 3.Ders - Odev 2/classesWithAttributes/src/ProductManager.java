public class ProductManager {
    public void Add(Product product){
        //JDBC yazacağız
        System.out.println("ürün eklendi "+ product.getName());
    }
    //32.Ders
    //public void Add2(int id, String name, String description, int stackAmount, double price){}
    //bu şekilde yazmak doğru değildir yeni bir kod eklediğimizde diğer ekranlarda hararet yapar.
    //hepsine gidip tek tek değiştirmek zor olacağı için
    //Product class ta yeni özelliği belirtiriz. istersek mainde içeriğide yazabiliriz.



}
