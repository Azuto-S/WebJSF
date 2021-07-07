/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.detallepedido;

/**
 *
 * @author jose2
 */
@Stateless
public class detallepedidoFacade extends AbstractFacade<detallepedido> implements detallepedidoFacadeLocal {

    @PersistenceContext(unitName = "WebJSF_IntegradorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public detallepedidoFacade() {
        super(detallepedido.class);
    }
    
}
