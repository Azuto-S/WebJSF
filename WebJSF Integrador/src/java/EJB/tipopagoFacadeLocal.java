/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.tipopago;

/**
 *
 * @author jose2
 */
@Local
public interface tipopagoFacadeLocal {

    void create(tipopago tipopago);

    void edit(tipopago tipopago);

    void remove(tipopago tipopago);

    tipopago find(Object id);

    List<tipopago> findAll();

    List<tipopago> findRange(int[] range);

    int count();
    
}
