package sv.edu.utec.datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablas {

    public static void crearTabla() {

        String sql = "CREATE TABLE IF NOT EXISTS producto (" +
                "id INT PRIMARY KEY, " +
                "nombre VARCHAR(50), " +
                "cantidad INT)";

        try (
                Connection cn = ConexionDB.obtenerConexion();
                Statement st = cn.createStatement()
        ) {

            st.execute(sql);
            System.out.println("Tabla Producto Creada.");

        } catch (SQLException e) {
            System.out.println("Error al crear tabla: " + e.getMessage());
        }
    }
}