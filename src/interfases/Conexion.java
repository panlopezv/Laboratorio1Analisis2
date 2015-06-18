/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfases;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistence.Persona;

/**
 *
 * @author EST1629311
 */
// Sujeto (Objeto observable)
public abstract class Conexion {
    private List<Observador> observadores;
    private EntityManagerFactory emf;
    
    abstract void insertar(Persona p) throws Exception;
    abstract void eliminar(int id) throws Exception;
    
    protected void iniciarConexion(String persistenceUnitName){
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        observadores=new ArrayList<>();
    }
    
    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }

    public void setEm(EntityManagerFactory emf) {
        this.emf = emf;
    }    
    
    public void agregarObservador(Observador o){
        observadores.add(o);
    }
    
    public void eliminarObservador(Observador o){
        observadores.remove(o);
    }
    
    public void notificar(){
        observadores.stream().forEach((o) -> {
            o.actualizar();
        });
    }
}
