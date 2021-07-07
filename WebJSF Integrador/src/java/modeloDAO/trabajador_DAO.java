/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;
import config.Conexion;
import interfaces.int_trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.trabajador;

public class trabajador_DAO implements int_trabajador{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    trabajador t;
    ArrayList<trabajador>lista = new ArrayList<>();
    @Override
    public boolean agregar(trabajador t) {
        try {
            String sql="insert into trabajador (id,id_tipotrabajador,nombre,ape_paterno,ape_materno,"
                + "sexo,telefono,correo,contrasena,direccion) values("+t.getDni()+
                ","+t.getTipo()+",'"+t.getNombre()+"','"+t.getApe_paterno()+"','"+t.getApe_materno()+"','"+
                t.getSexo()+"','"+t.getTelefono()+"','"+t.getCorreo()+"','"+t.getContrasena()+"','"+
                t.getDireccion()+"')";
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(trabajador_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean editar(trabajador t) {
         try {
            String sql="update trabajador set "
                    +"id_tipotrabajador="+t.getTipo()+", "
                    +"nombre='"+t.getNombre()+"', "
                    +"ape_paterno='"+t.getApe_paterno()+"', "
                    +"ape_materno='"+t.getApe_materno()+"', "
                    +"sexo='"+t.getSexo()+"', "
                    +"telefono='"+t.getTelefono()+"', "
                    +"correo='"+t.getCorreo()+"', "
                    +"contrasena='"+t.getContrasena()+"', "
                    +"direccion='"+t.getDireccion()+"' where id="+t.getDni();
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(trabajador_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(int cod) {
        try {
            String sql="delete from trabajador where id="+t.getDni();
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(trabajador_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public trabajador listarUnTrabajador(int dni) {
        try {
            String sql="select id,id_tipotrabajador,nombre,ape_paterno,ape_materno,"
                + "sexo,telefono,correo,contrasena,direccion from trabajador"
                 +  " where id="+dni;
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                t= new trabajador();
                t.setDni(rs.getInt("id"));
                t.setTipo(rs.getInt("id_tipotrabajador"));
                t.setNombre(rs.getString("nombre"));
                t.setApe_paterno(rs.getString("ape_paterno"));
                t.setApe_materno(rs.getString("ape_materno"));
                t.setSexo(rs.getString("sexo"));
                t.setTelefono(rs.getString("telefono"));
                t.setCorreo(rs.getString("correo"));
                t.setContrasena(rs.getString("contrasena"));
                t.setDireccion(rs.getString("direccion"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(trabajador_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    @Override
    public ArrayList<trabajador> listarTodosTrabajadores() {
        try {
            String sql="select * from trabajador";
                
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                t= new trabajador();
                t.setDni(rs.getInt("id"));
                t.setTipo(rs.getInt("id_tipotrabajador"));
                t.setNombre(rs.getString("nombre"));
                t.setApe_materno(rs.getString("ape_paterno"));
                t.setApe_paterno(rs.getString("ape_materno"));
                t.setSexo(rs.getString("sexo"));
                t.setTelefono(rs.getString("telefono"));
                t.setCorreo(rs.getString("correo"));
                t.setContrasena(rs.getString("contrasena"));
                t.setDireccion(rs.getString("direccion"));
                lista.add(t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(trabajador_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    
}
