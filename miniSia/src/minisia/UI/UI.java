/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisia.UI;

import java.util.Scanner;


/**
 *
 * @author Profesor
 */
public class UI {
    
    
    public static void saludar(){
        System.out.println("Bienvenido");
    }
    
     public static int seleccionar(){
        System.out.println("Presione 1 para estudiante, 2 para profe");
        Scanner lector=new Scanner(System.in);
        int op=lector.nextInt();
        return op;
    }
    
}
