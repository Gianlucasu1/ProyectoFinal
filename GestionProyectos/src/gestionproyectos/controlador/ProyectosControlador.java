/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionproyectos.controlador;



import gestionproyectos.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gianlucasorem
 */
public class ProyectosControlador {
     private static ProyectosControlador instance;
     private List<Persona> empleados = new ArrayList<>();
     
      
     
     
     
     
     
     
     public void setEmpleados(List <Persona> empleados){
     
     this.empleados=empleados;
     }
     
     
     
     
     
     
             
     
     

    private ProyectosControlador() {
    }

    public static ProyectosControlador getInstance() {
        if (instance == null) {
            instance = new ProyectosControlador();
        }
        return instance;
    }

    
}
