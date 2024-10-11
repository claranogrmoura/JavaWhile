/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javawhile;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Javawhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos alunos ha na sala? ");
        int numeroAlunos = scanner.nextInt();
        
        double somaNotas = 0.0;
        int contador = 0;
        
        while (contador < numeroAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            contador++;
        }
        
        double media = somaNotas / numeroAlunos;
        System.out.printf("A media aritmetica da turma e: %.2f\n", media);
        
        scanner.close();
    }
}

