package models;

import java.util.Objects;

public class Servicio {

    private int id;
    private String codigo_servicio;
    private Empleado empleado;
    private Mesa mesa;

    //Constructor

    public Servicio(int id, String codigo_servicio, Empleado empleado, Mesa mesa) {
        this.id = id;
        this.codigo_servicio = codigo_servicio;
        this.empleado = empleado;
        this.mesa = mesa;
    }

    //Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo_servicio() {
        return codigo_servicio;
    }

    public void setCodigo_servicio(String codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    //To String

    @Override
    public String toString() {
        return "Servicio{" +
                "id=" + id +
                ", codigo_servicio='" + codigo_servicio + '\'' +
                ", empleado=" + empleado +
                ", mesa=" + mesa +
                '}';
    }

    //Hash


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servicio servicio = (Servicio) o;
        return id == servicio.id && Objects.equals(codigo_servicio, servicio.codigo_servicio) && Objects.equals(empleado, servicio.empleado) && Objects.equals(mesa, servicio.mesa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo_servicio, empleado, mesa);
    }
}
