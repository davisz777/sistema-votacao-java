/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

public class JavaApplication10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int nulos = 0;
        int brancos = 0;
        int eleitores;
        int voto;
        int votosValidos;
        
        
        System.out.println("Quantos Eleitores terão?");
        eleitores = sc.nextInt();
        
        for(int i = 0; i < eleitores; i++){
            System.out.println("Digite seu VOTO: ");
            voto = sc.nextInt();
            
         switch(voto){   
             
             case 1:
                 candidato1 += 1;
                 break;
                 
             case 2:
                 candidato2 += 1;
                 break;
                 
             case 3: 
                 candidato3 += 1;
                 break;
                 
             case 4: 
                 brancos += 1;
                 break;
                 
             default:
                 nulos += 1;
                 break;
                 
         }
        }
                 
    votosValidos = candidato1 + candidato2 + candidato3;
    
  System.out.println("----------------------------------------------------");
  System.out.println("Candidato 1: " + candidato1 + " = " + ((candidato1 * 100) / votosValidos) + "%");
  System.out.println("Candidato 2: " + candidato2 + " = " + ((candidato2 * 100) / votosValidos) + "%");
  System.out.println("Candidato 3: " + candidato3 + " = " + ((candidato3 * 100) / votosValidos) + "%");
  System.out.println("Votos em Brancos: " + brancos + " = " + (brancos / eleitores) * 100 + "%");
  System.out.println("Votos em Nulo: " + nulos + " = " + (nulos / eleitores) * 100 + "%");
  
  
  int vencedor = 0;
  if(candidato1 > candidato2 && candidato1 > candidato3){
      vencedor = 1;
      
  } else if(candidato2 > candidato1 && candidato2 > candidato3){
      vencedor = 2;
      
  } else if(candidato3 > candidato1 && candidato3 > candidato2){
      vencedor = 3; }
      
      System.out.println("\n--------Resultado--------\n");
      if(vencedor == 0){
          System.out.println("Tivemos um EMPATE!");
          
      } else { System.out.println("O candidato: " + vencedor + " venceu!"); 
      }
      
              

sc.close();
  }
}
    
      

