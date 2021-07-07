/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;
import config.Conexion;
import interfaces.int_subCatProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.subcategoria_producto;
public class subCatProducto_DAO implements int_subCatProducto{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    subcategoria_producto sc;
    ArrayList<subcategoria_producto>lista=new ArrayList<>();

    @Override
    public boolean agregar(subcategoria_producto sc) {
        try {
            String sql="insert into subcategoria (id_categoria,nombre_sub) values ("
                    +sc.getCategoria()+",'"+sc.getNombre()+"')";
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(subCatProducto_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean editar(subcategoria_producto sc) {
         try {
            String sql="update subcategoria set "
                    +"id_categoria="+sc.getCategoria()+", "
                    +"nombre_sub='"+sc.getNombre()+"' where id_sub="+sc.getId();
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(subCatProducto_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(int cod) {
         try {
            String sql="delete from subcategoria where id_sub="+cod;
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(subCatProducto_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public subcategoria_producto listarUnaSubCat(int id) {
        try {
            String sql="select id_sub,nombre_cat,nombre_sub from subcategoria,categoria "
                    +"where subcategoria.id_categoria = categoria.id and subcategoria.id_sub="+id;
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                sc=new subcategoria_producto();
                sc.setId(rs.getInt("id_sub"));
                sc.setNombre_cat(rs.getString("nombre_cat"));
                sc.setNombre(rs.getString("nombre_sub"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(subCatProducto_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sc;
    }

    @Override
    public ArrayList<subcategoria_producto> listarTodosSubCat() {
        try {
            String sql="select id_sub,nombre_sub,nombre_cat from subcategoria, categoria "
                    + " where subcategoria.id_categoria = categoria.id";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                sc=new subcategoria_producto();
                sc.setId(rs.getInt("id_sub"));
                sc.setNombre(rs.getString("nombre_sub"));
                sc.setNombre_cat(rs.getString("nombre_cat"));
                
                lista.add(sc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(subCatProducto_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
