/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisia.logic;

import java.util.Date;
import minisia.UI.UI;
import minisia.data.Student;
import minisia.data.Professor;

/**
 *
 * @author julioaguilera
 */

public class MiniSia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       UI.saludar();
        
       int op=UI.seleccionar();
        Date birthDateST01 = new Date(2000,12,29);
        Student paola =new Student(1,"jeaguileraf","Julio", "Aguilera",birthDateST01);
        Professor pedro = new Professor(13,"Pedro");
        
        if(op==1){
            System.out.println(paola.toString());
        }
        
        
        else if(op==2){
            System.out.println(pedro.toString());
        }
        
        else{
            System.out.print("No valido");
            
        }
        
    }
    
}

        /*
Entrega 1 - Diagrama UML
Clases con set y get. 
Decir con quien estoy trabajando.

Entrega 2 - 
marque 1 para ver estudisntes
la lista de estudiantes es : muestra


marque 2 para ver profesores

*/