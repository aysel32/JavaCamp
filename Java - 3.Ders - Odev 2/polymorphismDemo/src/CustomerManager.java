public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void  add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("Log mesajı");
//        DatabaseLogger logger = new DatabaseLogger();
//        logger.Log("Log mesajı"); böyle newlemek bizi new lediğimiz clasa bağımlı yapar sonra değişiklik olursa zor olur bunun yerine private yazarız.
    }
}
