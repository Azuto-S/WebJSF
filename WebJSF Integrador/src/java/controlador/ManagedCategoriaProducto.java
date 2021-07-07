
package controlador;

import EJB.categoria_productoFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.categoria_producto;

@ManagedBean
@SessionScoped
public class ManagedCategoriaProducto {
    private categoria_productoFacadeLocal catproFacade;
    private List<categoria_producto> listCatPro;
    private categoria_producto catPro;

    public List<categoria_producto> getListCatPro() {
        return listCatPro;
    }

    public void setListCatPro(List<categoria_producto> listCatPro) {
        this.listCatPro = this.catproFacade.findAll();
        this.listCatPro = listCatPro;
    }

    public categoria_producto getCatPro() {
        return catPro;
    }

    public void setCatPro(categoria_producto catPro) {
        this.catPro = catPro;
    }
    
    @PostConstruct
    public void init(){
        this.catPro = new categoria_producto();
    }
    
}
