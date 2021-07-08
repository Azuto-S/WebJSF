
package controlador;

import EJB.tipotrabajadorFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.tipotrabajador;



@ManagedBean
@SessionScoped
public class ManagedTipoTrabajador {
    @EJB
    private tipotrabajadorFacadeLocal tipotrabaFacade;
    private List<tipotrabajador> listaTipoTrab;
    private tipotrabajador tipotra;

    public List<tipotrabajador> getListaTipoTrab() {
        this.listaTipoTrab = this.tipotrabaFacade.findAll();
        return listaTipoTrab;
    }

    public void setListaTipoTrab(List<tipotrabajador> listaTipoTrab) {
        
        this.listaTipoTrab = listaTipoTrab;
    }

    public tipotrabajador getTipotra() {
        return tipotra;
    }

    public void setTipotra(tipotrabajador tipotra) {
        this.tipotra = tipotra;
    }
    
    @PostConstruct
     public void init(){
        this.tipotra = new tipotrabajador();
    }
}
