/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfases;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author EST1629311
 */
public abstract class Conexion {
    private List<Observador> observadores;
    private EntityManagerFactory emf;
    public void iniciarConexion(String persistenceUnitName){
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
    }
    abstract void consultarServidor();

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
}
