package bbdd_jdbc;

import java.sql.*;

/**
 *
 * @author JARO
 */
public class ConectarDB {

    public static void main(String[] args) {
        try {
            //crear conexion
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");

            //crear objeto statement
            Statement miStatement = miConexion.createStatement();

            //ejecutar SQL
            ResultSet miResultset = miStatement.executeQuery("SELECT * FROM actor");

            //recorrer el resultset
            while (miResultset.next()) {
                System.out.println(miResultset.getString("actor_id") + " " + miResultset.getString("first_name") + " "
                        + miResultset.getString("last_name") + " ");
            }
        } catch (Exception e) {
            System.out.println("Error en la conexion");
            e.printStackTrace();
        }

    }
}
