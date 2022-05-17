package BBDD;

import java.sql.*;

public class UtilidadesBBDD {
    public static void main(String[] args) {

    }

    private static final String url = "jdbc:mariadb://34.134.230.192:3306/BBDDFernando";
    private static final String usuario = "alumno_safa_daw";
    private static final String password = "daw2122";

    static Connection conectarConBD() {
        Connection conexion;
        try {
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (Exception e) {
            System.out.println("Error en la conexión:" + e.toString());
            return null;
        }
        return conexion;
    }

    static void cerrarConexion(Connection con) {
        try {
            // Cerramos conexiones
            if (con !=null) {
                con.close();
            }
        } catch (Exception e) {
            System.out.println("Error cerrando conexiones: "
                    + e.toString());
        }
    }

}
