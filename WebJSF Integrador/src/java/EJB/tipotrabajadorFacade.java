/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.tipotrabajador;

/**
 *
 * @author jose2
 */
@Stateless
public class tipotrabajadorFacade extends AbstractFacade<tipotrabajador> implements tipotrabajadorFacadeLocal {

    @PersistenceContext(unitName = "WebJSF_IntegradorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public tipotrabajadorFacade() {
        super(tipotrabajador.class);
    }
    
}
