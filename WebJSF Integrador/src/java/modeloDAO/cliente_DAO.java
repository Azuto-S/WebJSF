/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;
import config.Conexion;
import interfaces.int_cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.cliente;

public class cliente_DAO implements int_cliente{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    cliente c;
    ArrayList<cliente>lista=new ArrayList<>();

    @Override
    public boolean agregar(cliente c) {
        
        try {
            String sql="insert into cliente (dnicli,nombrecli,ape_paternocli,ape_maternocli,"
                + "sexocli,telefonocli,correocli,contrasenacli,id_distritocli,direccioncli,referenciacli) values("+c.getDni()+
                ",'"+c.getNombre()+"','"+c.getApe_paterno()+"','"+c.getApe_materno()+"','"+
                c.getSexo()+"','"+c.getTelefono()+"','"+c.getCorreo()+"','"+c.getContrasena()+"',"+
                c.getDistrito()+",'"+c.getDireccion()+"','"+c.getReferencia()+"')";
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            
                Logger.getLogger(cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        return false;
    }

    @Override
    public boolean editar(cliente c) {
      
        try {
            String sql="update cliente set "
                    +"nombrecli='"+c.getNombre()+"', "
                    +"ape_paternocli='"+c.getApe_paterno()+"', "
                    +"ape_maternocli='"+c.getApe_materno()+"', "
                    +"sexocli='"+c.getSexo()+"', "
                    +"telefonocli='"+c.getTelefono()+"', "
                    +"correocli='"+c.getCorreo()+"', "
                    +"contrasenacli='"+c.getContrasena()+"', "
                    +"id_distritocli="+c.getDistrito()+", "
                    +"direccioncli='"+c.getDireccion()+"', "
                    +"referenciacli='"+c.getReferencia()+"' where dni="+c.getDni();
            con= cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             return false;   
    }

    @Override
    public boolean eliminar(int cod) {
        try {
            String sql="delete from cliente where dni="+cod;
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public cliente listarUnCliente(int dni) {
        try {
            String sql="select dnicli,nombrecli,ape_paternocli,ape_maternocli,"
                + "sexocli,telefonocli,correocli,contrasenacli,nom_discli,direccioncli,referenciacli from cliente, distrito "
                 +  "where cliente.id_distritocli = distrito.id and cliente.dnicli="+dni;
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c= new cliente();
                c.setDni(rs.getInt("dnicli"));
                c.setNombre(rs.getString("nombrecli"));
                c.setApe_materno(rs.getString("ape_paternocli"));
                c.setApe_paterno(rs.getString("ape_maternocli"));
                c.setSexo(rs.getString("sexocli"));
                c.setTelefono(rs.getString("telefonocli"));
                c.setCorreo(rs.getString("correocli"));
                c.setContrasena(rs.getString("contrasenacli"));
                c.setNom_dis(rs.getString("nom_discli"));
                c.setDireccion(rs.getString("direccioncli"));
                c.setReferencia(rs.getString("referenciacli"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    @Override
    public ArrayList<cliente> listarTodosClientes() {
        try {
            String sql="select dnicli,nombrecli,ape_paternocli,ape_maternocli,"
                + "sexocli,telefonocli,correocli,contrasenacli,nom_discli,direccioncli,referenciacli from cliente, distrito "
                + " where cliente.id_distritocli = distrito.id";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c=new cliente();
                c.setDni(rs.getInt("dnicli"));
                c.setNombre(rs.getString("nombrecli"));
                c.setApe_materno(rs.getString("ape_paternocli"));
                c.setApe_paterno(rs.getString("ape_maternocli"));
                c.setSexo(rs.getString("sexocli"));
                c.setTelefono(rs.getString("telefonocli"));
                c.setCorreo(rs.getString("correocli"));
                c.setContrasena(rs.getString("contrasenacli"));
                c.setNom_dis(rs.getString("nom_discli"));
                c.setDireccion(rs.getString("direccioncli"));
                c.setReferencia(rs.getString("referenciacli"));
                lista.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
