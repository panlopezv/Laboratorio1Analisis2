/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfases;

/**
 *
 * @author EST1629311
 * @author EST1573011
 */
public class ConexionEspecifica extends Conexion{
    private static ConexionEspecifica unicaConexion;
    private ConexionEspecifica(String persistenceUnitName) {
        iniciarConexion(persistenceUnitName);
    }
    public static ConexionEspecifica getConexionEspecifica(String persistenceUnitName){
        if(unicaConexion == null){
            unicaConexion=new ConexionEspecifica(persistenceUnitName);
        }
        return unicaConexion;
    }
    @Override
    void consultarServidor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
