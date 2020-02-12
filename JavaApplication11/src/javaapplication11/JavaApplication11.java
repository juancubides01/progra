/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;
public class JavaApplication11 {


    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int n,m;
        int resultado1=0, resultado2=0;
        System.out.println("Sumatoria de las diagonales de una matriz");
        System.out.print("Digite las dimensiones de la matriz(cuadrada): ");
        n = leer.nextInt();
        m = n;
        int matriz[][] = new int[n][m]; 
        for(int a=0;a<n;a++)
        {
            for(int b=0;b<m;b++)
            {
                System.out.print("Digite el valor del espacio (["+a+"]["+b+"]) : ");
                matriz[a][b] = leer.nextInt();
            }
        }
        System.out.println("\nMATRIZ INGRESADA");
        System.out.println("-------------------------");
        for(int a=0;a<n;a++)
        {
            for(int b=0;b<m;b++)
            {
                System.out.print(matriz[a][b]+"   ");
            }
            System.out.println();
        }
        for(int a=0;a<n;a++)
        {
            for(int b=0;b<m;b++)
            {
                if(a==b)
                {
                    resultado1+=matriz[a][b];
                }
            }
        }
        for(int a=0;a<n;a++)
        {
            for(int b=0;b<m;b++)
            {
                if((a+b)==n-1)
                {
                    resultado2+=matriz[a][b];
                }
            }
        }
        System.out.println("-------------------------\n");
        System.out.println("La suma de la diagonal principal es: "+resultado1);
        System.out.println("La suma de la diagonal secundaria es: "+resultado2);
        System.out.println("El valor absoluto de la diferencia entre las 2 diagonales es: "+(resultado2-resultado1));
    }

}