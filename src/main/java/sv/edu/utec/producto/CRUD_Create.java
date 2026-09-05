package sv.edu.utec.producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sv.edu.utec.datos.ConexionDB;

public class CRUD_Create {

    public void crearProducto(int id, String nombre, int cantidad) {

        String sql = "INSERT INTO producto (id, nombre, cantidad) VALUES (?, ?, ?)";

        try (
                Connection cn = ConexionDB.obtenerConexion();
                PreparedStatement ps = cn.prepareStatement(sql)
        ) {

            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setInt(3, cantidad);

            ps.executeUpdate();

            System.out.println("Producto creado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }
}