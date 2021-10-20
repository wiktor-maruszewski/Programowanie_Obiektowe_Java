/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;
import java.lang.Math;
import java.util.Scanner;


public class lab2 {
    
    public static int factorial(int n){
        int fact = 1;
        for (int i = 2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    
    public static void pkt2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = sc.nextInt();
        
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        
        int wynik = 0;
        for(int i = 0; i < n; i++){
            if (array[i] > 0){
                wynik = wynik + array[i]*2;
            }
        }
        System.out.println(wynik);
        
        System.out.println("2.3:");
        int dodatnie = 0;
        int ujemne = 0;
        int zera = 0;
        for(int i = 0; i < n; i++){
            if (array[i] > 0){
                dodatnie += 1;
            }
            else if(array[i] < 0){
                ujemne += 1;
            }
            else zera += 1;
        }
        System.out.println("Dodatnie: " + dodatnie);
        System.out.println("Ujemne: " + ujemne);
        System.out.println("Zera: " + zera);
        
        System.out.println("2.4:");
        int najmniejsza = array[0];
        int najwieksza = array[0];
        
        for(int i = 0; i < n; i++){
            if (array[i] > najwieksza){
                najwieksza = array[i];
            }
           if(array[i] < najmniejsza){
                najmniejsza = array[i];
            }
        }
        System.out.println("Najwieksza: " + najwieksza);
        System.out.println("Najmniejsza: " + najmniejsza);
        
        System.out.println("2.5:");
        
        int ile = 0;
        for(int i = 0; i < n - 1; i++){
            if (array[i] > 0 && array[i + 1] > 0){
                ile += 1;
            }
        }
        System.out.println("Par: " + ile);
    }

    public static void main(String[] args) {
        
        //1.1
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = sc.nextInt();
        double a, b, c, d, e, f, g, h, i;
        a = c = d = e = f = g = h = i = 0;
        b = e= 1;
        for (int it = 0; it < n; it++)
        {
            double temp = sc.nextInt();
            a += temp;
            b *= temp;
            c += Math.abs(temp);
            d += Math.sqrt(Math.abs(temp));
            e *= Math.abs(temp);
            f += temp*temp;
            
            if(it % 2 == 0){
                h += temp;
                i -= (temp/PO.factorial(it+1));
            }
            else{
                h -= temp;
                i += (temp/PO.factorial(it+1));
            }
            
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        
        //1.2
        System.out.println("\n 1.2:");
        int[] array = new int[n];
        for(int it = 0; it < n; it++){
            array[it] = sc.nextInt();
        }
        for(int it = 1; it < n; it++){
            System.out.print(array[it] + ", ");
        }
        System.out.print(array[0]);
*/
        lab2.pkt2();
    }
    
}