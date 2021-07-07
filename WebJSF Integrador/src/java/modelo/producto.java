
package modelo;


public class producto {
   private int id;
   private int subcategoria;
   private String nombre;
   private double precio;
   private int stock;
   private String nom_sub;
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(int subcategoria) {
        this.subcategoria = subcategoria;
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

    public String getNom_sub() {
        return nom_sub;
    }

    public void setNom_sub(String nom_sub) {
        this.nom_sub = nom_sub;
    }
   
}
