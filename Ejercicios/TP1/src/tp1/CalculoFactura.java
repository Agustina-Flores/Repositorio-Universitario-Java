/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author Agustina
 */
public class CalculoFactura {
 
        private String [][] articulos = {{"100","Azucar", "20", "U"} , {"101","Leche" , "30" , "U"} ,
{"102","Aceite", "50" , "U"} , {"103","Sal", "45" , "U"} , {"104"," Fideos", "15" , "U"} ,
{"105"," Arroz", "28" , "U"} , {"106","Galletas", "26" , "U"} , {"107","Carne Molida", "220" ,"Kg"} ,
{"108","Shampoo", "42" , "U"} , {"109","Queso Mantecoso", "178" , "Kg"} ,
{"110","Jamon Cocido", "320" ,"Kg"} , {"111","Naranjas", "80" , "Kg"}};

    public String[][] getArticulos() {
        return articulos;
    }

    public void setArticulos(String[][] articulos) {
        this.articulos = articulos;
    }
  
  
  
}
