package sv.edu.utec.producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sv.edu.utec.datos.ConexionDB;

public class CRUD_Update {

    public void actualizarProducto(int id, String nuevoNombre, int nuevaCantidad) {
        String sql = "UPDATE producto SET nombre = ?, cantidad = ? WHERE id = ?";

        try (
                Connection cn = ConexionDB.obtenerConexion();
                PreparedStatement pstmt = cn.prepareStatement(sql)
        ) {
            pstmt.setString(1, nuevoNombre);
            pstmt.setInt(2, nuevaCantidad);
            pstmt.setInt(3, id);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Producto actualizado exitosamente.");
            } else {
                System.out.println("No se encontró un producto con el ID especificado.");
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e.getMessage());
        }
    }
}