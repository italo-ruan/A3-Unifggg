package dados;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoDao {
    
public Connection ConectaBD(){
Connection Conn = null;
    try {
      String url ="jdbc:mysql://localhost:3306/bancoteste?user=root&password=" ; 
        Conn = DriverManager.getConnection(url);
        
        
    } catch (SQLException e) {
        
      JOptionPane.showInternalMessageDialog(null, "ConexaoDao"+e.getMessage());
        
    }return Conn;
}
    
  
    
    



        }   
 
      
  