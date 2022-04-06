package jaro.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author JARO
 */
public class ConnectDB {

    public static void main(String[] args) {
//        try {
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

        conectarDB();
//        createUser("postgresql", "postgresql", "asd@email.com");
    }

    static Properties readProperties() {
        Properties prop = new Properties();
//        Path ruta = Paths.get("src/recursos/mysql.properties");//obteniendo la ruta mysql
        Path ruta = Paths.get("src/recursos/postgresql.properties");//obteniendo la ruta postgresql
        try {
            BufferedReader bf = Files.newBufferedReader(ruta, StandardCharsets.UTF_8);//abriendo el archivo para leerlo
            prop.load(bf);//leyendo el archivo de propiedades
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer la configuración de la base de datos: " + e.getMessage());
        }
        return prop;
    }

    static Connection conectarDB() {
        //leyendo las propiedades de la DB
        Properties prop = readProperties();
        String url = prop.getProperty("db.url");
        String user = prop.getProperty("db.user");
        String passwd = prop.getProperty("db.passwd");
        System.out.println(url + " " + user + " " + passwd);

        Connection miConexion = null;
        try {
            //crear conexion
//            Class.forName("org.postgresql.Driver");
            miConexion = DriverManager.getConnection(url, user, passwd);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexión fallida: " + e.getMessage());
        }
        return miConexion;
    }

    public static void createUser(String nombre, String contrasenia, String correo) {
        try {
            //crear conexion
            Connection miConexion = conectarDB();

            //consulta preparada, optimizado
            String sql = "INSERT INTO usuarios(nombre,contrasenia,correo) VALUES (?,?,?)";
            PreparedStatement miSentencia = miConexion.prepareStatement(sql);

            //pasar parametros
            miSentencia.setString(1, nombre);
            miSentencia.setString(2, contrasenia);
            miSentencia.setString(3, correo);

            miSentencia.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario creado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el usuario: " + e.getMessage());
        }
    }

    public static ResultSet readUser() {
        ResultSet rs = null;
        try {
            //crear conexion
            Connection miConexion = conectarDB();

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
            Connection miConexion = conectarDB();

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
            Connection miConexion = conectarDB();

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
            Connection miConexion = conectarDB();

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
