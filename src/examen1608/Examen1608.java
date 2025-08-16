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
public class Examen1608 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner (System.in);
        int i;
        double nota, promedio;
        for (i=0;i<10;i++){
            System.out.println("Ingrese una nota");
            nota=lector.nextDouble();
            promedio= nota*0.10;
            if (promedio>7){
                System.out.println("PROMOCIONADO");
            }else if ((promedio > 4)&& (promedio < 7)){
                System.out.println("REGULAR");
            }else if (promedio<4){
                System.out.println("REPROBADO");
            }
        }
    }
    
}
