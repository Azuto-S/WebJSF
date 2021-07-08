
package controlador;

import EJB.categoriapagoFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.categoriapago;

@ManagedBean
@SessionScoped
public class ManagedCategoriaPago {
    @EJB
    private categoriapagoFacadeLocal catPagoFacade;
    private List<categoriapago> listCatPago;
    private categoriapago catPago;

    public List<categoriapago> getListCatPago() {
        this.listCatPago = this.catPagoFacade.findAll();
        return listCatPago;
    }

    public void setListCatPago(List<categoriapago> listCatPago) {
        this.listCatPago = listCatPago;
    }

    public categoriapago getCatPago() {
        return catPago;
    }

    public void setCatPago(categoriapago catPago) {
        this.catPago = catPago;
    }
    
    @PostConstruct
    public void init(){
        this.catPago = new categoriapago();
    }
}
