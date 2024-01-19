package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ProductoDao {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarProducto(Producto pr) {

        String sql = "INSERT INTO producto(codigo, nombre,stock, precio) VALUES (?,?,?,?)";

        try {
            con = cn.getConnetion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getCodigo());
            ps.setString(2, pr.getNombre());
            ps.setInt(3, pr.getStock());
            ps.setDouble(4, pr.getPrecio());
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

    public List listarProductos() {
        List<Producto> listaPro = new ArrayList();

        String sql = "SELECT * FROM producto";
        try {
            con = cn.getConnetion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Producto pro = new Producto();

                pro.setId(rs.getInt("id"));
                pro.setCodigo(rs.getString("codigo"));
                pro.setNombre(rs.getString("nombre"));
                pro.setStock(rs.getInt("stock"));
                pro.setPrecio(rs.getDouble("precio"));
                listaPro.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaPro;
    }

    public void consultarProveedor(JComboBox proveedor) {
        String sql = "SELECT nombre FROM proveedor";

        try {
            con = cn.getConnetion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                proveedor.addItem(rs.getString("nombre"));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }

    public boolean eliminarProducto(int id) {

        String sql = "DELETE FROM producto where id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
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

    public boolean modificarProducto(Producto pro) {
        String sql = "UPDATE producto SET codigo=?, nombre=?,stock=?,precio=? WHERE id=?";

        try {
            con = cn.getConnetion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setInt(3, pro.getStock());
            ps.setDouble(4, pro.getPrecio());
            ps.setInt(5, pro.getId());
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

    public Producto BuscarProducto(String codigo) {
        String sql = "SELECT * FROM producto where codigo=?";
        Producto pro = new Producto();
        try {
            con=cn.getConnetion();
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
             rs = ps.executeQuery();
            if (rs.next()) {
                pro.setNombre(rs.getString("nombre"));
                pro.setPrecio(rs.getDouble("precio"));
                pro.setStock(rs.getInt("stock"));

            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pro;
    }

}
