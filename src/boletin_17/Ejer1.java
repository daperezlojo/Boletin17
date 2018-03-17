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
public class Ejer1 {
    public void creaArray(){

        int[] e1 =new int[6];
            for(int i=0;i<e1.length;i++){
                e1[i]=(int) (Math.random()*50)+1;
            }
            
            for(int j=e1.length-1; j>=0;j--){
                System.out.println(e1[j]);

            }
}
}
