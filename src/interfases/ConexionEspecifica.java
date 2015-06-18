/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfases;

import controladores.PersonaJpaController;
import java.util.List;
import persistence.Persona;

/**
 *
 * @author EST1629311
 * @author EST1573011
 */

// Sujeto especifico
public class ConexionEspecifica extends Conexion{
    private static ConexionEspecifica unicaConexion;
    private PersonaJpaController controladorPersona;
    
    private ConexionEspecifica(String persistenceUnitName) {
        iniciarConexion(persistenceUnitName);
        controladorPersona = new PersonaJpaController(getEmf());
        
    }
    
    public static ConexionEspecifica getConexionEspecifica(String persistenceUnitName){
        if(unicaConexion == null){
            unicaConexion=new ConexionEspecifica(persistenceUnitName);
        }
        return unicaConexion;
    }

    @Override
    public void insertar(Persona p) throws Exception{
        controladorPersona.create(p);
        notificar();
    }
    
    public List<Persona> mostrar(){
        return controladorPersona.findPersonaEntities();
    }

    public PersonaJpaController getControladorPersona() {
        return controladorPersona;
    }

    public void setControladorPersona(PersonaJpaController controladorPersona) {
        this.controladorPersona = controladorPersona;
    }
    
}
