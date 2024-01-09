
package Modelo;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDao {
    Conexion cn = new Conexion(); // se llama la clase que crea la conexion con la base de datos.
    Connection con; // comando para implementar los scrips de sql.
    PreparedStatement ps; // comando para enviar los parametros a la base de datos.
    ResultSet rs;
    
    /*
    pasos para realizar una insercion de un objeto a una base de datos.
    paso 1: inicializar la variables necesesarias como Conexion, connection y PrepareStatement.
    paso 2: crear la funcion de regristo con retorno booleano y con los parametros de un objeto
    paso 3: crear el script de sql para insertar un nuevo objeto en la base de datos esto se realiza mediante una variable string.
    paso 4: iniciar un try catch finally y dentro del try inicializar la conexion a la base de datos 
    paso 5: inicializar el envio de escript de sql a la base de datos con preparestatement 
    paso 6: enviar por parameros segun el tipo de variables todos los tipos de datos del objeto a enviar a la base de datos. 
    paso 7: ejecutar el envio de parametros y retornar true.
    paso 8: en el catch implementar el SQLexeption y mostrar un mensaje en caso tal alla un error. y retornar false.}
    paso 9: dentro de finnally realizar otro try catch y cerrar la conexion con la base de datos.
    paso 10: en el catch implemetar un SQLexeption e implementar un mensaje de error 
    */
    
    public boolean RegistrarCliente(Cliente cl){
        String sql = "INSERT INTO clientes(cedula, nombre, telefono, direccion, razon_social) VALUES (?,?,?,?,?)";
        //comando sql para insertar un nuevo cliente.
        try {
            con = cn.getConnetion(); // se inicia una conexion 
            ps = (PreparedStatement) con.prepareStatement(sql); // se envia el comando a la base de datos:
            ps.setString(1, cl.getCedula()); // se envian los parametros del objeto cliente
            ps.setString(2, cl.getNombre()); // se envian los parametros del objeto cliente
            ps.setString(3, cl.getTelefono()); // se envian los parametros del objeto cliente
            ps.setString(4, cl.getDireccion()); // se envian los parametros del objeto cliente
            ps.setString(5, cl.getRazon()); // se envian los parametros del objeto cliente
            ps.execute(); // se ejecuta el envio de parametos, la cual es necesario para enviarse. 
            
            return true;  // se retorna  como vedadero el envio de datos a la base 
        } catch (SQLException e) {
            // si algo sale mal, se envia un mensaje de error y se retorna false.
            JOptionPane.showMessageDialog(null, e.toString()); 
            return false;
        }
        // como siguiente se crea un nuevo try chatch en un finally para cerrar la conexion.
        finally{
            try {
                con.close(); // cerramos la conexion 
            } catch (SQLException e) {
                System.out.println(e.toString()); // en caso de algun error se muestra un mensaje. 
            }
        }
    }
    
    public List listarClientes(){
      List<Cliente> ListaCl = new ArrayList();
      String sql = "SELECT * FROM clientes";
      
        try {
            con = cn.getConnetion();
            ps= (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Cliente cl = new Cliente();
                cl.setId(rs.getInt("id"));
                cl.setCedula(rs.getString("cedula"));
                cl.setNombre(rs.getString("nombre"));
                cl.setTelefono(rs.getString("Telefono"));
                cl.setDireccion(rs.getString("Direccion"));
                cl.setRazon(rs.getString("razon_social"));
                ListaCl.add(cl);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaCl;
    }
    
    public boolean EliminarCliente(int id){
        String sql= "DELETE FROM clientes WHERE id=?";
        
        try {
            ps =(PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    public boolean ModificarCliente(Cliente cl){
        String sql ="UPDATE clientes SET cedula=?, nombre=?, telefono=?, direccion=?, razon_social=? WHERE id=?";
        try {
           ps= (PreparedStatement) con.prepareStatement(sql);
           ps.setString(1, cl.getCedula());
           ps.setString(2, cl.getNombre());
           ps.setString(3, cl.getTelefono());
           ps.setString(4, cl.getDireccion());
           ps.setString(5, cl.getRazon());
           ps.setInt(6, cl.getId());
           ps.execute();
           return true;
           
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
        
    }
}


