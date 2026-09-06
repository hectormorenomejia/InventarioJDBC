# Sistema de Gestión de Inventario en Java (JDBC y H2)

Proyecto Maven desarrollado en Java para la gestión de un sistema de inventario, utilizando una base de datos embebida H2 y aplicando una arquitectura robusta por capas con la API JDBC.

---

## 📋 Descripción del Proyecto
Este proyecto forma parte de la tarea grupal orientada a construir una aplicación CRUD (Crear, Leer, Actualizar y Eliminar) conectada a una base de datos relacional H2. Se implementaron buenas prácticas de desarrollo de software, manejo seguro de excepciones (`SQLException`), cierre automático de recursos mediante `try-with-resources` y separación estricta de responsabilidades en paquetes.

---

## 🗂️ Estructura del Proyecto y Paquetes
El código fuente se encuentra organizado bajo una estricta arquitectura por capas:

* **`sv.edu.utec` (Paquete Principal):**
    * `Main.java`: Clase ejecutable principal que coordina el flujo de la aplicación y las llamadas a los componentes CRUD.
* **`sv.edu.utec.datos` (Paquete de Datos):**
    * `ConexionDB.java`: Gestiona la conexión JDBC con la base de datos H2 embebida (`jdbc:h2:./inventario`).
    * `CrearTablas.java`: Encargada de la inicialización y creación de la estructura DDL de la base de datos.
    * `ProbarConexion.java`: Valida la conectividad exitosa con el motor H2.
* **`sv.edu.utec.producto` (Paquete de Operaciones y Modelo):**
    * `CRUD_Create.java`: Inserta nuevos registros de productos de forma segura mediante `PreparedStatement`.
    * `CRUD_Select.java`: Consulta y lista los productos existentes utilizando `ResultSet`.
    * `CRUD_Update.java`: Modifica y actualiza la información de los productos en la base de datos.

---

## 👥 Integrantes del Grupo y Aportes
Todos los integrantes han registrado aportes activos (commits) en el repositorio oficial de Git:

1. **Ricardo Fabio Menjivar Chavez** — Carnet: `17-0613-2024`
2. **Hector Antonio Moreno Mejia** — Carnet: `25-4370-2023`
3. **Angel Otoniel Amaya Hernandez** — Carnet: `25-2531-2022`

---

## 🤖 Uso de Inteligencia Artificial

En cumplimiento con los lineamientos institucionales y los requisitos de la tarea (Sección 9.1), se declara el uso de herramientas de inteligencia artificial bajo las siguientes condiciones:

* **Herramientas utilizadas:** Asistentes de IA basados en modelos de lenguaje (ej. Gemini).
* **Partes del código donde se utilizó:**
    * Apoyo en la estructuración de sintaxis para los bloques `try-with-resources` en los componentes de actualización (`CRUD_Update`).
    * Revisión de buenas prácticas de manejo de excepciones SQL (`SQLException`).
* **Finalidad:** Consulta conceptual de sintaxis JDBC y optimización de consultas parametrizadas con `PreparedStatement`.

*Nota de comprensión:* Todo el código generado o consultado ha sido íntegramente revisado, comprendido y adaptado por los integrantes del grupo, quienes se encuentran plenamente capacitados para explicar, modificar y sustentar cualquier línea del proyecto durante la revisión en clase.

---

## 🛠️ Requisitos Técnicos y Ejecución
* **Java JDK:** Versión 11 o superior.
* **Gestor de Dependencias:** Apache Maven (`pom.xml` incluye la dependencia oficial del driver JDBC de H2).
* **Base de Datos:** H2 Database (modo embebido).