package com.mycompany.pruebatec1;

//Importación de paquetes
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//Clase principal
public class Main {

    //Método principal para ejecutar la app
    public static void main(String[] args) {
        //Inicialización de objetos Scanner y ControladoraPersistencia
        Scanner scanner = new Scanner(System.in);
        ControladoraPersistencia controladora = new ControladoraPersistencia();

        //Declaración de variable para la opción del menú
        int opcion;

        //Bucle principal del menú
        do {
            //Presentación visual del menú
            System.out.println("   __________________________   ");
            System.out.println("|                              |");
            System.out.println("|  GESTIÓN EMPLEADOS DOD4NET   |");
            System.out.println("|  __________________________  |");
            System.out.println("|                              |");
            System.out.println("| 1. Agregar un nuevo empleado |");
            System.out.println("| 2. Lista de empleados        |");
            System.out.println("| 3. Actualizar info empleado  |");
            System.out.println("| 4. Eliminar un empleado      |");
            System.out.println("| 5. Buscar por cargo          |");
            System.out.println("| 6. Salir de la aplicación    |");
            System.out.println("|  __________________________  |");
            System.out.println(" ");
            System.out.print("Indica el número de la opción que prefieras: ");

            //Lectura de la opción ingresada por el usuario
            while (!scanner.hasNextInt()) {
                scanner.next();
            }

            opcion = scanner.nextInt();

            //Validar que la opción esté en el rango deseado
            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción no válida. Debe estar entre 1 y 6. Intentelo de nuevo.");
                continue;
            }
            scanner.nextLine(); // Consumir el salto de línea

            //Switch para manejar las opciones del menú
            switch (opcion) {
                case 1:
                    agregarEmpleado(scanner, controladora);
                    break;
                case 2:
                    listarEmpleados(controladora);
                    break;
                case 3:
                    actualizarEmpleado(scanner, controladora);
                    break;
                case 4:
                    eliminarEmpleado(scanner, controladora);
                    break;
                case 5:
                    buscarPorCargo(scanner, controladora);
                    break;
                case 6:
                    System.out.println("Gracias! Para cualquier error envía mail a soporte@dod4net.com");
                    break;
                default:
                    System.out.println("Opción no válida. Intentelo de nuevo.");
            }
        } while (opcion != 6);

        //Cierre del Scanner al finalizar
        scanner.close();
    }

    
    //Método para agregar un nuevo empleado
    private static void agregarEmpleado(Scanner scanner, ControladoraPersistencia controladora) {
        System.out.println("Ingrese los detalles del nuevo empleado:");

        //Creación de un nuevo objeto Empleado
        Empleado nuevoEmpleado = new Empleado();

        //Captura de datos
        System.out.print("Nombre: ");
        nuevoEmpleado.setNombre(scanner.nextLine());

        System.out.print("Apellidos: ");
        nuevoEmpleado.setApellido(scanner.nextLine());

        System.out.print("Cargo: ");
        nuevoEmpleado.setCargo(scanner.nextLine());

        System.out.print("Salario: ");
        nuevoEmpleado.setSalario(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Fecha de Inicio (YYYY-MM-DD): ");
        String fechaInicioStr = scanner.nextLine();

        //Manejo de la fecha de inicio con posible error
        try {
            Date fechaInicio = new SimpleDateFormat("yyyy-MM-dd").parse(fechaInicioStr);
            nuevoEmpleado.setFechaInicio(fechaInicio);
        } catch (ParseException e) {
            System.out.println("Error al procesar la fecha. El empleado se creará sin fecha de inicio.");
        }

        //Llamada al método de la controladora para agregar el empleado
        controladora.agregarEmpleado(nuevoEmpleado);
        System.out.println("Empleado agregado exitosamente!");
    }

    //Método para listar empleados ordenados alfabéticamente por nombre
    private static void listarEmpleados(ControladoraPersistencia controladora) {
        //Obtener lista de empleados desde la controladora
        List<Empleado> empleados = controladora.listarEmpleados();

        //Ordenar empleados por nombre
        empleados.sort(Comparator.comparing(Empleado::getNombre));

        //Presentación de la lista de empleados
        System.out.println("Lista de empleados:");
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " " + e.getApellido() + " - " + e.getCargo());
        }
    }

    //Método para actualizar información de un empleado
    private static void actualizarEmpleado(Scanner scanner, ControladoraPersistencia controladora) {
        //Lectura del ID del empleado a actualizar
        System.out.print("Ingrese el ID del empleado a actualizar: ");
        Long idEmpleado = scanner.nextLong();
        scanner.nextLine();

        //Búsqueda del empleado por ID en la controladora
        Empleado empleadoAActualizar = controladora.buscarEmpleadoPorId(idEmpleado);

        //Verificación de existencia del empleado
        if (empleadoAActualizar != null) {
            System.out.println("Empleado actual:");
            System.out.println(empleadoAActualizar);

            System.out.println("Ingrese los nuevos detalles:");

            // Actualización de los datos del empleado
            System.out.print("Nuevo nombre (deje en blanco para mantener el actual): ");
            String nuevoNombre = scanner.nextLine();
            if (!nuevoNombre.isEmpty()) {
                empleadoAActualizar.setNombre(nuevoNombre);
            }

            System.out.print("Nuevo apellido (deje en blanco para mantener el actual): ");
            String nuevoApellido = scanner.nextLine();
            if (!nuevoApellido.isEmpty()) {
                empleadoAActualizar.setApellido(nuevoApellido);
            }

            System.out.print("Nuevo cargo (deje en blanco para mantener el actual): ");
            String nuevoCargo = scanner.nextLine();
            if (!nuevoCargo.isEmpty()) {
                empleadoAActualizar.setCargo(nuevoCargo);
            }

            System.out.print("Nuevo salario (deje en blanco para mantener el actual): ");
            String nuevoSalarioStr = scanner.nextLine();
            if (!nuevoSalarioStr.isEmpty()) {
                try {
                    double nuevoSalario = Double.parseDouble(nuevoSalarioStr);
                    empleadoAActualizar.setSalario(nuevoSalario);
                } catch (NumberFormatException e) {
                    System.out.println("Error al procesar el salario. Se mantendrá el valor actual.");
                }
            }

            System.out.print("Nueva fecha de inicio (YYYY-MM-DD, deje en blanco para mantener la actual): ");
            String nuevaFechaInicioStr = scanner.nextLine();
            if (!nuevaFechaInicioStr.isEmpty()) {
                try {
                    Date nuevaFechaInicio = new SimpleDateFormat("yyyy-MM-dd").parse(nuevaFechaInicioStr);
                    empleadoAActualizar.setFechaInicio(nuevaFechaInicio);
                } catch (ParseException e) {
                    System.out.println("Error al procesar la fecha de inicio. Se mantendrá la fecha actual.");
                }
            }

            //Llamada al método de la controladora para actualizar el empleado
            controladora.actualizarEmpleado(empleadoAActualizar);
            System.out.println("Empleado actualizado exitosamente.");
        } else {
            System.out.println("Empleado no encontrado con ID: " + idEmpleado);
        }
    }

    // Método para eliminar un empleado
    private static void eliminarEmpleado(Scanner scanner, ControladoraPersistencia controladora) {
        //Lectura del ID del empleado a eliminar
        System.out.print("Ingrese el ID del empleado a eliminar: ");
        Long idEmpleado = scanner.nextLong();
        scanner.nextLine(); // Consumir el salto de línea

        //Búsqueda del empleado por ID en la controladora
        Empleado empleadoAEliminar = controladora.buscarEmpleadoPorId(idEmpleado);

        //Verificación de existencia del empleado
        if (empleadoAEliminar != null) {
            System.out.println("Empleado a eliminar:");
            System.out.println(empleadoAEliminar);

            //Confirmación de la eliminación con el usuario
            System.out.print("¿Está seguro de que desea eliminar este empleado? (S/N): ");
            String confirmacion = scanner.nextLine().trim().toUpperCase();

            //Procesamiento de la confirmación
            if (confirmacion.equals("S")) {
                //Llamada al método de la controladora para eliminar el empleado
                controladora.eliminarEmpleado(idEmpleado);
                System.out.println("Empleado eliminado.");
            } else {
                System.out.println("Operación de eliminación cancelada.");
            }
        } else {
            System.out.println("Empleado no encontrado con ID: " + idEmpleado);
        }
    }

    //Método para buscar empleados por cargo
    private static void buscarPorCargo(Scanner scanner, ControladoraPersistencia controladora) {
        //Lectura del cargo a buscar
        System.out.print("Ingrese el cargo a buscar: ");
        String cargo = scanner.nextLine();

        //Búsqueda de empleados por cargo en la controladora
        List<Empleado> empleadosPorCargo = controladora.buscarPorCargo(cargo);

        //Presentación de resultados
        if (!empleadosPorCargo.isEmpty()) {
            System.out.println("Empleados con cargo '" + cargo + "':");
            for (Empleado e : empleadosPorCargo) {
                System.out.println("- " + e.getNombre() + " " + e.getApellido());
            }
        } else {
            System.out.println("No se encontraron empleados con el cargo '" + cargo + "'.");
        }
    }
}
