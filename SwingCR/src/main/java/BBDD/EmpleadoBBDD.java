package BBDD;

import models.Empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static BBDD.UtilidadesBBDD.cerrarConexion;
import static BBDD.UtilidadesBBDD.conectarConBD;

public class EmpleadoBBDD {
    public static void main(String[] args) {
        Empleado emplead = new Empleado(4, "Iñigo", "Pedrosa", "ZTD93F", "42135622J");

    }


    public static Empleado obtenerPorId (Integer id) {

        Connection con = conectarConBD();
        Empleado empleado = null;

        try {
            PreparedStatement query = con.prepareStatement("SELECT * FROM empleado where id = ?  ");
            query.setInt(1, id);
            ResultSet resultado = query.executeQuery();

            while (resultado.next()) {

                empleado = new Empleado(
                        resultado.getInt("id"),
                        resultado.getString("nombre"),
                        resultado.getString("apellidos"),
                        resultado.getString("num_empleado"),
                        resultado.getString("dni"));
            }

        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }

        return empleado;
    }
}
