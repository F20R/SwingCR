package models;

import java.util.Objects;

public class Pedido {

    private int id;
    private int codigo_pedido;
    private String descripcion;
    private TipoPedido tipoPedido ;
    private boolean pago_efectivo;
    private boolean pedido_finalizado ;

    //Constructor

    public Pedido(int id, int codigo_pedido, String descripcion, TipoPedido tipoPedido, boolean pago_efectivo, boolean pedido_finalizado) {
        this.id = id;
        this.codigo_pedido = codigo_pedido;
        this.descripcion = descripcion;
        this.tipoPedido = tipoPedido;
        this.pago_efectivo = pago_efectivo;
        this.pedido_finalizado = pedido_finalizado;
    }

    //Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedido tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public boolean isPago_efectivo() {
        return pago_efectivo;
    }

    public void setPago_efectivo(boolean pago_efectivo) {
        this.pago_efectivo = pago_efectivo;
    }

    public boolean isPedido_finalizado() {
        return pedido_finalizado;
    }

    public void setPedido_finalizado(boolean pedido_finalizado) {
        this.pedido_finalizado = pedido_finalizado;
    }


    //To String

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", codigo_pedido=" + codigo_pedido +
                ", descripcion='" + descripcion + '\'' +
                ", tipoPedido=" + tipoPedido +
                ", pago_efectivo=" + pago_efectivo +
                ", pedido_finalizado=" + pedido_finalizado +
                '}';
    }

    //Hash

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return id == pedido.id && codigo_pedido == pedido.codigo_pedido && pago_efectivo == pedido.pago_efectivo && pedido_finalizado == pedido.pedido_finalizado && Objects.equals(descripcion, pedido.descripcion) && tipoPedido == pedido.tipoPedido;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo_pedido, descripcion, tipoPedido, pago_efectivo, pedido_finalizado);
    }
}
