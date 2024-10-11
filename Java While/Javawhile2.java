/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javawhile2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Javawhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro N: ");
        int N = scanner.nextInt();
        
        System.out.println("Numeros de 1 ate " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
