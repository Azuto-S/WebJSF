/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.tipotrabajador;

/**
 *
 * @author jose2
 */
@Local
public interface tipotrabajadorFacadeLocal {

    void create(tipotrabajador tipotrabajador);

    void edit(tipotrabajador tipotrabajador);

    void remove(tipotrabajador tipotrabajador);

    tipotrabajador find(Object id);

    List<tipotrabajador> findAll();

    List<tipotrabajador> findRange(int[] range);

    int count();
    
}
