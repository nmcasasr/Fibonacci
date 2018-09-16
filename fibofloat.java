package fibo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Fibo {

  

    public static void main(String[] args) {
float x = 0;  
float y = 1;
float tem = 0;
float contador = 0;
        Scanner n1 = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = n1.nextInt();
        while(contador < n)
        {
    contador = contador + 1;
    tem = y;
    y = y+x;
    x= tem;
          if(y < 0)
          {
              System.out.println(y);
              break;
          }
  
        }
        
        
    }
    
}
