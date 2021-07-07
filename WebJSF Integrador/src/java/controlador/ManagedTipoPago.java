
package controlador;

import EJB.tipopagoFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.tipopago;

@ManagedBean
@SessionScoped
public class ManagedTipoPago {
    private tipopagoFacadeLocal tipoPagoFacade;
    private List<tipopago> listTipoPago;
    private tipopago tipopa;

    public List<tipopago> getListTipoPago() {
        return listTipoPago;
    }

    public void setListTipoPago(List<tipopago> listTipoPago) {
        this.listTipoPago = this.tipoPagoFacade.findAll();
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
