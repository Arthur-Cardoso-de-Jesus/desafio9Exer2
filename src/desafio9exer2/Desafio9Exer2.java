/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio9exer2;

import java.util.Scanner;

/**
 *
 * @author baung
 */
public class Desafio9Exer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, acNumeros;
        acNumeros = 0;
        System.out.println("Insira um numero!");
        numero = ler.nextInt();
        do {
            if (numero < 0) {
                acNumeros = acNumeros + numero;
            }
            System.out.println("Insira um numero!");
            numero = ler.nextInt();
        } while (numero != 0);
        System.out.println("A soma dos numeros negativos foi de:" + acNumeros);
    }

}
