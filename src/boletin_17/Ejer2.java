/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17;

/**
 *
 * @author Damian
 */
public class Ejer2 {
     private alumno[] clase;
    private int[] nota;

    public Ejer2() {
    }

    public alumno[] getClase() {
        return clase;
    }

    public void setClase(alumno[] clase) {
        this.clase = clase;
    }

    public int[] getNota() {
        return nota;
    }

    public void setNota(int[] nota) {
        this.nota = nota;
    }

    public void creaNotas() {

        alumno clase1 = new alumno(); 

        clase = clase1.creaClase();

        int[] notas = new int[clase.length];
            
            nota = notas;
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 10) + 1;
        }
    }
    public void visualizaNotas(){
        int aprobados=0,suspensos=0;
        for(int i=0;i<nota.length;i++){
            if(nota[i]>5){
                aprobados++;
            }
            else{
                suspensos++;
            }
        }
        System.out.println("O número de aprobados é: "+aprobados+"\n"+"O numero de suspensos é: "+suspensos);
    }
    public void notaMedia(){
        float notamedia=0;
        float contanota=0;
        for(int i=0;i<nota.length;i++){
                contanota=contanota+nota[i];
        }
            notamedia=contanota/nota.length;
        System.out.println("La nota media de la clase es: "+notamedia);
    }
    public void notaTop(){
       //double top=0;
        int top=0;
        int j=0;
        for(int i=0;i<nota.length-1;i++){
                if(nota[i]>nota[top]){
                   top=i;
                }
                else{
                }
        }
        
        System.out.println("La nota mas alta es: "+clase[top]+" "+nota[top]);
            
    }
}
