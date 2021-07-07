
package modelo;

import javax.persistence.Column;
import javax.persistence.Id;

public class trabajador {
    @Id
    @Column(name = "idtra")
    private int dni;
    
    @Column(name = "id_tipotrabajador")
    private int tipo;
    
    @Column(name = "nombretra")
    private String nombre;
    
    @Column(name = "ape_paternotra")
    private String ape_paterno;
    
    @Column(name = "ape_maternotra")
    private String ape_materno;
    
    @Column(name = "sexotra")
    private String sexo;
    
    @Column(name = "telefonotra")
    private String telefono;
    
    @Column(name = "correotra")
    private String correo;
    
    @Column(name = "contrasenotra")
    private String contrasena;
    
    @Column(name = "direcciontra")
    private String direccion;

    
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


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.dni;
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
        final trabajador other = (trabajador) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "trabajador{" + "dni=" + dni + '}';
    }

   
    
    
    
}
