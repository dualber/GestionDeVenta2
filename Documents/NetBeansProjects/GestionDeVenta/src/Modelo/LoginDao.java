
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory;

public class LoginDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn= new Conexion();
    
    public Login log(String correo, String pass){
       Login l= new Login();
       String sql="SELECT * FROM usuarios WHERE correo=? AND pass=?";
       try{
           con = cn.getConnetion();
           ps = con.prepareStatement(sql);
           ps.setString(1, correo);
           ps.setString(2, pass);
           rs= ps.executeQuery();
           
           if(rs.next()){
               l.setId(rs.getInt("id"));
               l.setNombre(rs.getString("nombre"));
               l.setCorreo(rs.getString("correo"));
               l.setPass(rs.getString("pass"));
           }
       }
       catch(SQLException e){
           System.out.println(e.toString());
       }
       return l;
    }
}
