/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.subcategoria_producto;

/**
 *
 * @author jose2
 */
@Local
public interface subcategoria_productoFacadeLocal {

    void create(subcategoria_producto subcategoria_producto);

    void edit(subcategoria_producto subcategoria_producto);

    void remove(subcategoria_producto subcategoria_producto);

    subcategoria_producto find(Object id);

    List<subcategoria_producto> findAll();

    List<subcategoria_producto> findRange(int[] range);

    int count();
    
}
