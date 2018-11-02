/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos.modelo;

import java.time.LocalDate;

/**
 *
 * @author programador
 */
public class Alumno {
private int id;
private String nombre;
private LocalDate fecNac;
private boolean activo;

    public Alumno( String nombre, LocalDate fecNac, boolean activo) {
        
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.activo = activo;
    }

    public Alumno(int id, String nombre, LocalDate fecNac, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.activo = activo;
    }

    public Alumno() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


}
