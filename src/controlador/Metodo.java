// CRUD 
package controlador;

import bd.Conexion;
import modelo.Insumo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;

/**
 *
 * @author DxJtR
 */
public class Metodo {

    public boolean agregarInsumo(Insumo ins) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO insumo(nombre,precio,stock) VALUES(?,?,?)";

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, ins.getNombre());
            stmt.setInt(2, ins.getPrecio());
            stmt.setInt(3, ins.getStock());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al agregar el insumo, error tipo: " + e.getMessage());
            return false;
        }

    }

    public boolean agregarCliente(Cliente clt) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO cliente(rutCliente,nombre,apPaterno,fecNac,direccion,telefono) VALUES(?,?,?,?,?,?)";

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, clt.getRutCliente());
            stmt.setString(2, clt.getNombre());
            stmt.setString(3, clt.getApPaterno());
            stmt.setDate(4, new java.sql.Date(clt.getFecNac().getTime()));
            stmt.setString(5, clt.getDireccion());
            stmt.setInt(6, clt.getTelefono());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al agregar el cliente, error tipo: " + e.getMessage());
            return false;
        }

    }

    public boolean agregarEmpleado(Empleado emp) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO empleado (rutEmpleado,nombre,apPaterno,cargo) VALUES(?,?,?,?)";

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, emp.getRutEmpleado());
            stmt.setString(2, emp.getNombre());
            stmt.setString(3, emp.getApPaterno());
            stmt.setString(4, emp.getCargo());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al agregar el Empleado, error tipo: " + e.getMessage());
            return false;
        }

    }

    public boolean actualizarCliente(Cliente clt) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE cliente SET rutCliente = ?, nombre = ?, apPaterno = ?, fecNac = ?, direccion = ?, telefono = ? WHERE idCliente = ?";

            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setString(1, clt.getRutCliente());
            stmt.setString(2, clt.getNombre());
            stmt.setString(3, clt.getApPaterno());
            stmt.setDate(4, new java.sql.Date(clt.getFecNac().getTime()));
            stmt.setString(5, clt.getDireccion());
            stmt.setInt(6, clt.getTelefono());
            stmt.setInt(7, clt.getIdCliente());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al actualizar cliente, error tipo: " + e.getMessage());
            return false;
        }

    }

    public boolean actualizarInsumo(Insumo ins) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE insumo SET nombre = ?, precio = ?, stock = ? WHERE idInsumo = ?";

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, ins.getNombre());
            stmt.setInt(2, ins.getPrecio());
            stmt.setInt(3, ins.getStock());
            stmt.setInt(4, ins.getIdInsumo());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al actualizar insumo, error tipo: " + e.getMessage());
            return false;
        }

    }
    
    public boolean actualizarEmpleado(Empleado emp) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE empleado SET rutEmpleado = ?, nombre = ?, apPaterno = ?, cargo = ? WHERE idEmpleado = ?";

            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setString(1, emp.getRutEmpleado());
            stmt.setString(2, emp.getNombre());
            stmt.setString(3, emp.getApPaterno());
            stmt.setString(4, emp.getCargo());
            stmt.setInt(5, emp.getIdEmpleado());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al actualizar Empleado, error tipo: " + e.getMessage());
            return false;
        }

    }

    public boolean eliminarCliente(int id) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM cliente WHERE idCliente = ?";

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);

                stmt.executeUpdate();
                stmt.close();
                cnx.close();

                return true;

        } catch (SQLException e) {

            System.out.println("Error al eliminar el cliente, error tipo: " + e.getMessage());
            return false;
        }

    }

    public boolean eliminarInsumo(int id) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM insumo WHERE idInsumo = ?";

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);

                stmt.executeUpdate();
                stmt.close();
                cnx.close();

                return true;
            
        } catch (SQLException e) {

            System.out.println("Error al eliminar el insumo, error tipo: " + e.getMessage());
            return false;
        }

    }
    
    public boolean eliminarEmpleado(int id) {


        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM empleado WHERE idEmpleado = ?";

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);


                stmt.executeUpdate();
                stmt.close();
                cnx.close();

                return true;
            

        } catch (SQLException e) {

            System.out.println("Error al eliminar el Empleado, error tipo: " + e.getMessage());
            return false;
        }


    }

    public List<Cliente> listaClientes() {

        List<Cliente> lista = new ArrayList<>();

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM cliente";

            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente clt = new Cliente();
                
                clt.setIdCliente(rs.getInt("idCliente"));
                clt.setRutCliente(rs.getString("rutCliente"));
                clt.setNombre(rs.getString("nombre"));
                clt.setApPaterno(rs.getString("apPaterno"));
                clt.setFecNac(rs.getDate("fecNac"));
                clt.setDireccion(rs.getString("direccion"));
                clt.setTelefono(rs.getInt("telefono"));

                lista.add(clt);

            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {

            System.out.println("Error al listar los clientes, error tipo: " + e.getMessage());

        }
        return lista;

    }

    public List<Insumo> listaInsumos() {

        List<Insumo> lista2 = new ArrayList<>();

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM insumo";

            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Insumo ins = new Insumo();
                ins.setIdInsumo(rs.getInt("idInsumo"));
                ins.setNombre(rs.getString("nombre"));
                ins.setPrecio(rs.getInt("precio"));
                ins.setStock(rs.getInt("stock"));

                lista2.add(ins);

            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {

            System.out.println("Error al listar los insumos, error tipo: " + e.getMessage());

        }
        return lista2;

    }
    
    public List<Empleado> listaEmpleados() {

        List<Empleado> lista3 = new ArrayList<>();

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM empleado";

            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Empleado emp = new Empleado();
                
                emp.setIdEmpleado(rs.getInt("idEmpleado"));
                emp.setRutEmpleado(rs.getString("rutEmpleado"));
                emp.setNombre(rs.getString("nombre"));
                emp.setApPaterno(rs.getString("apPaterno"));   
                emp.setCargo(rs.getString("cargo"));

                lista3.add(emp);

            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {

            System.out.println("Error al listar los Empleados, error tipo: " + e.getMessage());

        }
        return lista3;

    }

    public Insumo buscarInsumo(int id) {

        Insumo i = new Insumo();

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM insumo WHERE idInsumo = ?";

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                i.setIdInsumo(rs.getInt("idInsumo"));
                i.setNombre(rs.getString("nombre"));
                i.setPrecio(rs.getInt("precio"));
                i.setStock(rs.getInt("stock"));
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {

            System.out.println("Error al buscar el Insumo, error tipo: " + e.getMessage());

        }
        return i;

    }
    
    public Cliente buscarCliente(int id) {

        Cliente clt = new Cliente();

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM cliente WHERE idCliente = ?";

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                clt.setIdCliente(rs.getInt("idCliente"));
                clt.setRutCliente(rs.getString("rutCliente"));
                clt.setNombre(rs.getString("nombre"));
                clt.setApPaterno(rs.getString("apPaterno"));
                clt.setFecNac(rs.getDate("fecNac"));
                clt.setDireccion(rs.getString("direccion"));
                clt.setTelefono(rs.getInt("telefono"));
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {

            System.out.println("Error al buscar el Cliente, error tipo: " + e.getMessage());

        }
        return clt;

    }
    
    public Empleado buscarEmpleado(int id) {

        Empleado emp = new Empleado();

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM empleado WHERE idEmpleado = ?";

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                emp.setIdEmpleado(rs.getInt("idEmpleado"));
                emp.setRutEmpleado(rs.getString("rutEmpleado"));
                emp.setNombre(rs.getString("nombre"));
                emp.setApPaterno(rs.getString("apPaterno"));   
                emp.setCargo(rs.getString("cargo"));
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {

            System.out.println("Error al buscar el Empleado, error tipo: " + e.getMessage());

        }
        return emp;

    }


}
