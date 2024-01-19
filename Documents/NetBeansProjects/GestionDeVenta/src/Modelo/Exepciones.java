package Modelo;

public class Exepciones {

    public Exepciones() {

    }

    public boolean validarCedula(String cadena) {
        // Verificar si la cadena contiene solo dígitos
        if (!cadena.matches("\\d+") || cadena.length() != 10) {
            return false;
        } else {
            return true;
        }

    }

}
