/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicionotaprimertrimestre;

import java.util.Scanner;

/**
 *
 * 
 */
public class NotaMedia {
    private double teorico1, numero;
    private double teorico2;
    private double practico;   
    private double boletins;
Scanner sc=new Scanner(System.in);
    public NotaMedia() {
    }

    public NotaMedia(int teorico1, int teorico2, int practico, int boletins) {
        this.teorico1 = teorico1;
        this.teorico2 = teorico2;
        this.practico = practico;
        this.boletins = boletins;
    }
    public void validarNota(){
       
        do{
            System.out.println("Escribe la nota que tiene que ser entre 0 y 10");
           sc.nextFloat();
        }while(numero<0 || numero>10);
        
    }
     public void validarBoletin(){
       
        do{
            System.out.println("Escribe el numero de boletines que has hecho entre 0 y 19");
           sc.nextFloat();
        }while(boletins<0 || boletins>19);
        
    }
    
    public void MedTeorico(){
        int notaBoletines=0;
        if(boletins>=17){
          notaBoletines=2;
         }else if(boletins>=13){
             notaBoletines=1;
         }else
             notaBoletines=0;
    }
         
public float notaMediaExames(){
    System.out.println("Introduce a nota do examen teorico 1");
    teorico1=validarNota();
    System.out.println("Introduce a nota do examen teorico 2");
    teorico2=validarNota();
    System.out.println("Introduce a nota do examen practico");
    practico=validarNota();
    System.out.println("Boletines feitos");
    boletins=validarBoletin();
    notaMed =(((teorico1+teorico2)/2*0.4)+notaPractico*0.4+notaBoletins);   
System.out.println("A nota media é: "+notaMedia);
}

}
    
} 
    

    


