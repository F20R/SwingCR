package BBDD;

import models.Platillo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static BBDD.UtilidadesBBDD.cerrarConexion;
import static BBDD.UtilidadesBBDD.conectarConBD;

public class PlatilloBBDD {
    public static void main(String[] args) {

    }


    public static Platillo obtenerPorId(Integer id) {

        Connection con = conectarConBD();
        Platillo platillo = null;

        try {
            PreparedStatement query = con.prepareStatement("SELECT * FROM producto where id = ?  ");
            query.setInt(1, id);
            ResultSet result = query.executeQuery();

            //Recorremos los datos
            while (result.next()) {
                platillo = new Platillo(
                        result.getInt("id"),
                        result.getInt("cantidad"),
                        result.getInt("precio")
                );
            }

        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {cerrarConexion(con);}

        return platillo;
    }

    public static List<Platillo> obtenerPlatillos() {

        Connection con = conectarConBD();
        List<Platillo> platillos = new ArrayList<>();

        try {
            PreparedStatement query = con.prepareStatement("SELECT id, cantidad, precio FROM platillo");
            ResultSet result = query.executeQuery();

            //Recorremos los datos
            while (result.next()) {
                Platillo plato = new Platillo(
                        result.getInt("id"),
                        result.getInt("cantidad"),
                        result.getInt("precio"));

                platillos.add(plato);
            }

        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:" + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {cerrarConexion(con);}
        return platillos;
    }


}
