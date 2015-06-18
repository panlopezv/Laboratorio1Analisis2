/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author RealG4Life
 */
@Entity
@NamedQueries({
        @NamedQuery(name="Persona.findNombreLike",query="Select p from Persona p where p.nombre LIKE :nombre")})
public class Persona implements Serializable {
    @Id
    private int id;
    
    private String nombre;
    private String apellido;
    private Boolean conectado;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, Boolean conectado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.conectado = conectado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getConectado() {
        return conectado;
    }

    public void setConectado(Boolean conectado) {
        this.conectado = conectado;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", conectado=" + conectado + '}';
    }
    
    
}
