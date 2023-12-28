package com.mycompany.pruebatec1;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


//Clase entidad para la representación de un Empleado en la base de datos.
@Entity
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;               
    private String nombre;        
    private String apellido;
    private String cargo;
    private double salario;

    @Temporal(TemporalType.DATE)
    private Date fechaInicio; 


    
    //Constructor vacío necesario para JPA.
    public Empleado() {
    }

    //Constructor para crear un nuevo objeto Empleado con información inicial.
    public Empleado(String nombre, String apellido, String cargo, double salario, Date fechaInicio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }

    
    
    //MÉTODOS
    //Método para obtener el ID
    public Long getId() {
        return id;
    }

    //Método para establecer el ID
    public void setId(Long id) {
        this.id = id;
    }

    //Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    //Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Método para obtener el apellido
    public String getApellido() {
        return apellido;
    }

    //Método para establecer el apellido
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Método para obtener el cargo
    public String getCargo() {
        return cargo;
    }

    //Método para establecer el cargo
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //Método para obtener el salario
    public double getSalario() {
        return salario;
    }

    //Método para establecer el salario
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Método para obtener la fecha de inicio de empleo
    public Date getFechaInicio() {
        return fechaInicio;
    }

    //Método para establecer la fecha de inicio de empleo
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    //Método para obtener una representación en cadena del objeto Empleado.
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", fechaInicio=" + fechaInicio +
                '}';
    }
}
