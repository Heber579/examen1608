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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner (System.in);
        int precio;
        double descuento,valorfinal;
        System.out.println("Ingrese el precio del producto");
        precio=lector.nextInt();
        descuento=precio*0.10;
        valorfinal=precio-descuento;
        System.out.println("El descuento es de Q"+descuento);
        System.out.println("El precio final es Q"+valorfinal);
    }
    
}
