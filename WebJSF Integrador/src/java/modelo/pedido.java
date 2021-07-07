
package modelo;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class pedido implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "idestadope")
    private estadopedido esta;
    
    @ManyToOne
    @JoinColumn(name = "idpg")
    private tipopago tipopa;
    
    @ManyToOne
    @JoinColumn(name = "idcatpago")
    private categoriapago catpago;
    
    @ManyToOne
    @JoinColumn(name = "dnicli")
    private cliente cli;
    
    @ManyToOne
    @JoinColumn(name = "iddetallepe")
    private detallepedido deta;
    
    @Column(name = "fecha")
    private Date fechape;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public estadopedido getEsta() {
        return esta;
    }

    public void setEsta(estadopedido esta) {
        this.esta = esta;
    }

    public tipopago getTipopa() {
        return tipopa;
    }

    public void setTipopa(tipopago tipopa) {
        this.tipopa = tipopa;
    }

    public categoriapago getCatpago() {
        return catpago;
    }

    public void setCatpago(categoriapago catpago) {
        this.catpago = catpago;
    }

    public cliente getCli() {
        return cli;
    }

    public void setCli(cliente cli) {
        this.cli = cli;
    }

    public detallepedido getDeta() {
        return deta;
    }

    public void setDeta(detallepedido deta) {
        this.deta = deta;
    }

    public Date getFechape() {
        return fechape;
    }

    public void setFechape(Date fechape) {
        this.fechape = fechape;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
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
        final pedido other = (pedido) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pedido{" + "id=" + id + '}';
    }
    
}
