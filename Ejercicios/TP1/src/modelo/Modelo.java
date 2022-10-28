/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class Modelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String fecha,razonSocial,tipoPago,opcion="Y";
        long cuit;
        boolean validar=true;
        double recargo=0 ;
        int cantArticulos,codigo,posicion,i;
       List <Articulo> articulos = new ArrayList<Articulo>();
       
        Articulo a0=new Articulo(100,"Azucar", 20, "U");
        Articulo a1=new Articulo(101,"Leche2" , 30 , "U");
        Articulo a2=new Articulo(102,"Aceite", 50 , "U");
        Articulo a3=new Articulo(103,"Sal", 45 , "U");
        Articulo a4=new Articulo(104," Fideos", 15 , "U");
        Articulo a5=new Articulo(105," Arroz", 28 , "U");
        Articulo a6=new Articulo(106,"Galletas", 26 , "U");
        Articulo a8=new Articulo(108,"Shampoo", 42 , "U");
      
        
        articulos.add(a0);
        articulos.add(a1);
        articulos.add(a2);
        articulos.add(a3);
        articulos.add(a4);
        articulos.add(a5);
        articulos.add(a6);
        articulos.add(a8);
        
        Factura factura2=new Factura();
        System.out.println("Ingrese la fecha de la factura: DD/MM/YYYY");
        fecha=new Scanner(System.in).nextLine();
        Date fechaFact=new Date(Integer.parseInt(fecha.substring(6, 10))-1900,Integer.parseInt(fecha.substring(3,5))-1,Integer.parseInt(fecha.substring(0,2)));
        factura2.setFecha(fechaFact);
        
        System.out.println("Ingrese el numero de factura");
        factura2.setNumero(new Scanner(System.in).nextInt());
         System.out.println("Ingrese razon Social");
        razonSocial = new Scanner(System.in).nextLine();
        System.out.println("Ingrese cuit del cliente");
        cuit = new Scanner(System.in).nextLong();
        Cliente cliente1 = new Cliente(razonSocial,cuit);
        factura2.setCliente(cliente1);
        
        
        while(validar==true)
            
        {
            System.out.println("Ingrese tipo de pago");
            System.out.println("C= contado");
            System.out.println("TC= tarjeta de credito");
            System.out.println("TD= tarjeta de debito");
            tipoPago = new Scanner(System.in).nextLine();
          
             if(tipoPago.equals("C"))
            {
                factura2.setTipoPago(tipoPago);
                recargo = 0;

                   validar=false;
            }
            else if(tipoPago.equals("TC"))
            {
                factura2.setTipoPago(tipoPago);  
                recargo = 0.10;
             
                 validar=false;
            }
             else if(tipoPago.equals("TD"))
            {
                factura2.setTipoPago(tipoPago); 
               recargo=0.05;
               
                validar=false;
            }
             
         
        }
        
          System.out.println("Artículos a facturar");
         while(opcion.equals("Y")){
            System.out.println("Ingrese el código del artículo a facturar: ");
            codigo=new Scanner(System.in).nextInt();
            posicion=buscarCodigo(articulos, codigo);
            if(posicion!=(-1)){
                
                DetalleFactura detalle=new DetalleFactura();
                detalle.setArticulo(articulos.get(posicion));
                System.out.println("Ingrese la cantidad de artículos: ");
                cantArticulos=new Scanner(System.in).nextInt();
                detalle.setCantidad(cantArticulos);
                factura2.agregarDetalle(detalle);
            }else{
                System.out.println("El código ingresado es incorrecto pruebe nuevamente");
            }
            
            System.out.println("¿Desea agregar otro artículo? \nPresione Y por si o N por no");
            opcion=new Scanner(System.in).nextLine();
        }
         
        double totalItems=factura2.calcularTotalItems();
         double totalRecargo = recargo * totalItems;   
        double totalFinal = totalRecargo + totalItems;
                
        System.out.println("La factura a pagar es");
        System.out.println("");
        System.out.println("Cliente: "+factura2.getCliente().getRazonSocial());
        System.out.println("Cuit: "+factura2.getCliente().getCuit());
        System.out.println("Fecha: "+factura2.getFecha().toString());
        System.out.println("Número de factura: "+factura2.getNumero());
        System.out.println("Tipo de Pago: "+factura2.getTipoPago());
        System.out.println("Código Item\t Denominación\t Precio\t Cantidad\t Subtotal");
        factura2.mostrarDetallesFactura();
        System.out.println("Subtotal: "+ totalItems);
        System.out.println("Recargo: "+ totalRecargo);
        System.out.println("Total: "+ totalFinal);
    }
      public static int buscarCodigo(List<Articulo> listaArticulos, int codigo) {
        int posicion = -1;
        for (int i = 0; i < listaArticulos.size(); i++) {
            if (listaArticulos.get(i).getCodigo()==codigo) {
                posicion = i;
            }
        }
        return posicion;
    }
}
