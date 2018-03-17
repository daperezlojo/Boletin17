/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17;

import javax.swing.JOptionPane;

/**
 *
 * @author Damian
 */
public class Ejer4 {
    private alumno[] clase;
    private String[] nif;

    private int numletra;


    public Ejer4() {
    }

    public Ejer4(alumno[] clase) {
        this.clase = clase;
        nif=new String[clase.length];
    }

    public String[] calculaLetraNif() {
        int aux;    
        String aux2,dni;
        for (int i = 0; i < nif.length - 1; i++) {
            nif[i]=JOptionPane.showInputDialog("Dame o numero do dni para o alumno: "
                    + clase[i].getNome() + clase[i].getApelido());
            System.out.println("nif[i] es: "+nif[i]);
                    aux=Integer.parseInt(nif[i]);
            System.out.println("aux es: "+aux);
            
                    aux2 = String.valueOf(aux/23);
                        System.out.println("aux2 es: "+aux2);
                        
                        
            switch(aux2.substring(0,2)){
                case "0": nif[i] = nif[i] + "T"; break;
                case "1": nif[i] = nif[i] + "R"; break;
                case "2": nif[i] = nif[i] + "W"; break;
                case "3": nif[i] = nif[i] + "A"; break;
                case "4": nif[i] = nif[i] + "G"; break;
                case "5": nif[i] = nif[i] + "M"; break;
                case "6": nif[i] = nif[i] + "Y"; break;
                case "7": nif[i] = nif[i] + "F"; break;
                case "8": nif[i] = nif[i] + "P"; break;
                case "9": nif[i] = nif[i] + "D"; break;
                case "10": nif[i] = nif[i] + "X"; break;
                case "11": nif[i] = nif[i] + "B"; break;
                case "12": nif[i] = nif[i] + "N"; break;
                case "13": nif[i] = nif[i] + "J"; break;
                case "14": nif[i] = nif[i] + "Z"; break;
                case "15": nif[i] = nif[i] + "S"; break;
                case "16": nif[i] = nif[i] + "Q"; break;
                case "17": nif[i] = nif[i] + "V"; break;
                case "18": nif[i] = nif[i] + "H"; break;
                case "19": nif[i] = nif[i] + "L"; break;
                case "20": nif[i] = nif[i] + "C"; break;
                case "21": nif[i] = nif[i] + "K"; break;
                case "22": nif[i] = nif[i] + "E"; break;
                default: nif[i] = nif[i] + " # ";
            }
            System.out.println("El dni de: "+ clase[i].getNome() + clase[i].getApelido()+" es :"+nif[i]);
        }
        
                return nif;
    }
}

