
package controlador;

import EJB.productoFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.producto;
import modelo.subcategoria_producto;

@ManagedBean
@SessionScoped
public class ManagedProducto {
    @EJB
    private productoFacadeLocal proFacade;
    private List<producto> listaPro;
    private producto pro;
    private subcategoria_producto subcatPro;

    public List<producto> getListaPro() {
        this.listaPro = proFacade.findAll();
        return listaPro;
    }

    public void setListaPro(List<producto> listaPro) {
        this.listaPro = listaPro;
    }

    public producto getPro() {
        return pro;
    }

    public void setPro(producto pro) {
        this.pro = pro;
    }

    public subcategoria_producto getSubcatPro() {
        return subcatPro;
    }

    public void setSubcatPro(subcategoria_producto subcatPro) {
        this.subcatPro = subcatPro;
    }
    
    @PostConstruct
    public void init(){
        this.pro = new producto();
        this.subcatPro = new subcategoria_producto();
    }
    
}
