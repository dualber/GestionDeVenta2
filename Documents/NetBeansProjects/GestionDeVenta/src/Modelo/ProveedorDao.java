package Modelo;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sun.misc.MessageUtils;

public class ProveedorDao {

    Connection con;
    PreparedStatement ps;
    Conexion cn = new Conexion();
    ResultSet rs;

    public boolean registraProveedor(Proveedor pr) {

        String sql = "INSERT INTO Proveedor(nit, nombre, telefono,direccion,razon_social) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnetion();
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, pr.getNit());
            ps.setString(2, pr.getNombre());
            ps.setString(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.setString(5, pr.getRazon());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public List listarProveedor() {
        List<Proveedor> listaPr = new ArrayList();

        try {
            String sql = "SELECT * FROM proveedor";
            con = cn.getConnetion();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Proveedor pr = new Proveedor();

                pr.setId(rs.getInt("id"));
                pr.setNit(rs.getString("nit"));
                pr.setNombre(rs.getString("nombre"));
                pr.setTelefono(rs.getString("telefono"));
                pr.setDireccion(rs.getString("direccion"));
                pr.setRazon(rs.getString("razon_social"));
                listaPr.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaPr;
    }

    public boolean eliminarProveedor(int id) {

        String sql = "DELETE FROM proveedor WHERE id=?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }

    }
    
    public boolean ModificarProveedor(Proveedor pr){
        String sql ="UPDATE proveedor SET nit=?,nombre=?, telefono=?, direccion=?, razon_social=? WHERE id=?";
        
        try {
            ps= (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, pr.getNit());
            ps.setString(2, pr.getNombre());
            ps.setString(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.setString(5, pr.getRazon());
            ps.setInt(6, pr.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}
