package jaro.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JARO
 */
public class Conex {

//    public static void main(String[] args) {
//        conectarDB();
//    }
    static Properties readProperties() {
        Properties prop = new Properties();
        Path ruta = Paths.get("src/recursos/postgresql.properties");//obteniendo la ruta
//        Path ruta = Paths.get("src/recursos/mysql.properties");//obteniendo la ruta
        try {
            BufferedReader bf = Files.newBufferedReader(ruta, StandardCharsets.UTF_8);//abriendo el archivo para leerlo
            prop.load(bf);//leyendo el archivo de propiedades
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer la configuración de la base de datos: " + e.getMessage());
        }
        return prop;
    }

    public static Connection conectarDB() {
        //leyendo las propiedades de la DB
        Properties prop = readProperties();
        String url = prop.getProperty("db.url");
        String user = prop.getProperty("db.user");
        String passwd = prop.getProperty("db.passwd");
//        System.out.println(url + " " + user + " " + passwd);

        Connection miConexion = null;
        try {
            //crear conexion
            miConexion = DriverManager.getConnection(url, user, passwd);
//            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión fallida: " + e.getMessage());
        }
        return miConexion;
    }
}
