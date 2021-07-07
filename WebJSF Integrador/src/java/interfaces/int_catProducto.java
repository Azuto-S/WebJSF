/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import modelo.categoria_producto;


public interface int_catProducto {
    public boolean agregar(categoria_producto cp);
    public boolean editar(categoria_producto cp);
    public boolean eliminar(int cod);
    public categoria_producto listarUnaCategoria(int id);
    public ArrayList<categoria_producto> listarTodosCategoria();
    
}
