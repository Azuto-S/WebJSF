/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.categoriapago;

/**
 *
 * @author jose2
 */
@Local
public interface categoriapagoFacadeLocal {

    void create(categoriapago categoriapago);

    void edit(categoriapago categoriapago);

    void remove(categoriapago categoriapago);

    categoriapago find(Object id);

    List<categoriapago> findAll();

    List<categoriapago> findRange(int[] range);

    int count();
    
}
