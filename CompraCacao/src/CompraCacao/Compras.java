/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompraCacao;
import java.util.Scanner;
/**
 *
 * @author JAVIER
 */
public class Compras {
    
    public static void main(String[] args) {
     
        // DECLARACIÓN DE VARIABLES 
        int cantLibras;
        int tipoCacao;
        //INICIALIZACIÓN DE VARIABLE
        double valorPagar=0;
        Scanner lector = new Scanner (System.in);
       //ENTRADA
        System.out.print("Ingrese el total de libras:");
        cantLibras=lector.nextInt();
        
        System.out.print("Ingrese el tipo de cacao:");
        tipoCacao=lector.nextInt();
       }
}