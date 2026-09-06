package sv.edu.utec;

import sv.edu.utec.datos.ConexionDB;
import sv.edu.utec.datos.CrearTablas;
import sv.edu.utec.datos.ProbarConexion;
import sv.edu.utec.producto.CRUD_Create;
import sv.edu.utec.producto.CRUD_Select;

public class Main {

    public static void main(String[] args) {

        CrearTablas.crearTabla();
        ProbarConexion.probarConexion();

        CRUD_Create crear = new CRUD_Create();

        crear.crearProducto(7, "Monitor 24 pulgadas", 4);

        CRUD_Select leer = new CRUD_Select();
        leer.listarProductos();
    }

}