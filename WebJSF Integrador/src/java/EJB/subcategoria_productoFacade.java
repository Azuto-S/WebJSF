/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.subcategoria_producto;

/**
 *
 * @author jose2
 */
@Stateless
public class subcategoria_productoFacade extends AbstractFacade<subcategoria_producto> implements subcategoria_productoFacadeLocal {

    @PersistenceContext(unitName = "WebJSF_IntegradorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public subcategoria_productoFacade() {
        super(subcategoria_producto.class);
    }
    
}
