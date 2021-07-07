/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.estadopedido;

/**
 *
 * @author jose2
 */
@Stateless
public class estadopedidoFacade extends AbstractFacade<estadopedido> implements estadopedidoFacadeLocal {

    @PersistenceContext(unitName = "WebJSF_IntegradorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public estadopedidoFacade() {
        super(estadopedido.class);
    }
    
}
