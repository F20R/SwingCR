/*package BBDD;

import models.Empleado;
import models.Mesa;
import models.Platillo;
import models.Servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static BBDD.UtilidadesBBDD.cerrarConexion;
import static BBDD.UtilidadesBBDD.conectarConBD;

public class ServicioBBDD {
    public static void main(String[] args) {

    }

    public static Servicio obtenerPorId(Mesa mesa, Empleado camarero){

        Connection conexion = conectarConBD();
        Servicio servicio_cliente = null;


        try {
            PreparedStatement consulta = conexion.prepareStatement("select * from comanda where id_mesa = ? and  id_empleado = ? ");
            consulta.setInt(1, mesa.getId());
            consulta.setInt(2,camarero.getId());
            ResultSet result = consulta.executeQuery();

            while(result.next()){

                servicio_cliente = new Servicio();
                servicio_cliente.setId(result.getInt("id"));
                servicio_cliente.setCodigo_servicio(result.getString("codigo_servicio"));

            };
                Empleado emp = EmpleadoBBDD.obtenerPorId(result.getInt("id_empleado")) ;
                servicio_cliente.setEmpleado(emp);

                Mesa m = MesaBBDD.obtenerPorId(result.getInt("id_mesa")) ;
                servicio_cliente.setMesa(m);


            } catch (SQLException ex) {
        }

    }catch (SQLException e){
            System.out.println("Error en la ejecución:"
                    + e.getErrorCode() + " " + e.getMessage());



        }finally {
            cerrarConexion(conexion);
        }
        return servicio_cliente;

    }


    public static List<Servicio> obtenerComandas(){

        Connection conexion = conectarConBD();
        List<Comanda> comandas = new ArrayList<>();


        try {
            PreparedStatement consulta = conexion.prepareStatement("select * from comanda");
            ResultSet rs = consulta.executeQuery();

            while(rs.next()){

                Comanda comanda = new Comanda();
                comanda.setId(rs.getInt("id"));
                comanda.setCodigo_comanda(rs.getString("codigo_comanda"));

                //Obtener Empleado
                Empleado e = EmpleadoBD.obtenerPorId(rs.getInt("id_empleado")) ;
                comanda.setEmpleado(e);

                //Obtener Mesa
                Mesa m = MesaBD.obtenerPorId(rs.getInt("id_mesa")) ;
                comanda.setMesa(m);

                //Obtener Lineas de la comanda
                List<LineaComanda> lineaComandas = LineaComandaBD.obtenerLineaComanda(comanda.getId());
                comanda.setLineasComanda(lineaComandas);


                comandas.add(comanda);

            }

        }catch (SQLException e){
            System.out.println("Error en la ejecución:"
                    + e.getErrorCode() + " " + e.getMessage());



        }finally {
            cerrarConexion(con);
        }


        return comandas;

    }
}


 */