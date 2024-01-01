<p align="center">
  <img src="https://github.com/jaimed411/dodero_jaime_pruebatec1/blob/main/pruebatec1.jpg" alt="foto">
</p>

## OBJECTIVE: Employee Management Application Development

The objective of this test is to assess your knowledge of Java, including syntax, repetitive structures, selective structures, collection management and CRUD (Create, Read, Update and Delete) operations using JPA (Java Persistence API) to interact with a database.

## Application Description:

The application developed is an employee management system for the company DOD4NET with an interactive menu that allows operations such as adding new employees, viewing employee list in alphabetical order, updating information for each employee, deleting an employee, searching for employees by position and viewing the start date of each employee. The application is implemented in Java and uses Java Persistence API (JPA) for data persistence.

## Prerequisites:

Before running the application, make sure you have the following installed:
- IDE environment, if possible Netbeans IDE 17
- Java Development Kit (JDK) - version 17
- Apache Maven

## Implementation Instructions:
- Compiling the Project:
  - Open a terminal or command prompt in the root directory of the project.
  - Run the following command to compile the project:
    mvn clean install
- Running the Application:
  - Run the following command to run the application:
    java -jar target/pruebatec1-1.0-SNAPSHOT.jar
- Interacting with the Application: An interactive menu will be presented in the console. Follow the on-screen instructions to select the desired operations (add, view list, update, delete, search for employee, view start date and exit). Testing is recommended. Add employees, view the list you are creating, update and/or delete employees to verify proper operation.

## Assumptions Considered:
In developing the application, the following assumptions have been considered:
- Valid Data Entry: The user is expected to provide valid entries during the interaction with the application. If 0 or =<7 is set, an error will appear.
- Date Format: It is assumed that the user will enter the start date in the format "YYYYY-MM-DD".
- Wage Entry: It is assumed that the user will enter the wage as a decimal number. If a non-numeric value is entered, an error will be displayed.
- Employee ID: When searching for, updating or deleting an employee, it is assumed that the user will correctly enter the employee ID. If an invalid ID is provided, an error will be displayed.
- Database: It is assumed that the database configured in the persistence.xml file is available and accessible during the execution of the application.

## Database: 
The application uses an embedded database provided by JPA. Make sure that the database configuration in the persistence.xml file is appropriate. As for the database configuration process, Maven is used to manage dependencies and project builds. Maven has simplified the management of dependencies and project builds and is linked directly to MySQL. User = "root" Password = ""

## Update and Delete operations:
Before performing update or delete operations, the user must commit their action to avoid accidental changes.

## Internet connection:
No Internet connection is required to run the application after compilation.

## Conclusion:
The DOD4NET application provides a simple interface to manage all employees and is designed to be easy to use. By following the above instructions, you should be able to compile, run and test the application effectively. If you encounter problems, please review the configuration and make sure you have followed the steps correctly. Otherwise, let me know with a commit.

## THANK YOU :)

........................................................................................................................................................................

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
28/12/23









