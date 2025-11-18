
package modelo;

/**
 *
 * @author DxJtR
 */
public class Insumo {
    
    private String nombre;
    private int idInsumo,precio,stock;
    
    private Cliente cliente;
    private Empleado empleado;

    public Insumo() {
    }

    public Insumo(String nombre, int idInsumo, int precio, int stock, Cliente cliente, Empleado empleado) {
        this.nombre = nombre;
        this.idInsumo = idInsumo;
        this.precio = precio;
        this.stock = stock;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Insumo{" + "nombre=" + nombre + ", idInsumo=" + idInsumo + ", precio=" + precio + ", stock=" + stock + ", cliente=" + cliente + ", empleado=" + empleado + '}';
    }

}
