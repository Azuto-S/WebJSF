/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.producto;

/**
 *
 * @author jose2
 */
@Stateless
public class productoFacade extends AbstractFacade<producto> implements productoFacadeLocal {

    @PersistenceContext(unitName = "WebJSF_IntegradorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public productoFacade() {
        super(producto.class);
    }
    
}
