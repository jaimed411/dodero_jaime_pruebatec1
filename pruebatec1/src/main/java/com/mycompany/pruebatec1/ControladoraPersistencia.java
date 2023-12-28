package com.mycompany.pruebatec1;


import java.util.List;

//Clase ControladoraPersistencia para interactuar con la capa de persistencia de empleados.
public class ControladoraPersistencia {

    //Instancia de EmpleadoJpaController para realizar operaciones CRUD en la base de datos
    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();

    //METODOS
    //Método para agregar un nuevo empleado a la base de datos.
    public void agregarEmpleado(Empleado empleado) {
        empleadoJPA.create(empleado);
    }

    //Método para obtener la lista de todos los empleados almacenados en la base de datos.
    public List<Empleado> listarEmpleados() {
        return empleadoJPA.findEmpleadoEntities(100, 0); // Ajusta los valores de acuerdo a tus necesidades
    }

    //Método para actualizar la información de un empleado en la base de datos.
    public void actualizarEmpleado(Empleado empleado) {
        try {
            empleadoJPA.edit(empleado);
        } catch (Exception ex) {
            // Manejar la excepción
            ex.printStackTrace();
        }
    }

    //Método para eliminar un empleado de la base de datos por su ID.
    public void eliminarEmpleado(Long id) {
        try {
            empleadoJPA.destroy(id);
        } catch (Exception ex) {
            // Manejar la excepción
            ex.printStackTrace();
        }
    }

    //Método para buscar empleados por su cargo en la base de datos.
    public List<Empleado> buscarPorCargo(String cargo) {
        return empleadoJPA.findEmpleadoByCargo(cargo);
    }

    //Método para buscar un empleado por su ID en la base de datos.
    public Empleado buscarEmpleadoPorId(Long id) {
        return empleadoJPA.findEmpleado(id);
    }
}
