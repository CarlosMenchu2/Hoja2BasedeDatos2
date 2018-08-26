
package hoja2_bases2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
            
    private static Connection conexion;

    public Conexion() {
    }

    public Connection ConectarBaseDatos() {

        try {

            conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/hojabases", "root", "1234");

            System.out.println("Abrio");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
}
