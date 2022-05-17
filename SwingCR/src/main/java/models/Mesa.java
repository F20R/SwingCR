package models;

import java.util.Objects;

public class Mesa {

    private int id;
    private int num_mesa;
    private int num_clientes;
    private boolean reservada = false;
    private Platillo platillo;

    //Constructor

    public Mesa(int id, int num_mesa, int num_clientes, boolean reservada, Platillo platillo) {
        this.id = id;
        this.num_mesa = num_mesa;
        this.num_clientes = num_clientes;
        this.reservada = reservada;
        this.platillo = platillo;
    }


    //G & S

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_mesa() {
        return num_mesa;
    }

    public void setNum_mesa(int num_mesa) {
        this.num_mesa = num_mesa;
    }

    public int getNum_clientes() {
        return num_clientes;
    }

    public void setNum_clientes(int num_clientes) {
        this.num_clientes = num_clientes;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }

    public Platillo getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Platillo platillo) {
        this.platillo = platillo;
    }

    //To String

    @Override
    public String toString() {
        return "Mesa{" +
                "id=" + id +
                ", num_mesa=" + num_mesa +
                ", num_clientes=" + num_clientes +
                ", reservada=" + reservada +
                ", platillo=" + platillo +
                '}';
    }

    //Hash


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesa mesa = (Mesa) o;
        return id == mesa.id && num_mesa == mesa.num_mesa && num_clientes == mesa.num_clientes && reservada == mesa.reservada && Objects.equals(platillo, mesa.platillo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num_mesa, num_clientes, reservada, platillo);
    }
}
