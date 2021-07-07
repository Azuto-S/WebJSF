/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import modelo.cliente;


public interface int_cliente {
    public boolean agregar(cliente c);
    public boolean editar(cliente c);
    public boolean eliminar(int cod);
    public cliente listarUnCliente(int dni);
    public ArrayList<cliente> listarTodosClientes();
}
