package reto_5.Modelo.DAO;
import java.sql.*;
import reto_5.Utilidades.*;
public class Consulta1DAO {
    public static ResultSet consulta() {

        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        String csql = "SELECT ID_LIDER, Nombre, Primer_Apellido, Ciudad_Residencia FROM LIDER ORDER BY Ciudad_Residencia;";
        try {
            conn = JDBCUtilities.conexion();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
}
