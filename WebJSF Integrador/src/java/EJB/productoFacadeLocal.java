/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.producto;

/**
 *
 * @author jose2
 */
@Local
public interface productoFacadeLocal {

    void create(producto producto);

    void edit(producto producto);

    void remove(producto producto);

    producto find(Object id);

    List<producto> findAll();

    List<producto> findRange(int[] range);

    int count();
    
}
