/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        CalculoFactura calculof = new CalculoFactura();
       Factura factura1 = new Factura();
        boolean validar =true;
        boolean validation=true;
        String cant, tipoPago;
         int cantArticulos,i =0,codigo,posicion;
         double subtotal,recargo=0,total=0,totalFinal=0,totalRecargo=0;
         
        System.out.println("Ingrese la fecha de la factura: ");
        factura1.setFecha(new Scanner(System.in).nextLine());
        System.out.println("Ingrese numero de la factura: ");
        factura1.setNroFatura(new Scanner(System.in).nextLong());
        System.out.println("Ingrese razon social del cliente:");
        factura1.setRazonSocial(new Scanner(System.in).nextLine());
        System.out.println("Ingrese cuit del cliente:");
        factura1.setCuitCliente(new Scanner(System.in).nextLong());
        
        while(validar == true)
        {
            System.out.println("Ingrese tipo de pago");
            System.out.println("C= contado");
            System.out.println("TC= tarjeta de credito");
            System.out.println("TD= tarjeta de debito");
            tipoPago = new Scanner(System.in).nextLine();
            
            if(tipoPago.equals("C"))
            {
                factura1.setTipoPago(tipoPago);
                recargo = 0;
               // factura1.setRecargo(recargo);
                   validar=false;
            }
            else if(tipoPago.equals("TC"))
            {
                factura1.setTipoPago(tipoPago);  
                recargo = 0.10;
               // factura1.setRecargo(recargo);
                 validar=false;
            }
             else if(tipoPago.equals("TD"))
            {
                factura1.setTipoPago(tipoPago); 
                recargo=0.05;
               // factura1.setRecargo(recargo);
                validar=false;
            }
        
        }
        do
        {
            System.out.println("Ingrese la cantidad de articulos ");
            cantArticulos = new Scanner(System.in).nextInt();
            if(cantArticulos > 0)
            {
                factura1.setItemsFactura(new String[cantArticulos][5]);
            }
        }while(cantArticulos <=0);
           
        while(i < cantArticulos)
        {
             
            System.out.println("Articulos a Facturar...");
            System.out.println("Ingrese el codigo del articulo");
            codigo = new Scanner(System.in).nextInt();
            posicion = buscarCodigo(calculof.getArticulos(), Integer.toString(codigo));
            if(posicion != -1)
            {
                 //validation =false;
      //agrego el articulo, paso por parametro la fila ,columna, y dato al arreglo itemsFactura
     //que tenemos en el metodo agregarArticulo
                
            factura1.agregarArticulo(i,0, Integer.toString(codigo));
            factura1.agregarArticulo(i,1, calculof.getArticulos()[posicion][1]);
            factura1.agregarArticulo(i,2, calculof.getArticulos()[posicion][2]);
                if(calculof.getArticulos()[posicion][3].compareTo("U") == 0)
                {
                     while (validation){ 
                    try {
                            System.out.println("Ingrese la cantidad de artículos a facturar: ");
                            cant = new Scanner(System.in).nextLine();
                            if (Integer.parseInt(cant) > 0) {
                                factura1.agregarArticulo(i, 3, cant);
                                subtotal = Integer.parseInt(cant) * Double.parseDouble(calculof.getArticulos()[posicion][2]);
                                factura1.agregarArticulo(i, 4, Double.toString(subtotal));
                               validation =false;
                            } else {
                                System.out.println("Ingrese un valor mayor a 0");
                            }
                        } catch (Exception e) {
                            System.out.println("Ingrese un entero como unidad");
                        } 
                 }
                     validation=true;
                }else { 
                    while (validation){  
                        try {
                            System.out.println("Ingrese la cantidad de Kg: ");
                            cant = new Scanner(System.in).nextLine();
                            if (cant.indexOf(".") != (-1)) {
                                factura1.agregarArticulo(i, 3, cant);
                                subtotal = Double.parseDouble(cant) * Double.parseDouble(calculof.getArticulos()[posicion][2]);
                                factura1.agregarArticulo(i, 4, Double.toString(subtotal));
                             validation =false;
                            }
                        } catch (Exception e) {
                            System.out.println("Ingrese un valor double de kg");
                        }
                    } 
                    validation=true;
               } 
                
               total += Double.parseDouble(factura1.getItemsFactura()[i][4]);
                factura1.setMontoTotalItems(total);
                i++;
       }else
            {
            
            System.out.println("Código no encontrado, ingrese nuevamente");
            }
            
         } 
        //total de recargo
        totalRecargo = recargo * total;
        factura1.setRecargo(totalRecargo);
        //factura mas recargo 
        totalFinal = +totalRecargo +  total;
        factura1.setMontoFinal(totalFinal);
        
        System.out.println("El ticket a pagar es");
        System.out.println("");
        System.out.println("Cliente: " + factura1.getRazonSocial());
        System.out.println("Fecha: " + factura1.getFecha());
        System.out.println("Número de factura: " + factura1.getNroFatura());
        System.out.println("Tipo de Pago: " + factura1.getTipoPago());
        System.out.println("Código Item\t Denominación\t Precio\t Cantidad\t Subtotal");
        mostrarArticulos(factura1.getItemsFactura());//arreglo donde se guardan los articulos ingresados
        System.out.println("Total Ítems: " + factura1.getMontoTotalItems());
        System.out.println("Recargo: " + factura1.getRecargo());
        System.out.println("Total Final: " + factura1.getMontoFinal());
        
     }
 
    
    public static int buscarCodigo(String matriz[][],String codigo)
    {
        int posicion = -1;
        for(int i=0; i< matriz.length;i++)
        {
            if(matriz[i][0].equals(codigo))
            {
                posicion = i;
            }
        }
        return posicion;
    }
    
    public static  void mostrarArticulos(String matriz[][])
            
    {
         for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
        }
    }
}
