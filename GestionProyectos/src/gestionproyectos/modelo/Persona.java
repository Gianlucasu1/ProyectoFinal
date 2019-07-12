/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionproyectos.modelo;


import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author gianlucasorem
 */
 public class Persona {

private String nombre;
private String ID;
private List<Proyecto> proyectos;


public void setNombre(String nombre){
this.nombre=nombre;

}

    public Persona(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
    }
    
}
