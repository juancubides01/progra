/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumas;

/**
 *
 * @author LABSIS
 */
public class Sumas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double suma = 0;
        for(int i = 1; i <= 100000000; i=i+2){
            suma = suma + i;
        }
        System.out.println("La Suma de los numeros impares desde 1 hasta 100000000 es  "+ suma);
    }
    
}
