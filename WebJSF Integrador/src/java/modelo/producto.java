
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class producto implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   
   @ManyToOne
   @JoinColumn(name = "id_sub")
   private subcategoria_producto subcat;
   
   @Column(name = "nombrepro")
   private String nombre;
   
   @Column(name = "preciopro")
   private double precio;
   
   @Column(name = "stockpro")
   private int stock;
  
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public subcategoria_producto getSubcat() {
        return subcat;
    }

    public void setSubcat(subcategoria_producto subcat) {
        this.subcat = subcat;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final producto other = (producto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "producto{" + "id=" + id + '}';
    }
   
}
