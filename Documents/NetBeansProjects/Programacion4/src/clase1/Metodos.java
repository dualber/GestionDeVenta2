package clase1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos {

   private ArrayList<Estudiante> arrayEstudiante;

    public Metodos() {
    arrayEstudiante = new ArrayList();
    }
    
    public void ingresarStudiante(){
              int sw = JOptionPane.showOptionDialog(null, 
      "¿Existe un estudiante?", 
      "Almacenamiento de información", 
      JOptionPane.YES_NO_OPTION, 
      JOptionPane.QUESTION_MESSAGE, 
      null, null, null);

        while(sw == 0){
            arrayEstudiante.add(
                    new Estudiante(
                        JOptionPane.showInputDialog("Ingrese la cedula del estudiante"),
                        JOptionPane.showInputDialog("Ingrese el nombre del estudiante"),
                        JOptionPane.showInputDialog("Ingrese el apellido del estudiante"),
                        JOptionPane.showInputDialog("Ingrese el grado del estudiante")
                    )
            );
            
            sw = JOptionPane.showOptionDialog(null, 
              "¿Existe un nuevo estudiante?", 
              "Almacenamiento de información", 
              JOptionPane.YES_NO_OPTION, 
              JOptionPane.QUESTION_MESSAGE, 
              null, null, null);
        }
    }
    
    public String mostrarEstudiante(){
      String texto="";
      
        for (Estudiante estudiante : arrayEstudiante) {
           texto += "cedula:" +estudiante.getCedula()+" nombre: "+estudiante.getNombre()+ " Apellido: "+ estudiante.getApellido()+" grado: "+estudiante.getGrado();
            System.out.println("");
        }
      
      return texto;
    }
}
