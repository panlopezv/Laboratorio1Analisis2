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
    private Conexion unicaConexion;
    private List<Observador> observadores;
    private EntityManager em;
    private void iniciarConexion(String persistenceUnitName){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        em=emf.createEntityManager();
    }
    abstract void consultarServidor();
    
}
