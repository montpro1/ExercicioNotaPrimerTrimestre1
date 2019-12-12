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
    private int teorico1;
    private int teorico2;
    private int practico;   
    private int boletins;
Scanner sc=new Scanner(System.in);
    public NotaMedia() {
    }

    public NotaMedia(int teorico1, int teorico2, int practico, int boletins) {
        this.teorico1 = teorico1;
        this.teorico2 = teorico2;
        this.practico = practico;
        this.boletins = boletins;
    }
    public int ValidarNota(){
       
        
        if(validacion>0 && validacion<=10){
           
        }
    }
    
    public void MedTeorico(){
        System.out.println("Nota del primer teorico");
        int teorico1=sc.nextInt();
        System.out.println("Nota del segundo teorico");
        int teorico2=sc.nextInt();
        System.out.println("Nota del practico");
        int practico=sc.nextInt();
        System.out.println("Cuantos boletines has hecho");
        int boletins=sc.nextInt();
        int Media = 0;
        int MediaTotal;
        String tecleo= "";
       if(boletins>=16){
             for(int i = 0;tecleo!="fin";i++){ 

         Media=(teorico1+teorico2)/2;
            int practico1 = (int) (practico*0.4);
                 int MediaTotal1 = (int) ((Media*0.4)+practico1)+2;
                
               System.out.println(MediaTotal1); 
                 }}
         if(boletins>=12 && boletins<18){
                 for(int i = 0;tecleo!="fin";i++){ 

         Media=(teorico1+teorico2)/2;
                 
             int practico1 = (int) (practico*0.4);
                 int MediaTotal2 = (int) ((Media*0.4)+practico1)+1;
                
        System.out.println(MediaTotal2); 
        }}
         else if(boletins<8){
                 for(int i = 0;tecleo!="fin";i++){ 

         Media=(teorico1+teorico2)/2;
                 
              int practico1 = (int) (practico*0.4);
       MediaTotal=(int) ((Media*0.4)+practico1);
        System.out.println(MediaTotal); 
         }
         }
    
    }}
    

    


