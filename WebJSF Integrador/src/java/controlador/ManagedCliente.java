
package controlador;

import EJB.clienteFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.cliente;
import modelo.distrito;

@ManagedBean
@SessionScoped
public class ManagedCliente {
    @EJB
    private clienteFacadeLocal clienteFacade;
    private List<cliente> listaCliente;
    private cliente cli;
    private distrito dis;

    public List<cliente> getListaCliente() {
        this.listaCliente = clienteFacade.findAll();
        return listaCliente;
    }

    public void setListaCliente(List<cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public cliente getCli() {
        return cli;
    }

    public void setCli(cliente cli) {
        this.cli = cli;
    }

    public distrito getDis() {
        return dis;
    }

    public void setDis(distrito dis) {
        this.dis = dis;
    }
    
    @PostConstruct
    public void init(){
        this.cli = new cliente();
        this.dis = new distrito();
    }
}
