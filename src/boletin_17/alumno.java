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
public class alumno {
    private String nome;
    private String apelido;

    @Override
    public String toString() {
        return  nome + " " + apelido;
    }

    public String getNome() {
        return nome;
    }

    public alumno[] creaClase() {
        alumno[] clase1 = {
            new alumno("Brooks", "Rachel"),  new alumno("Edwards", "Christopher"),  new alumno("Albert", "Stevens"),
            new alumno("Bruce", "Cook"),     new alumno("Carolyn", "Smith"),       new alumno("Albert", "Walker"),
            new alumno("Randy", "Reed"),     new alumno("Larry", "Barnes"),         new alumno("Lois", "Wilson"),
            new alumno("Jesse", "Campbell"), new alumno("Ernest", "Rogers"),        new alumno("Theresa", "Patterson"),
            new alumno("Henry", "Simmons"),  new alumno("Michelle", "Perry"),       new alumno("Albert", "Walkerson"),
            
            new alumno("Brooks", "Reed"),  new alumno("Edwards", "Christopher"),  new alumno("Albert", "O´Connor"),
            new alumno("Bruce", "Coch"),     new alumno("Carolyn", "Morgan"),       new alumno("Albert", "Paddy"),
            new alumno("Randy", "Ray"),     new alumno("Larry", "Barnes"),         new alumno("Lois", "Sheera"),
            new alumno("Jesse", "Jane"), new alumno("Ernest", "Morgan"),        new alumno("Theresa", "Coch"),
            new alumno("Henry", "Smith"),  new alumno("Michelle", "logan"),       new alumno("Albert", "Rogers")
            };
        return clase1;
}
    public static void amosar(alumno[] clase) {

        for (alumno ele : clase) {  
            System.out.println(ele);
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public alumno() {
    }

    public alumno(String nome, String apelido) {
        this.nome = nome;
        this.apelido = apelido;
    }

}



