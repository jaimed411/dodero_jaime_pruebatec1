<p align="center">
  <img src="https://github.com/jaimed411/dodero_jaime_pruebatec1/blob/main/pruebatec1.jpg" alt="foto">
</p>

## OBJETIVO: Desarrollo de una Aplicación de Gestión de Empleados

El objetivo de esta prueba es evaluar tus conocimientos en Java, incluyendo sintaxis, estructuras repetitivas, estructuras selectivas, manejo de colecciones y operaciones CRUD (Crear, Leer, Actualizar y Borrar) utilizando JPA (Java Persistence API) para interactuar con una base de datos.

## Descripción de la Aplicación:

La aplicación desarrollada es un sistema de gestión de empleados para la empresa DOD4NET con un menú interactivo que permite realizar operaciones como agregar nuevos empleados, ver lista de empleados por orden alfabético, actualizar información de cada empleado, eliminar a un empleado, buscar empleados por cargo y ver le fecha de incio de cada empleado. La aplicación está implementada en Java y utiliza Java Persistence API (JPA) para la persistencia de datos.

## Requisitos previos:

Antes de ejecutar la aplicación, asegúrese de tener instalado lo siguiente:
- Entorno IDE, al ser posible Netbeans IDE 17
- Java Development Kit (JDK) - versión 17
- Apache Maven

## Instrucciones de Ejecución:
- Compilación del Proyecto:
  - Abra una terminal o línea de comandos en el directorio raíz del proyecto.
  - Ejecute el siguiente comando para compilar el proyecto:
    mvn clean install
- Ejecución de la Aplicación:
  - Ejecute el siguiente comando para ejecutar la aplicación:
    java -jar target/pruebatec1-1.0-SNAPSHOT.jar
- Interactuar con la Aplicación: Se presentará un menú interactivo en la consola. Siga las instrucciones en pantalla para seleccionar las operaciones deseadas (agregar, ver lista, actualizar, eliminar, buscar empleado, ver fecha de inicio y salir). Se recomienda realizar pruebas. Añade empleados, obeserva la lista que vas creando, actualice y/o elimine empleados para verificar el correcto funcionamiento.

## Supuestos Considerados:
Al desarrollar la aplicación, se han considerado los siguientes supuestos:
- Entrada de Datos Válida: Se espera que el usuario proporcione entradas válidas durante la interacción con la aplicación. Si se pone 0 o =<7, aparecerá un error.
- Formato de Fecha: Se asume que el usuario ingresará la fecha de inicio en el formato "YYYY-MM-DD".
- Entrada de Salario: Se asume que el usuario ingresará el salario como un número decimal. Si se ingresa un valor no numérico, se mostrará un error.
- ID de Empleado: Al buscar, actualizar o eliminar un empleado, se asume que el usuario ingresará correctamente el ID del empleado. Si se proporciona un ID no válido, aparecerá un error.
- Base de Datos: Se asume que la base de datos configurada en el archivo persistence.xml está disponible y accesible durante la ejecución de la aplicación.

## Base de datos: 
La aplicación utiliza una base de datos embebida proporcionada por JPA. Asegúrese de que la configuración de la base de datos en el archivo persistence.xml sea adecuada. En cuanto al proceso de configuración de la base de datos, Maven es utilizado para manejar las dependencias y la construcción del proyecto. Maven ha simplificado la gestión de dependencias y la construcción del proyecto y esta vinculada directamente a MySQL. User = "root" Contraseña = ""

## Operaciones de Actualización y Eliminación:
Antes de realizar operaciones de actualización o eliminación, el usuario deberá confirmar su acción para evitar cambios accidentales.

## Conexión a Internet:
No se requiere conexión a Internet para ejecutar la aplicación después de la compilación.

## Conclusión:
La aplicación de DOD4NET proporciona una interfaz simple para gestionar a todos los empleados y está diseñada para ser fácil de usar. Al seguir las instrucciones anteriores, deberías poder compilar, ejecutar y probar la aplicación de manera efectiva. Si se encuentra con problemas, revise la configuración y asegúrese de haber seguido correctamente los pasos indicados. De lo contrario, hagamelo saber mediante un commit.

## GRACIAS :)









