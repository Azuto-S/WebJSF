
package controlador;

import EJB.tipopagoFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.tipopago;


@ManagedBean
@SessionScoped
public class ManagedTipoPago {
    @EJB
    private tipopagoFacadeLocal tipoPagoFacade;
    private List<tipopago> listTipoPago;
    private tipopago tipopa;

    public List<tipopago> getListTipoPago() {
        this.listTipoPago = this.tipoPagoFacade.findAll();
        return listTipoPago;
    }

    public void setListTipoPago(List<tipopago> listTipoPago) {
        
        this.listTipoPago = listTipoPago;
    }

    public tipopago getTipopa() {
        return tipopa;
    }

    public void setTipopa(tipopago tipopa) {
        this.tipopa = tipopa;
    }
    
    @PostConstruct
    public void init(){
        this.tipopa = new tipopago();
    }
}
