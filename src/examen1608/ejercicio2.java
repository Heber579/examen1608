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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner (System.in);
        int numero,edad,precio;
        double descuento,valorfinal;
        String nombre;
        System.out.println("Ingrese un numero");
        numero=lector.nextInt();
        if (numero==1){
            System.out.println("Ingrese un nombre");
            nombre=lector.next();
            System.out.println("Ingrese una edad");
            edad=lector.nextInt();
            System.out.println("Su nombre es "+nombre+" y su edad es "+edad);
        }else if (numero==2){
            System.out.println("Ingrese el precio de un producto");
            precio=lector.nextInt();
            descuento=precio*0.30;
            valorfinal=precio-descuento;
            System.out.println("El descuento es de "+descuento);
            System.out.println("El valor final es "+valorfinal);
        }
    }
    
}
