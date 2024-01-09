
package clase1;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        Metodos metodo = new Metodos();
        
        metodo.ingresarStudiante();
        JOptionPane.showMessageDialog(null,metodo.mostrarEstudiante());
    }
}
