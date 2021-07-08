
package controlador;

import EJB.trabajadorFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.tipotrabajador;
import modelo.trabajador;

@ManagedBean
@SessionScoped
public class ManagedTrabajador {
    @EJB
    private trabajadorFacadeLocal trabFacade;
    private List<trabajador> listaTraba;
    private trabajador traba;
    private tipotrabajador tipoTra;

    public List<trabajador> getListaTraba() {
        this.listaTraba = trabFacade.findAll();
        return listaTraba;
    }

    public void setListaTraba(List<trabajador> listaTraba) {
        this.listaTraba = listaTraba;
    }

    public trabajador getTraba() {
        return traba;
    }

    public void setTraba(trabajador traba) {
        this.traba = traba;
    }

    public tipotrabajador getTipoTra() {
        return tipoTra;
    }

    public void setTipoTra(tipotrabajador tipoTra) {
        this.tipoTra = tipoTra;
    }
    
    @PostConstruct
    public void init(){
        this.traba = new trabajador();
        this.tipoTra = new tipotrabajador();
    }
}
