package sv.edu.utec;

import sv.edu.utec.datos.ConexionDB;
import sv.edu.utec.datos.CrearTablas;
import sv.edu.utec.datos.ProbarConexion;
import sv.edu.utec.producto.CRUD_Create;

public class Main {

    public static void main(String[] args) {

        CrearTablas.crearTabla();
        ProbarConexion.probarConexion();

        CRUD_Create crear = new CRUD_Create();

        crear.crearProducto(3, "Teclado de Menbrana", 7);
        crear.crearProducto(4, "Monitor 14 pulgadas", 2);
    }

}