package BBDD;

import models.Mesa;
import models.Platillo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static BBDD.UtilidadesBBDD.cerrarConexion;
import static BBDD.UtilidadesBBDD.conectarConBD;

public class MesaBBDD {
    public static void main(String[] args) {

    }
    public static Mesa obtenerPorId(int idMesa) {

        Connection con = conectarConBD();
        Mesa mesa = null;

        try {
            PreparedStatement query = con.prepareStatement("SELECT id, num_mesa, reservada FROM mesa where id = ? ");
            query.setInt(1, idMesa);
            ResultSet result = query.executeQuery();

            //Recorremos los datos
            while (result.next()) {

                mesa= new Mesa(
                      result.getInt("id"),
                        result.getInt("num_mesa"),
                        result.getInt("num_clientes"),
                        result.getInt("reservada") ==1,
                        PlatilloBBDD.obtenerPorId(result.getInt("id_platillo")));

            }

        } catch (SQLException sqle) {
            System.out.println("Proceso incorrecto:" + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }

        return mesa;
    }

    public static List<Mesa> obtenerMesas() {

        Connection con = conectarConBD();
        List<Mesa> mesas = new ArrayList<>();

        try {
            PreparedStatement query = con.prepareStatement("SELECT id, num_mesa, reservada FROM mesa ");
            ResultSet result = query.executeQuery();

            //Recorremos los datos
            while (result.next()) {
                Mesa mesa = new Mesa(
                        result.getInt("id"),
                        result.getInt("num_mesa"),
                        result.getInt("num_clientes"),
                        result.getInt("reservada") ==1,
                        PlatilloBBDD.obtenerPorId(result.getInt("")));

                mesas.add(mesa);
            }

        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:" + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }

        return mesas;
    }

    public static void ocuparDesocuparMesa(Mesa mesa) {

        Connection con = conectarConBD();
        try {
            PreparedStatement update = con.prepareStatement("update mesa set reservada = ? where id = ?");
            update.setInt(1,mesa.getId());
            update.setInt(2, mesa.isReservada()? 0 : 1);
            update.executeUpdate();

        } catch (SQLException sqle) {
            System.out.println("No funciona:" + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }

    }


}
