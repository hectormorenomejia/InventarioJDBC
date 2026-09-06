package sv.edu.utec.producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sv.edu.utec.datos.ConexionDB;

public class CRUD_Delete {

    public void eliminarProducto(int id) {
        String sql = "DELETE FROM producto WHERE id = ?";

        try (
                Connection cn = ConexionDB.obtenerConexion();
                PreparedStatement pstmt = cn.prepareStatement(sql)
        ) {
            pstmt.setInt(1, id);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Producto con ID " + id + " eliminado exitosamente.");
            } else {
                System.out.println("No se encontró ningún producto con el ID especificado.");
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar el producto: " + e.getMessage());
        }
    }
}