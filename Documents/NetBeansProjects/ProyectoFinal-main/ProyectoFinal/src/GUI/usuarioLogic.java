package GUI;

public class usuarioLogic {
    private static  usuarioDao usuarioDao = new usuarioDao();
     
    public static boolean autentificar(String usuario, String contrasena){
       if(obtener(usuario) != null){
        Usuario usuarioConsulta = obtener(usuario);
          if(usuarioConsulta.getUsuario().equals(usuario)&& usuarioConsulta.getContrasena().equals(contrasena)){
              return true;
           }
           else {
               return false;
           }
       }
       else{
           return false;
       }
    }

    public static boolean insertar( Usuario usuario){
     return usuarioDao.agregarUsuario(usuario);
    }  
    public static Usuario obtener( String usuario){
     return usuarioDao.obtenerUsuario(usuario);
    }

}
