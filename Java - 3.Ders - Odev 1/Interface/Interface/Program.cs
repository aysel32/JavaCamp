using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YouTubeDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            //IoC Container
            CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
            customerManager.GiveCredit();

            Console.ReadLine();                  


        }

    }

    class CreditManager 
    {
        public void Calculate(int creditType) 
        {
            if (creditType ==1) //esnaf
            {

            }
            if (creditType ==2) //öğretmen
            {

            }
            Console.WriteLine("Hesaplandı");
        }
        public void Save()
        {
            Console.WriteLine("Kredi verildi");
        }

    }

    interface ICreditManager
    {
        void Calculate();
        void Save();
    }

    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate();
        

        public virtual void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }

    class TeacherCreditManager : BaseCreditManager, ICreditManager //javada iki nokta yerine implements yazılır
    {
        public override void Calculate()
        {
            //hesaplamalar
            Console.WriteLine("öğretmen kredisi hesaplandı");
        }
        public override void Save()
        {
            base.Save();
        }

    }

    class MilitaryCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("asker kredisi hesaplandı");
        }

        public void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }
    //DRY kendini tekrarlama
    class CarCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Araba kredisi hesaplandı");
        }

        public void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }


    class Customer 
    {
        public Customer()
        {
            Console.WriteLine("müşteri nesnesi başlatıldı");
        }

        public int Id { get; set; }                
        public string City { get; set; }

        

    }

    class Company : Customer 
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }

    class Person : Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string NationalIdentity { get; set; }
    }


    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;

        public CustomerManager(Customer customer, ICreditManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }

        public void Save() 
        {
            Console.WriteLine("Müşteri kaydedildi : ");
        }

        public void Delete()
        {
            Console.WriteLine("Müşteri silindi : ");
        }

        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi");
        }

    }
}
