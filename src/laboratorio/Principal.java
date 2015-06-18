/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import interfases.ConexionEspecifica;
import java.util.List;
import modelos.ModeloTablaPersonas;
import persistence.Persona;

/**
 *
 * @author EST1629311
 */
public class Principal {

    public static List<Persona> personas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        ConexionEspecifica ce = ConexionEspecifica.getConexionEspecifica("LaboratorioPU");
        ModeloTablaPersonas mTabla = new ModeloTablaPersonas(ce.getControladorPersona().findPersonaEntities());
        
        UI_1 p = new UI_1(mTabla,ce);
        ce.agregarObservador(p);
        p.setVisible(true);

        UI_2 o = new UI_2(ce, ce.getControladorPersona().findPersonaEntities());
        ce.agregarObservador(o);
        o.setVisible(true);
    }
    
}
