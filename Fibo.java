/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Fibo {

  

    public static void main(String[] args) {
int x = 0;  
int y = 1;
int tem = 0;
int contador = 0;
        Scanner n1 = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = n1.nextInt();
        while(contador < n)
        {
    contador = contador + 1;
    tem = y;
    y = y+x;
    x= tem;
    System.out.println(y);
        }
        
        
    }
    
}
