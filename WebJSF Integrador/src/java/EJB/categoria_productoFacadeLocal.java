/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.categoria_producto;

/**
 *
 * @author jose2
 */
@Local
public interface categoria_productoFacadeLocal {

    void create(categoria_producto categoria_producto);

    void edit(categoria_producto categoria_producto);

    void remove(categoria_producto categoria_producto);

    categoria_producto find(Object id);

    List<categoria_producto> findAll();

    List<categoria_producto> findRange(int[] range);

    int count();
    
}
