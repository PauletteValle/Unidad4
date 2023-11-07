/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrinicializacion;

/**
 *
 * @author Usuario
 */
public class ArrInicializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][]nombres = {
            {"Pao","Jessi", "Jesus"},
            {"Pablo","Karla","Ismael"},
            {"Fanny", "Alex", "Samuel"}
        };
        
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println(nombres[i][j] + ",");               
            }
            System.out.println();
        }
    }
    
}
