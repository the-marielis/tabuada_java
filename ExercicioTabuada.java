/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aula2;
import java.util.Scanner;

/**
 *
 * @author marie
 */
public class ExercicioTabuada {
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner entrada = new Scanner(System.in);
    
    int tabuada = 0;
        System.out.println("Digite a tabuada que deseja calcular: ");
        tabuada = entrada.nextInt();
        
        for (int i = 0; i<11; i++) {
            System.out.println(tabuada + " * " + i + " = " + tabuada*i);
        }
    }
    
    
}
