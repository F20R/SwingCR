package models;

import java.util.Objects;

public class Pedido_Precio {

    private int id;
    private Pedido pedido;
    private double dinero_dado;
    private double cambio_recibido;
    private Platillo platillo;

    //Constructor

    public Pedido_Precio(int id, Pedido pedido, double dinero_dado, double cambio_recibido, Platillo platillo) {
        this.id = id;
        this.pedido = pedido;
        this.dinero_dado = dinero_dado;
        this.cambio_recibido = cambio_recibido;
        this.platillo = platillo;
    }

    //Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getDinero_dado() {
        return dinero_dado;
    }

    public void setDinero_dado(double dinero_dado) {
        this.dinero_dado = dinero_dado;
    }

    public double getCambio_recibido() {
        return cambio_recibido;
    }

    public void setCambio_recibido(double cambio_recibido) {
        this.cambio_recibido = cambio_recibido;
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
        return "Pedido_Precio{" +
                "id=" + id +
                ", pedido=" + pedido +
                ", dinero_dado=" + dinero_dado +
                ", cambio_recibido=" + cambio_recibido +
                ", platillo=" + platillo +
                '}';
    }

    //Hash

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido_Precio that = (Pedido_Precio) o;
        return id == that.id && Double.compare(that.dinero_dado, dinero_dado) == 0 && Double.compare(that.cambio_recibido, cambio_recibido) == 0 && Objects.equals(pedido, that.pedido) && Objects.equals(platillo, that.platillo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pedido, dinero_dado, cambio_recibido, platillo);
    }
}
