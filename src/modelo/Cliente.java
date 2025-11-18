
package modelo;

import java.util.Date;

/**
 *
 * @author DxJtR
 */
public class Cliente {
    
    private String rutCliente,nombre,apPaterno,direccion;
    private Date FecNac;
    private int telefono,idCliente;

    public Cliente() {
    }

    public Cliente(String rutCliente, String nombre, String apPaterno, String direccion, Date FecNac, int telefono, int idCliente) {
        this.rutCliente = rutCliente;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.direccion = direccion;
        this.FecNac = FecNac;
        this.telefono = telefono;
        this.idCliente = idCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecNac() {
        return FecNac;
    }

    public void setFecNac(Date FecNac) {
        this.FecNac = FecNac;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rutCliente=" + rutCliente + ", nombre=" + nombre + ", apPaterno=" + apPaterno + ", direccion=" + direccion + ", FecNac=" + FecNac + ", telefono=" + telefono + ", idCliente=" + idCliente + '}';
    }
    
}
