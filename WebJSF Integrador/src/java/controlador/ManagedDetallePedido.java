
package controlador;

import EJB.detallepedidoFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.detallepedido;
import modelo.producto;

@ManagedBean
@SessionScoped
public class ManagedDetallePedido {
    @EJB
    private detallepedidoFacadeLocal detalleFacade;
    private List<detallepedido> listaDetalle;
    private detallepedido detalle;
    private producto pro;

    public List<detallepedido> getListaDetalle() {
        this.listaDetalle = detalleFacade.findAll();
        return listaDetalle;
    }

    public void setListaDetalle(List<detallepedido> listaDetalle) {
        this.listaDetalle = listaDetalle;
    }

    public detallepedido getDetalle() {
        return detalle;
    }

    public void setDetalle(detallepedido detalle) {
        this.detalle = detalle;
    }

    public producto getPro() {
        return pro;
    }

    public void setPro(producto pro) {
        this.pro = pro;
    }
    
    @PostConstruct
    public void init(){
        this.detalle = new detallepedido();
        this.pro = new producto();
    }
}
