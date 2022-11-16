using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YouTubeEgitim
{
    class Program
    {
        static void Main(string[] args)
        {
            int sayi1 = 10;
            int sayi2 = 20;
            sayi1 = sayi2;
            sayi2 = 100;
            Console.WriteLine(sayi1);

            //sayi1 in değeri eşittir sayi2 nin değeri diye okuruz
            //sayi1 in değeri artık 20 olduğu için ekran çıktısı 20 olacaktır.

            int[] sayilar1 = new[] { 1, 2, 3 };
            int[] sayilar2 = new[] { 10, 20, 30 };
            sayilar1 = sayilar2;

            sayilar2[0] = 1000;

            Console.WriteLine(sayilar1);
            Console.ReadLine();

            //diziler (array) referans tiptir. sayilar1 i sayilar2 ye eşitlediğimizde referans numaralarını eşitleriz.new dediğimizde bellekte(heap) referans numarasıyla değişkenimizin örneğine değer atanır.

            //sayilar1 = sayilar2 dediğimizde sayilar1 in referans değeri artık sayilar2 nin referans değeri olur 
            
            //sayilar2[0] = 1000 sayilar2 nin sıfırıncı elemanı 1000 olacaksa sayılar1[0] elemanını da referans değerlerini bellekte (=) diyerek değiştirdiğimiz için ekran çıktımız 1000 olacaktır


        }
    }
}
