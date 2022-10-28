/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpn.pkg2_colaboracion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agustina
 */
public class Expediente {
      private int id;
    private String letra;
    private int numero;
    private String descripcion;
    private String tipo;
    private String ambito;
    private List<Expediente> expHijos;
    private Expediente expPadre;
    private List<Control> controles;
    private List<EstadoControl> estadosCtrl;

    public Expediente() {
    }

    public Expediente(int id, String letra, int numero, String descripcion, String tipo, String ambito) {
        this.id = id;
        this.letra = letra;
        this.numero = numero;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.ambito = ambito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public List<Expediente> getExpHijos() {
        return expHijos;
    }

    public void setExpHijos(List<Expediente> expHijos) {
        this.expHijos = expHijos;
    }

    public Expediente getExpPadre() {
        return expPadre;
    }

    public void setExpPadre(Expediente expPadre) {
        this.expPadre = expPadre;
    }

    public List<Control> getControles() {
        return controles;
    }

    public void setControles(List<Control> controles) {
        this.controles = controles;
    }

    public List<EstadoControl> getEstadosCtrl() {
        return estadosCtrl;
    }

    public void setEstadosCtrl(List<EstadoControl> estadosCtrl) {
        this.estadosCtrl = estadosCtrl;
    }
    
    public List<Expediente> listaExpedientes(){
        List<Expediente> expedientes=new ArrayList<>();
        metodoRecursivo(expedientes, this);
        return expedientes;
    }
    
    private void metodoRecursivo(List<Expediente> expedientes, Expediente nodoActual){
        expedientes.add(nodoActual);
        if(nodoActual.getExpHijos()!=null){
            for(Expediente expHijo: nodoActual.getExpHijos()){
                metodoRecursivo(expedientes, expHijo);
            }
        }
    }
    
    public String getCaratulaExpediente(){
        return Integer.toString(this.numero)+"-"+this.letra+"-"+this.descripcion;
    }
    
    public String getControlesObligatorios(){
        String ctrlObli="";
        for(Control ctrl:getControles()){
            if(ctrl.isEsObligatorio()==true){
                ctrlObli+=ctrl.getDenominacion()+", ";
            }
        }
        return ctrlObli;
    }
    
    public boolean getEstadoControles(){
        boolean estado=false;
        for(Control ctrl:getControles()){
            if(ctrl.isEsObligatorio()==true){
                for(EstadoControl estadoCtrl: ctrl.getEstadosControles()){
                    if(estadoCtrl.isAprobado()==true){
                        estado= true;
                    }else{
                        estado= false;
                    }
                }
            }
        }
        return estado;
    }
}
