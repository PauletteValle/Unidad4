/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4arreglosfor;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class U4ArreglosFor {

    public static void main(String[] args) {
        //Declarar 7 elementos 20.5,40.6,78.4,94.7,55.3,22.6,84.3
        double[] arreglos = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        
        do {
            System.out.println("Menú:");
            
            System.out.println("1.Sumar los elementos del arreglo.");
            System.out.println("2.Multiplicar los elementos del arreglo.");
            
            System.out.println("3.Salir.");
            
            System.out.println("Selecione una opcion: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) { 
                
                case 1:
                    double suma = 0;
                    for (double elemento : arreglos){
                        suma += elemento; 
                    }
                    System.out.println("La suma de los arreglos es: " + suma);
                    
                    break;
                    
                case 2:
                    double multiplicacion = 1;
                    for(double elemento : arreglos){
                        multiplicacion *= elemento;
                    }
                    System.out.println("La multiplicacion de los arreglos es: " + multiplicacion);
                    
                    break;
                    
                case 3: 
                    
                    System.out.println("Salindo del programa");
                    
                    break;
                default: 
                    System.out.println("Opcion no valida. Por Favor, selecciones 1, 2 o 3.");
                    }
            } while (opcion != 3);
            
            scanner.close();
        
        
        
        
    }
}
