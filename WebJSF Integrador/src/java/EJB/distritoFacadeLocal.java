/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.distrito;

/**
 *
 * @author jose2
 */
@Local
public interface distritoFacadeLocal {

    void create(distrito distrito);

    void edit(distrito distrito);

    void remove(distrito distrito);

    distrito find(Object id);

    List<distrito> findAll();

    List<distrito> findRange(int[] range);

    int count();
    
}
