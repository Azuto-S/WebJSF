
package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class cliente {
    @Id
    @Column(name = "dnicli")
    private int dni;
    
    @Column(name = "nombrecli")
    private String nombre;
    
    @Column(name = "ape_paternocli")
    private String ape_paterno;
    
    @Column(name = "ape_maternocli")
    private String ape_materno;
    
    @Column(name = "sexocli")
    private String sexo;
    
    @Column(name = "telefonocli")
    private String telefono;
    
    @Column(name = "correocli")
    private String correo;
    
    @Column(name = "contrasenacli")
    private String contrasena;
    
    @Column(name = "id_distritocli")
    private int distrito;
    
    @Column(name = "direccioncli")
    private String direccion;
    
    @Column(name = "referenciacli")
    private String referencia;
    
    @Column(name = "nom_dis")
    String nom_dis;

    public String getNom_dis() {
        return nom_dis;
    }

    public void setNom_dis(String nom_dis) {
        this.nom_dis = nom_dis;
    }

    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe_paterno() {
        return ape_paterno;
    }

    public void setApe_paterno(String ape_paterno) {
        this.ape_paterno = ape_paterno;
    }

    public String getApe_materno() {
        return ape_materno;
    }

    public void setApe_materno(String ape_materno) {
        this.ape_materno = ape_materno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getDistrito() {
        return distrito;
    }

    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.dni;
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
        final cliente other = (cliente) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cliente{" + "dni=" + dni + '}';
    }
    
    
    
}
