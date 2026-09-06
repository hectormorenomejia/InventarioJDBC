package sv.edu.utec.producto;

import sv.edu.utec.datos.ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD_Select {

    public void listarProductos() {

        String sql = "SELECT id, nombre, cantidad FROM producto";

        try (
                Connection cn = ConexionDB.obtenerConexion();
                PreparedStatement ps = cn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {

            while (rs.next()) {

                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int cantidad = rs.getInt("cantidad");

                System.out.println(
                        "ID: " + id +
                                " | Nombre: " + nombre +
                                " | Cantidad: " + cantidad
                );
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar: " + e.getMessage());
        }
    }
}