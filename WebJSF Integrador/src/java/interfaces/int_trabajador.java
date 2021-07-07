/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import modelo.trabajador;

public interface int_trabajador {
    public boolean agregar(trabajador t);
    public boolean editar(trabajador t);
    public boolean eliminar(int cod);
    public trabajador listarUnTrabajador(int dni);
    public ArrayList<trabajador> listarTodosTrabajadores();
}
