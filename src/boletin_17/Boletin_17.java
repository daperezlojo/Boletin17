/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17;
import boletin_17.Ejer1;
/**
 *
 * @author Damian
 */
public class Boletin_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Ejer1 e1=new Ejer1();
      System.out.println("Ejercicio 1: \n");
              e1.creaArray();
      System.out.println("\n"); 
      
      System.out.println("Ejercicio 2: \n");  
            Ejer2 e2=new Ejer2();
            e2.creaNotas();
            e2.visualizaNotas();
            e2.notaMedia();
            e2.notaTop();
      System.out.println("\n"); 
      
      System.out.println("Ejercicio 3: \n");  
            Ejer3 e3=new Ejer3(e2.getClase(),e2.getNota());
            e3.notaAlumnoConcreto();
            e3.alumnosAprovados();
            System.out.println("\n"); 
            e3.ordenaNotas();
            
      System.out.println("Ejercicio 4: \n");  
            Ejer4 e4=new Ejer4(e2.getClase());
            e4.calculaLetraNif();
    }
    
}
