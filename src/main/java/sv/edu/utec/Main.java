package sv.edu.utec;

import sv.edu.utec.datos.ConexionDB;
import sv.edu.utec.datos.CrearTablas;
import sv.edu.utec.datos.ProbarConexion;
import sv.edu.utec.producto.CRUD_Create;
import sv.edu.utec.producto.CRUD_Delete;
import sv.edu.utec.producto.CRUD_Select;
import sv.edu.utec.producto.CRUD_Update;

public class Main {

    public static void main(String[] args) {
        // 1. Validaciones iniciales
        CrearTablas.crearTabla();
        ProbarConexion.probarConexion();

        System.out.println("\n--- PROBANDO CREATE ---");
        CRUD_Create crear = new CRUD_Create();
        crear.crearProducto(7, "Monitor 24 pulgadas", 4);

        System.out.println("\n--- PROBANDO SELECT (Antes de modificar) ---");
        CRUD_Select leer = new CRUD_Select();
        leer.listarProductos();

        System.out.println("\n--- PROBANDO UPDATE ---");
        CRUD_Update actualizar = new CRUD_Update();
        // Actualizamos el producto con ID 7 cambiando su nombre y cantidad
        actualizar.actualizarProducto(7, "Monitor 27 pulgadas Gamer", 8);

        System.out.println("\n--- PROBANDO SELECT (Para verificar el Update) ---");
        leer.listarProductos();

        System.out.println("\n--- PROBANDO DELETE ---");
        CRUD_Delete eliminar = new CRUD_Delete();
        // Eliminamos el producto con ID 7
        eliminar.eliminarProducto(7);

        System.out.println("\n--- PROBANDO SELECT (Para verificar el Delete) ---");
        leer.listarProductos();
    }
}