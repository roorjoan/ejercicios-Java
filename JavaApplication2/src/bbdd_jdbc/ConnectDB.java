package bbdd_jdbc;

import java.sql.*;

/**
 *
 * @author JARO
 */
public class ConnectDB {

//    public static void main(String[] args) {
//        try {
//            createUser("sdf@asd.com", "pass", "jose", "rodriguezzzzz");//crear usuario
//            ResultSet lista = readUser();//listar todos los usuarios
//            while (lista.next()) {
//                System.out.println(lista.getString(4) + " " + lista.getString(5));
//            }
//            updateUser(6, "sdf@asd.com", "pass", "jose a", "rodriguez");//actualizar usuario
//            deleteUser(6);//eliminar usuario
//            ResultSet busqueda = searchUser(2);//buscar un usuario
//            while (busqueda.next()) {
//                System.out.println(busqueda.getString(4) + " " + busqueda.getString(5));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    private static Connection configDB() {
        Connection miConexion = null;

        try {
            //crear conexion
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios", "root", "root");
            System.out.println("CONEXION EXITOSA");

        } catch (SQLException e) {
            System.out.println("CONEXION FALLIDA");
            System.out.println(e.getMessage());
        }

        return miConexion;
    }

    public static void createUser(String correo, String contrasenia, String nombre, String apellido) {
        try {
            //crear conexion
            Connection miConexion = configDB();

            //consulta preparada, optimizado
            String sql = "INSERT INTO usuario(correo,contrasenia,nombre,apellido) VALUES (?,?,?,?)";
            PreparedStatement miSentencia = miConexion.prepareStatement(sql);

            //pasar parametros
            miSentencia.setString(1, correo);
            miSentencia.setString(2, contrasenia);
            miSentencia.setString(3, nombre);
            miSentencia.setString(4, apellido);

            miSentencia.executeUpdate();
            System.out.println("OPERACION REALIZADA CORRECTAMENTE!!!");

        } catch (SQLException e) {
            System.out.println("ERROR AL CREAR EL USUARIO");
            System.out.println(e.getMessage());
        }
    }

    public static ResultSet readUser() {
        ResultSet rs = null;
        try {
            //crear conexion
            Connection miConexion = configDB();

            Statement miSentencia = miConexion.createStatement();

            //consulta
            String sql = "SELECT * FROM usuario";

            //ejecutar SQL
            rs = miSentencia.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("ERROR AL LEER LOS USUARIOS");
            System.out.println(e.getMessage());
        }
        return rs;
    }

    public static void updateUser(int id, String correo, String contrasenia, String nombre, String apellido) {
        try {
            //crear conexion
            Connection miConexion = configDB();

            //consulta preparada, optimizado
            String sql = "UPDATE usuario SET correo = ?, contrasenia = ?, nombre = ?, apellido = ? WHERE id = ?";
            PreparedStatement miSentencia = miConexion.prepareStatement(sql);

            //pasar parametros
            miSentencia.setString(1, correo);
            miSentencia.setString(2, contrasenia);
            miSentencia.setString(3, nombre);
            miSentencia.setString(4, apellido);
            miSentencia.setInt(5, id);

            miSentencia.executeUpdate();
            System.out.println("OPERACION REALIZADA CORRECTAMENTE!!!");

        } catch (SQLException e) {
            System.out.println("ERROR AL ACTUALIZAR EL USUARIO");
            System.out.println(e.getMessage());
        }
    }

    public static void deleteUser(int id) {
        try {
            //crear conexion
            Connection miConexion = configDB();

            //consulta preparada, optimizado
            String sql = "DELETE FROM usuario WHERE id = ?";
            PreparedStatement miSentencia = miConexion.prepareStatement(sql);

            //pasar parametros
            miSentencia.setInt(1, id);

            miSentencia.executeUpdate();
            System.out.println("OPERACION REALIZADA CORRECTAMENTE!!!");

        } catch (SQLException e) {
            System.out.println("ERROR AL ELIMINAR EL USUARIO");
            System.out.println(e.getMessage());
        }
    }

    public static ResultSet searchUser(int id) {
        ResultSet rs = null;
        try {
            //crear conexion
            Connection miConexion = configDB();

            //consulta preparada, optimizado
            String sql = "SELECT * FROM usuario WHERE id=?";
            PreparedStatement miSentencia = miConexion.prepareStatement(sql);
            //pasar parametros
            miSentencia.setInt(1, id);

            //ejecutar SQL
            rs = miSentencia.executeQuery();
        } catch (SQLException e) {
            System.out.println("ERROR EN LA CONEXION");
            System.out.println(e.getMessage());
        }
        return rs;
    }
}
