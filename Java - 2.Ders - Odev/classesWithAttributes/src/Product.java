public class Product {
    public Product(int id, String name, String description, double price, int stockAmount, String renk){
        System.out.println("Yapıcı blok çalıştı");
        this.id=id;
        this.renk=renk;
        this.name=name;
        this.price=price;
        this.description = description;
        this.stockAmount=stockAmount;
            //aşırı yükleme yöntemi yaptık
    }
    public Product(){

    }

    //Bir class aynı zamanda özellik attribute barındırır.
    // attribute | field diyebiliriz ürüne ait bilgiler

//    int id;
//    String name;
//    String description;
//    double price;
//    int stockAmount;

//HAYATİ BİLGİ = Bir class bir method sadece bir işi yapar
// burada Product class ı hem attribute tutup hem operasuonları İÇERMEMELİDİR
//Ürün nesnesinde ürüne ait özellikler (Product)
//ürün managerde ürünle ilgili operasyonlar olmalıdır (ProductManager)
//Yazılımın raconuna uyulmalıdır


    private int id;
    private String name;
    private String description;
    private double price;
    private String renk;
    private int stockAmount;
    private String kod;// kod readon yani kullanıcı okuyabilir yazamaz


    // 33.Video Getter Setter
    //getter
    public int getId() {
        return id; //id yi okuyabilir ama yazamaz
    }

    //setter
    public void setId(int id) {//parametre olarak int id verilmelidir
        //this.id=id; // bu şekilde de yazılabilir - this içinde bulunduğumuz class demektir   _olanlar field
        this.id = id;//

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }



}