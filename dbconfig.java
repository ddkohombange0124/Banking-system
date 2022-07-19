/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Kohombange DD
 */
public class dbconfig {
     private static String servername="localhost";
    private static String username="root";
    private static String password="";
    private static String dbname="test01";
    private static Integer port=3307;
    
    public static Connection getconnection()
    {
        Connection con=null;
        MysqlDataSource datasource =new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(port);
        
        try
        {
            con=datasource.getConnection();
            
            System.out.println("connection success");
            return con;
        }
        catch(SQLException ex)
        {
           System.out.println("connection error");
           JOptionPane.showMessageDialog(null,"connection error","error",2);
          // Logger.getLogger("Get Connection ->"+ dbconfig.class.getName()).log(Level1.SERVER,null,ex);
           return null;
    
}
    }

    static class getconnection {

        static PreparedStatement PreparedStatement(String query) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public getconnection() {
        }
    }
}
