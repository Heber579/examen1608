/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1608;

import java.util.Scanner;

/**
 *
 * @author Ever
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner (System.in);
        int i,sueldo,contadorsuel1=0,contadorsuel2=0;
        for (i=0;i<10;i++){
            System.out.println("Ingrese su sueldo");
            sueldo=lector.nextInt();
            if (sueldo<300){
                contadorsuel1++;
            }else if (sueldo>300){
                contadorsuel2++;
            }
            System.out.println("Los trabajadores que cobran menos de 300 son "+contadorsuel1);
            System.out.println("Los trabajadores que cobran mas de 300 son "+contadorsuel2);
        }
    }
    
}
