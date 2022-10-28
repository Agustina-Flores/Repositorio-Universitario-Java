/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import Vista.JFPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class PersonaCtrl implements ActionListener {

    private JFPersona personaJF;
    private Persona personaMod = new Persona();
    private DefaultTableModel tablaPersona;
    private List<Persona> listaPersona = new ArrayList<>();

    public PersonaCtrl(JFPersona personaJF) {
        this.personaJF = personaJF;
        personaJF.setVisible(true);
        this.personaJF.getBtnEjecutar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.personaJF.getBtnEjecutar())) {
            try {
                this.personaMod.getPersDao().conectar(this.personaJF.getTxtPuerto().getText(), this.personaJF.getTxtHost().getText(),
                        this.personaJF.getTxtBaseDatos().getText(), this.personaJF.getTxtUsuario().getText(), this.personaJF.getTxtClave().getText());
  //      this.personaMod.getPersDao().conectar("3306","localhost","practicajdbc","root","");
                System.out.println("1111");

                if (this.personaJF.getTxtConsulta().getText().contains("SELECT")) {
                    this.personaJF.getjTableResultado().setModel(this.mostrarTabla(this.personaJF.getTxtConsulta().getText()));
                } else if (this.personaJF.getTxtConsulta().getText().contains("INSERT")) {
                    System.out.println("2222");
                    boolean estado = this.personaMod.consultaInsert(this.personaJF.getTxtConsulta().getText());
                    if (estado) {
                        JOptionPane.showMessageDialog(null, "CONSULTA CORRECTA");
                    } else {
                        JOptionPane.showMessageDialog(null, "CONSULTA INCORRECTA, REVISE LA SINTAXIS O LOS DATOS");
                    }
                } else if (this.personaJF.getTxtConsulta().getText().contains("UPDATE")) {
                    boolean estado = this.personaMod.consultaUpdate(this.personaJF.getTxtConsulta().getText());
                    if (estado) {
                        JOptionPane.showMessageDialog(null, "CONSULTA CORRECTA");
                    } else {
                        JOptionPane.showMessageDialog(null, "CONSULTA INCORRECTA, REVISE LA SINTAXIS O LOS DATOS");
                    }
                } else if (this.personaJF.getTxtConsulta().getText().contains("DELETE")) {
                    boolean estado = this.personaMod.consultaDelete(this.personaJF.getTxtConsulta().getText());
                    if (estado) {
                        JOptionPane.showMessageDialog(null, "CONSULTA CORRECTA");
                    } else {
                        JOptionPane.showMessageDialog(null, "CONSULTA INCORRECTA, REVISE LA SINTAXIS O LOS DATOS");
                    }
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public DefaultTableModel mostrarTabla(String select) {
        this.listaPersona = this.personaMod.consultaSelect(select);
        int contadorTabla = 0;
        String[][] tabla = {};
        if (select.contains("Nombre") || select.contains("nombre")) {
            String columnas[] = {"Nombre"};
            tablaPersona = new DefaultTableModel(tabla, columnas);
            if (listaPersona != null) {
                for (int i = 0; i < this.listaPersona.size(); i++) {
                    tablaPersona.insertRow(contadorTabla, new Object[]{});
                    tablaPersona.setValueAt(listaPersona.get(i).getNombre(), contadorTabla, 0);
                    contadorTabla++;
                }
            }
        } else if (select.contains("Apellido") || select.contains("apellido")) {
            String columnas[] = {"Apellido"};
            tablaPersona = new DefaultTableModel(tabla, columnas);
            if (listaPersona != null) {
                for (int i = 0; i < this.listaPersona.size(); i++) {
                    tablaPersona.insertRow(contadorTabla, new Object[]{});
                    tablaPersona.setValueAt(listaPersona.get(i).getApellido(), contadorTabla, 0);
                    contadorTabla++;
                }
            }
        } else if (select.contains("Edad") || select.contains("edad")) {
            String columnas[] = {"Edad"};
            tablaPersona = new DefaultTableModel(tabla, columnas);
            if (listaPersona != null) {
                for (int i = 0; i < this.listaPersona.size(); i++) {
                    tablaPersona.insertRow(contadorTabla, new Object[]{});
                    tablaPersona.setValueAt(listaPersona.get(i).getEdad(), contadorTabla, 0);
                    contadorTabla++;
                }
            }

        } else if (select.contains("fechaAlta") || select.contains("FechaAlta")) {
            String columnas[] = {"FechaAlta"};
            tablaPersona = new DefaultTableModel(tabla, columnas);
            if (listaPersona != null) {
                for (int i = 0; i < this.listaPersona.size(); i++) {
                    tablaPersona.insertRow(contadorTabla, new Object[]{});
                    tablaPersona.setValueAt(listaPersona.get(i).getFechaAlta(), contadorTabla, 0);
                    contadorTabla++;
                }
            }

        } else if ((select.contains("Nombre") && select.contains("Apellido")) || (select.contains("nombre") && select.contains("apellido"))) {
            String columnas[] = {"Nombre", "Apellido"};
            tablaPersona = new DefaultTableModel(tabla, columnas);
            if (listaPersona != null) {
                for (int i = 0; i < this.listaPersona.size(); i++) {
                    tablaPersona.insertRow(contadorTabla, new Object[]{});
                    tablaPersona.setValueAt(listaPersona.get(i).getNombre(), contadorTabla, 0);
                    tablaPersona.setValueAt(listaPersona.get(i).getApellido(), contadorTabla, 1);
                    contadorTabla++;
                }
            }

        } else if ((select.contains("Nombre") && select.contains("Edad")) || (select.contains("nombre") && select.contains("edad"))) {
            String columnas[] = {"Nombre", "Edad",};
            tablaPersona = new DefaultTableModel(tabla, columnas);
            if (listaPersona != null) {
                for (int i = 0; i < this.listaPersona.size(); i++) {
                    tablaPersona.insertRow(contadorTabla, new Object[]{});
                    tablaPersona.setValueAt(listaPersona.get(i).getNombre(), contadorTabla, 0);
                    tablaPersona.setValueAt(listaPersona.get(i).getEdad(), contadorTabla, 1);
                    contadorTabla++;
                }
            }

        } else if ((select.contains("Nombre") && select.contains("fechaAlta")) || (select.contains("nombre") && select.contains("FechaAlta"))) {
            String columnas[] = {"Nombre", "FechaAlta"};
            tablaPersona = new DefaultTableModel(tabla, columnas);
            if (listaPersona != null) {
                for (int i = 0; i < this.listaPersona.size(); i++) {
                    tablaPersona.insertRow(contadorTabla, new Object[]{});
                    tablaPersona.setValueAt(listaPersona.get(i).getNombre(), contadorTabla, 0);
                    tablaPersona.setValueAt(listaPersona.get(i).getFechaAlta(), contadorTabla, 1);
                    contadorTabla++;
                }
            }

        } else if ((select.contains("Apellido") && select.contains("Edad")) || (select.contains("apellido") && select.contains("edad"))) {
            String columnas[] = {"Apellido", "Edad"};
            tablaPersona = new DefaultTableModel(tabla, columnas);
            if (listaPersona != null) {
                for (int i = 0; i < this.listaPersona.size(); i++) {
                    tablaPersona.insertRow(contadorTabla, new Object[]{});
                    tablaPersona.setValueAt(listaPersona.get(i).getApellido(), contadorTabla, 0);
                    tablaPersona.setValueAt(listaPersona.get(i).getEdad(), contadorTabla, 1);
                    contadorTabla++;
                }
            }
        } else if ((select.contains("Apellido") && select.contains("fechaAlta")) || (select.contains("apellido") && select.contains("FechaAlta"))) {
            String columnas[] = {"Apellido", "FechaAlta"};
            tablaPersona = new DefaultTableModel(tabla, columnas);
            if (listaPersona != null) {
                for (int i = 0; i < this.listaPersona.size(); i++) {
                    tablaPersona.insertRow(contadorTabla, new Object[]{});
                    tablaPersona.setValueAt(listaPersona.get(i).getApellido(), contadorTabla, 0);
                    tablaPersona.setValueAt(listaPersona.get(i).getFechaAlta(), contadorTabla, 1);
                    contadorTabla++;
                }
            }
        } else if ((select.contains("Edad") && select.contains("fechaAlta")) || (select.contains("edad") && select.contains("FechaAlta"))) {
            String columnas[] = {"Edad", "FechaAlta"};
            tablaPersona = new DefaultTableModel(tabla, columnas);
            if (listaPersona != null) {
                for (int i = 0; i < this.listaPersona.size(); i++) {
                    tablaPersona.insertRow(contadorTabla, new Object[]{});
                    tablaPersona.setValueAt(listaPersona.get(i).getEdad(), contadorTabla, 0);
                    tablaPersona.setValueAt(listaPersona.get(i).getFechaAlta(), contadorTabla, 1);
                    contadorTabla++;
                }
            }
        } else {
            String columnas[] = {"Nombre", "Apellido", "Edad", "FechaAlta"};
            tablaPersona = new DefaultTableModel(tabla, columnas);
            if (listaPersona != null) {
                for (int i = 0; i < this.listaPersona.size(); i++) {
                    tablaPersona.insertRow(contadorTabla, new Object[]{});
                    tablaPersona.setValueAt(listaPersona.get(i).getNombre(), contadorTabla, 0);
                    tablaPersona.setValueAt(listaPersona.get(i).getApellido(), contadorTabla, 1);
                    tablaPersona.setValueAt(listaPersona.get(i).getEdad(), contadorTabla, 2);
                    tablaPersona.setValueAt(listaPersona.get(i).getFechaAlta(), contadorTabla, 3);
                    contadorTabla++;
                }
            }
        }

        return tablaPersona;
    }

}
