/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ServicioDao {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarServicio(Servicio sr) {

        String sql = "INSERT INTO servicio(codigo, nombre, precio) VALUES (?,?,?)";
        try {
            con = cn.getConnetion();
            ps = con.prepareStatement(sql);
            ps.setString(1, sr.getCodigo());
            ps.setString(2, sr.getNombre());
            ps.setDouble(3, sr.getPrecio());
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

    public List listarservicios() {
        List<Servicio> listaServicio = new ArrayList();
        String sql = "SELECT * FROM servicio";

        try {
            con = cn.getConnetion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Servicio sr = new Servicio();

                sr.setId(rs.getInt("id"));
                sr.setCodigo(rs.getString("codigo"));
                sr.setNombre(rs.getString("nombre"));
                sr.setPrecio(rs.getDouble("precio"));
                listaServicio.add(sr);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return listaServicio;
    }

    public boolean eliminarServicio(int id) {
        String sql = "DELETE  FROM servicio WHERE id=?";

        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean modificarServicio(Servicio sr) {
        String sql = "UPDATE producto SET codigo=?, nombre=?,stock=?,precio=? WHERE id=?";

        try {
            con = cn.getConnetion();
            ps = con.prepareStatement(sql);
            ps.setString(1, sr.getCodigo());
            ps.setString(2, sr.getNombre());
            ps.setDouble(3, sr.getPrecio());
            ps.setInt(4, sr.getId());
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
    public Servicio buscarServicio(String codigo){
        
        String sql="SELECT * FROM servicio WHERE codigo=?";
        Servicio sr = new Servicio();
        try {
            con=cn.getConnetion();
            ps=con.prepareStatement(sql);
            ps.setString(1, codigo);
            rs=ps.executeQuery();
            if(rs.next()){
                sr.setNombre(rs.getString("nombre"));
                sr.setPrecio(rs.getInt("precio"));
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return sr;
    }
}