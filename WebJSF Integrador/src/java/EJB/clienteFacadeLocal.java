/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.cliente;

/**
 *
 * @author jose2
 */
@Local
public interface clienteFacadeLocal {

    void create(cliente cliente);

    void edit(cliente cliente);

    void remove(cliente cliente);

    cliente find(Object id);

    List<cliente> findAll();

    List<cliente> findRange(int[] range);

    int count();
    
}
