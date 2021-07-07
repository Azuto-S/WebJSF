
package modeloDAO;

import config.Conexion;
import interfaces.int_distrito;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.distrito;


public class distrito_DAO implements int_distrito{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    distrito d;
    ArrayList<distrito>lista=new ArrayList<>();
    @Override
    public boolean agregar(distrito d) {
        try {
            String sql="insert into distrito (nom_dis,costoenvio) values('"
                    +d.getNombre()+"',"+d.getCosto()+")";
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(distrito_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean editar(distrito d) {
        try {
            String sql="update distrito set "
                    +"nom_dis='"+d.getNombre()+"', "
                    +"costoenvio="+d.getCosto()+" where id="+d.getId();
            con= cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
         
        } catch (SQLException ex) {
            Logger.getLogger(distrito_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            return false;
    }

    @Override
    public boolean eliminar(int cod) {
        try {
            String sql="delete from distrito where id="+cod;
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(distrito_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public distrito listarUnDistrito(int id) {
        try {
            String sql="select id,nom_dis,costoenvio from distrito where id="+id;
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                d=new distrito();
                d.setId(rs.getInt("id"));
                d.setNombre(rs.getString("nom_dis"));
                d.setCosto(rs.getDouble("costoenvio"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(distrito_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }

    @Override
    public ArrayList<distrito> listarTodosDistritos() {
         try {
            String sql="select * from distrito";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                d=new distrito();
                d.setId(rs.getInt("id"));
                d.setNombre(rs.getString("nom_dis"));
                d.setCosto(rs.getDouble("costoenvio"));
                lista.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(distrito_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    
}
