/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import modelo.subcategoria_producto;


public interface int_subCatProducto {
    public boolean agregar(subcategoria_producto sc);
    public boolean editar(subcategoria_producto sc);
    public boolean eliminar(int cod);
    public subcategoria_producto listarUnaSubCat(int id);
    public ArrayList<subcategoria_producto> listarTodosSubCat();
}
