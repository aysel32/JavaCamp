using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YouTubeDemo
{
    class Program
    {
        static void Main(string[] args)//burada başlık veriğimiz operasyonları çağırma işlemi yaptık
        {
            CreditManager creditManager = new CreditManager();
            creditManager.Calculate();
            creditManager.Calculate();
            creditManager.Save();

            Customer customer = new Customer();//örneğini oluşturmak, instance oluşturmak, instance creation
            customer.Id = 1;            
            customer.City = "Ankara";

            


            CustomerManager customerManager = new CustomerManager(customer);
            customerManager.Save();
            customerManager.Delete();

            Company company = new Company();
            company.TaxNumber = "100000";
            company.CompanyName = "Bosch";
            company.Id = 100;
            
            CustomerManager customerManager2 = new CustomerManager(new Person());

            Person person = new Person();
            person.FirstName = "Aysel";
            person.NationalIdentity = "123456";

            Customer denemedegisken1 = new Customer();
            Customer denemedegisken2 = new Person();
            Customer denemedegisken3 = new Company();//parametleri Customer aldığımız halde person ve company hata vermemesi new leiğimizde heap te oluşan referans numarasını Customer denemedegisken2 ve 3 ün tutmasındandır...

            
           


            Console.ReadLine();//çıktıyı ekranda tutmak için yazıyoruz


        }

    }

    class CreditManager //burada operasyonlarımıza istediğimiz zaman çağırabilmek için başlıklar veriyoruz
    {
        public void Calculate() // operasyon başlığı
        {
            Console.WriteLine("Hesaplandı");// ekran çıktısı
        }
        public void Save()//operasyon başlığı
        {
            Console.WriteLine("Kredi verildi");//ekran çıktısı
        }
            
    }
    class Customer //özellik tutucu class
    {
        public Customer()
        {
            Console.WriteLine("müşteri nesnesi başlatıldı");
        }

        public int Id { get; set; }//C#ta bu yapıya properties denir                
        public string City { get; set; }

        //Yapılan en sık hata özellik tutucu class içine operasyon yazmaktır
        //public void Save()
        //{
            //Console.WriteLine("Müşteri kaydedildi"); BUNU YAPMAAA
        //} BİR CLASS SADECE BİR İŞ YAPAR. OPERASYONA ÖZELLİK-ÖZELLİĞE OPERASYON YAZILMAZ....SOLID in S si kuralı...

        //Katmanlı Mimariler alt alta classların yazılmasıdır

    }

    class Company:Customer //javada class Company extends Customer olarak yazılır
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }

    class Person:Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }        
        public string NationalIdentity { get; set; }
    }


    class CustomerManager
    {
        private Customer _customer;

        public CustomerManager(Customer customer)
        {
            _customer = customer;
        }

        public void Save() //Encapsulation kullanıyoruz ki her defasında hata almadan kolayca yeni veri ekleyebilelim.
        {
            Console.WriteLine("Müşteri kaydedildi : "+ _customer.FirstName);
        }

        public void Delete()
        {
            Console.WriteLine("Müşteri silindi : " + _customer.FirstName);
        }
            
    }
}
