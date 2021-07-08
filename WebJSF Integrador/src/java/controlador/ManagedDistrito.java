
package controlador;

import EJB.distritoFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.distrito;


@ManagedBean
@SessionScoped
public class ManagedDistrito {
    @EJB
    private distritoFacadeLocal distritoFacade;
    private List<distrito> ListarDistrito;
    private distrito distri;

    public List<distrito> getListarDistrito() {
        this.ListarDistrito = this.distritoFacade.findAll();
        return ListarDistrito;
    }

    public void setListarDistrito(List<distrito> ListarDistrito) {
        
        this.ListarDistrito = ListarDistrito;
    }

    public distrito getDistri() {
        return distri;
    }

    public void setDistri(distrito distri) {
        this.distri = distri;
    }
    
    @PostConstruct
    public void init(){
        this.distri = new distrito();
    }
    
    
}
