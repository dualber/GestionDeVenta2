
package clase1;


public class Estudiante {
  private String cedula,nombre,apellido,grado;

    public Estudiante(String cedula, String nombre, String apellido, String grado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", grado=" + grado + '}';
    }


  
}
