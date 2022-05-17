package models;

import java.util.Objects;

public class Empleado {

    private int id;
    private String nombre;
    private String apellidos;
    private String num_empleado ;
    private String dni ;


    //Constructor

    public Empleado(int id, String nombre, String apellidos, String num_empleado, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num_empleado = num_empleado;
        this.dni = dni;
    }

    //Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(String num_empleado) {
        this.num_empleado = num_empleado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //To String
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", num_empleado='" + num_empleado + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    //Hash


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return id == empleado.id && Objects.equals(nombre, empleado.nombre) && Objects.equals(apellidos, empleado.apellidos) && Objects.equals(num_empleado, empleado.num_empleado) && Objects.equals(dni, empleado.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellidos, num_empleado, dni);
    }
}


