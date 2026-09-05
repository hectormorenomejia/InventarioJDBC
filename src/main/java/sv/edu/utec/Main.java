package sv.edu.utec;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import sv.edu.utec.datos.ConexionDB;

public class Main {

    public static void main(String[] args) {
        probarConexion();

        crearTabla();
    }

    private static void probarConexion() {
        try (Connection cn = ConexionDB.obtenerConexion()) {

            if (cn != null && !cn.isClosed()) {
                System.out.println("Conexion exitosa a: " + cn.getMetaData().getURL());
            }

        } catch (SQLException e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }
    }

    private static void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS producto (" +
                "id INT PRIMARY KEY, " +
                "nombre VARCHAR(50), " +
                "cantidad INT)";

        try (
                Connection cn = ConexionDB.obtenerConexion();
                Statement st = cn.createStatement()
        ) {
            st.execute(sql);
            System.out.println("Tabla Productos Lista.");

        } catch (SQLException e) {
            System.out.println("Error al crear tabla: " + e.getMessage());
        }

    }
}