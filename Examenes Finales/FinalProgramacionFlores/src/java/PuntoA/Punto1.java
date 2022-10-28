/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoA;

import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Se crea el lector

         System.out.println("Por favor ingrese el numero de butaca");//Se pide un dato al usuario

        int primerNumero = sc.nextInt(); //Se lee el nombre con nextInt() que retorna un int con el dato

        System.out.println("Por favor ingrese segundo numero");//Se pide otro dato al usuario

       int segundoNumero = sc.nextInt(); //Se guarda la edad directamente con nextInt()

        
  boolean arreglo [][] = new boolean [primerNumero] [segundoNumero];
     
         for(int x = 0; x<arreglo.length;x++){
             for(int i =0;i<arreglo[0].length;i++){
             System.out.println("La butaca " +x+i+ "se encuentra ocupada");
             System.out.println("Ingrese Y si esta ocupado y N si no lo esta");
             
             if(sc.nextLine().toLowerCase().equals('y')){
             arreglo [x][i]=true;
             }else if(sc.nextLine().toLowerCase().equals('n')){
             arreglo [x][i]=false;
             }
             
             }
          }
             
           for(int x =0;x<arreglo.length;x++){
               
              for(int i = 0;i<arreglo[0].length;i++){
                  System.out.print(arreglo[x][i]);
                  System.out.print( " " );
                  
              } 
           }
    }
    }



