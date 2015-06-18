/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import persistence.Persona;

/**
 *
 * @author RealG4Life
 */

public class ModeloTablaPersonas extends AbstractTableModel {
    private List<Persona> personas;
    private String columnas[] = {"Nombre", "Apellido", "Conectado"};

    public ModeloTablaPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona per = this.personas.get(rowIndex);
        switch(columnIndex){
            case 0: return per.getNombre();
            case 1: return per.getApellido();
            case 2: return per.getConectado();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: personas.get(rowIndex).setNombre((String)aValue);
                break;
            case 1: 
                personas.get(rowIndex).setApellido((String)aValue);
                break;
            case 2: 
                personas.get(rowIndex).setConectado((Boolean)aValue);
                break;
            default:
                break;
                
                
        }
    }
}
