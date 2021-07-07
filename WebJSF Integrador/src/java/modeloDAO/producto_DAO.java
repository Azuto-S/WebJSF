/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;
import config.Conexion;
import interfaces.int_producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.producto;

public class producto_DAO implements int_producto{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    producto p;
    ArrayList<producto>lista=new ArrayList<>();

    @Override
    public boolean agregar(producto p) {
        try {
            String sql="insert into producto (id_subcategoria,nombre,precio,stock) values("
                    +p.getSubcategoria()+",'"+p.getNombre()+"',"+p.getPrecio()+","+p.getStock()+")";
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(producto_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean editar(producto p) {
        try {
            String sql="update producto set "
                    +"id_subcategoria="+p.getSubcategoria()+", "
                    +"nombre='"+p.getNombre()+"', "
                    +"precio="+p.getPrecio()+", "
                    +"stock="+p.getStock()+" where id="+p.getId();
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(producto_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;
    }

    @Override
    public boolean eliminar(int cod) {
        try {
            String sql="delete from producto where id="+cod;
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(producto_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public producto listarUnProducto(int id) {
        try {
            String sql="select id,nombre_sub,nombre,precio,stock from producto,subcategoria"
                    +" where producto.id_subcategoria=subcategoria.id_sub and producto.id="+id;
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
           while(rs.next()){
               p =  new producto();
               p.setId(rs.getInt("id"));
               p.setNom_sub(rs.getString("nombre_sub"));
               p.setNombre(rs.getString("nombre"));
               p.setPrecio(rs.getDouble("precio"));
               p.setStock(rs.getInt("stock"));
           }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(producto_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    @Override
    public ArrayList<producto> listarTodosProducto() {
         try {
            String sql="select id,nombre_sub,nombre,precio,stock from producto,subcategoria"
                    +" where producto.id_subcategoria=subcategoria.id_sub";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
           while(rs.next()){
               p =  new producto();
               p.setId(rs.getInt("id"));
               p.setNom_sub(rs.getString("nombre_sub"));
               p.setNombre(rs.getString("nombre"));
               p.setPrecio(rs.getDouble("precio"));
               p.setStock(rs.getInt("stock"));
               lista.add(p);
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(producto_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
