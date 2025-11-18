
package modelo;

/**
 *
 * @author DxJtR
 */
public class Empleado {
    
    private int idEmpleado;
    private String rutEmpleado,nombre,apPaterno,cargo;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String rutEmpleado, String nombre, String apPaterno, String cargo) {
        this.idEmpleado = idEmpleado;
        this.rutEmpleado = rutEmpleado;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.cargo = cargo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getRutEmpleado() {
        return rutEmpleado;
    }

    public void setRutEmpleado(String rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", rutEmpleado=" + rutEmpleado + ", nombre=" + nombre + ", apPaterno=" + apPaterno + ", cargo=" + cargo + '}';
    }
 
}
