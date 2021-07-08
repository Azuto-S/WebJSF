
package controlador;

import EJB.subcategoria_productoFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.categoria_producto;
import modelo.subcategoria_producto;

@ManagedBean
@SessionScoped
public class ManagedSubCatPro {
    @EJB
    private subcategoria_productoFacadeLocal subCatFacade;
    private List<subcategoria_producto> listaSubCatPro;
    private subcategoria_producto subCatPro;
    private categoria_producto catPro;

    public List<subcategoria_producto> getListaSubCatPro() {
        this.listaSubCatPro = subCatFacade.findAll();
        return listaSubCatPro;
    }

    public void setListaSubCatPro(List<subcategoria_producto> listaSubCatPro) {
        this.listaSubCatPro = listaSubCatPro;
    }

    public subcategoria_producto getSubCatPro() {
        return subCatPro;
    }

    public void setSubCatPro(subcategoria_producto subCatPro) {
        this.subCatPro = subCatPro;
    }

    public categoria_producto getCatPro() {
        return catPro;
    }

    public void setCatPro(categoria_producto catPro) {
        this.catPro = catPro;
    }
    
    @PostConstruct
    public void init(){
        this.subCatPro = new subcategoria_producto();
        this.catPro = new categoria_producto();
    }
    
}
