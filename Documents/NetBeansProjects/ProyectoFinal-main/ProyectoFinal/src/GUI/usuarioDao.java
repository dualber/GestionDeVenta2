package GUI;

import java.util.ArrayList;
import java.util.List;

public class usuarioDao {
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public usuarioDao() {
        usuarios = new ArrayList<>();
    }

    public int buscarUsuario(String usuario) {
        int indice = -1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUsuario().equals(usuario)) {
                indice = i;
            }
        }
        return indice;
    }

    public boolean agregarUsuario(Usuario usuario) {
        if (buscarUsuario(usuario.getUsuario()) == -1) {
            usuarios.add(usuario);
            return true;
        }
        return false;
    }

    public Usuario obtenerUsuario(String usuario) {
        int indice = buscarUsuario(usuario);
        if (indice != -1) {
            return usuarios.get(indice);
        }
        return null;
    }

}
