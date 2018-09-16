using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class Program
    {
        static void Main(string[] args)
        {
            double x = 0;
            double y = 1;
            double tem = 0;
            double contador = 0;
            Console.Write("Escribe un numero: ");
            String nString = Console.ReadLine();
            int n = Int32.Parse(nString);

            while (contador < n)
            {
                contador = contador + 1;
                tem = y;
                y = y + x;
                x = tem;
                if(y < 0)
                {
                Console.WriteLine(y);
                    break;
                }
                
            }
        }
    }
}
