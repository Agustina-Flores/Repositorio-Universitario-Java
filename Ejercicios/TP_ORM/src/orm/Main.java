/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orm;

import controlador.GestorPaciente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.DetalleHistoriaClinica;
import modelo.Domicilio;
import modelo.Especialidad;
import modelo.HistoriaClinica;
import modelo.Medico;
import modelo.Paciente;
import modelo.Turno;

/**
 *
 * @author Alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        //creo objetos
        GestorPaciente gp= new GestorPaciente();
        Domicilio domicilio=new Domicilio();
        Paciente paciente= new Paciente();
        HistoriaClinica historia=new HistoriaClinica();
        List<DetalleHistoriaClinica> detalles =new ArrayList<>();
        List<Turno> turnos=new ArrayList<>();
        List<Medico> medicos=new ArrayList<>();
        List<Especialidad> especialidades=new ArrayList<>();
        DetalleHistoriaClinica det1=new DetalleHistoriaClinica();
        DetalleHistoriaClinica det2=new DetalleHistoriaClinica();
        Especialidad esp1=new Especialidad();
        Especialidad esp2=new Especialidad();
        Medico med1=new Medico();
        Medico med2=new Medico();
        Turno tur1=new Turno();
        Turno tur2=new Turno();
        
        
        //seteo datos
        domicilio.setCalle("San Martín");
        domicilio.setLocalidad("Ciudad");
        domicilio.setNumero(1200);
        
        det1.setDiagnostico("Gripe");
        det1.setSintomas("Fiebre, dolor de garganta");
        det2.setDiagnostico("Fractura");
        det2.setSintomas("dolor de tobillo");
        detalles.add(det1);
        detalles.add(det2);
        
        historia.setNumero(334);
        historia.setDetalles(detalles);
        
        esp1.setDenominacion("Traumatologo");
        esp2.setDenominacion("Clinico");
        especialidades.add(esp1);
        especialidades.add(esp2);
        
        med1.setNombre("José");
        med1.setApellido("Perez");
        med1.setDni(12765897);
        med1.setMatricula(2344);
        med1.setEspecialidades(especialidades);
        
        med2.setNombre("Manuel");
        med2.setApellido("Gomez");
        med2.setDni(14556334);
        med2.setMatricula(1245);
        med2.setEspecialidades(especialidades);
        
        medicos.add(med1);
        medicos.add(med2);
        
        tur1.setMedico(medicos.get(0));
        tur1.setHora(13);
        tur1.setMinutos(23);
        
        tur2.setMedico(medicos.get(1));
        tur2.setHora(16);
        tur2.setMinutos(15);
        
        turnos.add(tur1);
        turnos.add(tur2);
        
        paciente.setNombre("Martin");
        paciente.setApellido("Lopez");
        paciente.setNroSocio(2345);
        paciente.setDni(37665889);
        paciente.setDomicilio(domicilio);
        paciente.setHistoria(historia);
        paciente.setTurnos(turnos);
        
        gp.guardar(paciente);
        paciente.toString();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
