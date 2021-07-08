
package controlador;

import EJB.pedidoFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import modelo.categoriapago;
import modelo.cliente;
import modelo.detallepedido;
import modelo.estadopedido;
import modelo.pedido;
import modelo.tipopago;


public class ManagedPedido {
    private pedidoFacadeLocal pedidoFacade;
    private List<pedido> listaPedido;
    private pedido pedid;
    private estadopedido estadoPedido;
    private tipopago tipoPago;
    private categoriapago catPago;
    private cliente cli;
    private detallepedido detallePedido;

    public List<pedido> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(List<pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    public pedido getPedid() {
        return pedid;
    }

    public void setPedid(pedido pedid) {
        this.pedid = pedid;
    }

    public estadopedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(estadopedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public tipopago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(tipopago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public categoriapago getCatPago() {
        return catPago;
    }

    public void setCatPago(categoriapago catPago) {
        this.catPago = catPago;
    }

    public cliente getCli() {
        return cli;
    }

    public void setCli(cliente cli) {
        this.cli = cli;
    }

    public detallepedido getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(detallepedido detallePedido) {
        this.detallePedido = detallePedido;
    }
    
    @PostConstruct
    public void init(){
        this.pedid = new pedido();
        this.estadoPedido = new estadopedido();
        this.tipoPago = new tipopago();
        this.catPago = new categoriapago();
        this.cli = new cliente();
        this.detallePedido = new detallepedido();
    }
    
}
