package sv.edu.utec.datos;

public class ProbarConexion {
    public static void probarConexion() {

        try (var cn = ConexionDB.obtenerConexion()) {

            if (cn != null && !cn.isClosed()) {
                System.out.println("Conexion exitosa a: " +
                        cn.getMetaData().getURL());
            }

        } catch (Exception e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }
    }
}
