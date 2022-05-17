package models;

import java.util.Objects;

public class Platillo {

    private int id;
    private int cantidad;
    private float precio;

    //Constructor

    public Platillo(int id, int cantidad, float precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    //G & S

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    //To String

    @Override
    public String toString() {
        return "Platillo{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }


    //Hash

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platillo platillo = (Platillo) o;
        return id == platillo.id && cantidad == platillo.cantidad && Float.compare(platillo.precio, precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cantidad, precio);
    }
}
