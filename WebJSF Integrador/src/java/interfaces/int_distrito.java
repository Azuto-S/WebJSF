/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import modelo.distrito;


public interface int_distrito {
    public boolean agregar(distrito d);
    public boolean editar(distrito d);
    public boolean eliminar(int cod);
    public distrito listarUnDistrito(int id);
    public ArrayList<distrito> listarTodosDistritos();
}
