/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17;

import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author Damian
 */
public class Ejer3 {
     private alumno[] clase;
    private int[] nota;

    public Ejer3(alumno[] clase, int[] nota) {
        this.clase = clase;
        this.nota = nota;
    }

    public void notaAlumnoConcreto() {
        String nome = JOptionPane.showInputDialog(null, "Nombre a buscar");
        String apelido = JOptionPane.showInputDialog(null, "Apelido a buscar");

        for (int i = 0; i < clase.length - 1; i++) {   
            if ((clase[i].getNome()).equals(nome) && apelido.equals(clase[i].getApelido())) { 
                System.out.println("El alumno " + clase[i].getNome() + " " + clase[i].getApelido() + " tiene la nota "
                        + nota[i]);
            } else {
            }
        }
    }

    public void alumnosAprovados() {

        System.out.println("Los alumnos aprobados son:\n");
        for (int i = 0; i < clase.length - 1; i++) {   
            if (nota[i] > 5) { 
                System.out.println("El alumno " + clase[i].getNome() + " " + clase[i].getApelido() + " tiene la nota "
                        + nota[i]);
            } else {
            }
        }
    }

    public void ordenaNotas() {
        int i, j;
        int aux;
        alumno[] aux2=new alumno[nota.length];
        
        
        for (i = 0; i < nota.length-1; i++) {
            for (j = i + 1; j < nota.length; j++) {
                if (nota[i] > nota[j]) {
                    
                    aux = nota[i];
                    nota[i] = nota[j];
                    nota[j] = aux;
                    
                    aux2[i]=clase[i];
                    clase[i]=clase[j];
                    clase[j] = aux2[i];  
                    }
            }
        }
        for(i=0;i<nota.length;i++){
         
            System.out.println("El alumno " + clase[i].getNome() + " " + clase[i].getApelido() + " tiene la nota "
            + nota[i]);
        }   
}
}
