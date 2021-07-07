/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.detallepedido;

/**
 *
 * @author jose2
 */
@Local
public interface detallepedidoFacadeLocal {

    void create(detallepedido detallepedido);

    void edit(detallepedido detallepedido);

    void remove(detallepedido detallepedido);

    detallepedido find(Object id);

    List<detallepedido> findAll();

    List<detallepedido> findRange(int[] range);

    int count();
    
}
