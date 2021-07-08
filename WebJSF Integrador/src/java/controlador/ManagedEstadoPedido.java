/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import EJB.estadopedidoFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.estadopedido;


@ManagedBean
@SessionScoped
public class ManagedEstadoPedido {
    @EJB
    private estadopedidoFacadeLocal estadopedidoFacade;
    private List<estadopedido> listEstadoPedido;
    private estadopedido estadopedido;

    
    public List<estadopedido> getListEstadoPedido() {
        this.listEstadoPedido = this.estadopedidoFacade.findAll();
        return listEstadoPedido;
    }

    public void setListEstadoPedido(List<estadopedido> listEstadoPedido) {
        
        this.listEstadoPedido = listEstadoPedido;
    }

    public estadopedido getEstadopedido() {
        return estadopedido;
    }

    public void setEstadopedido(estadopedido estadopedido) {
        this.estadopedido = estadopedido;
    }
    
    @PostConstruct
    public void init(){
        this.estadopedido = new estadopedido();
    }
}
