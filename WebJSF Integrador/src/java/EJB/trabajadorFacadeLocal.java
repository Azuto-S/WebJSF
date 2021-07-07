/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.trabajador;

/**
 *
 * @author jose2
 */
@Local
public interface trabajadorFacadeLocal {

    void create(trabajador trabajador);

    void edit(trabajador trabajador);

    void remove(trabajador trabajador);

    trabajador find(Object id);

    List<trabajador> findAll();

    List<trabajador> findRange(int[] range);

    int count();
    
}
