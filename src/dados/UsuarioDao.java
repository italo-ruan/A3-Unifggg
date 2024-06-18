package dados;

import Metodos.UsuarioD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDao {

    Connection Conn;

    public ResultSet autenticar(UsuarioD objUsuarioD) {
        Conn = new ConexaoDao().ConectaBD();
        try {
            String sql = "select * from usuario where nome_Usuario = ? and senha_usuario = ?";
            PreparedStatement pstm = Conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioD.getUsuario());
            pstm.setString(2, objUsuarioD.getPassword());
            
            
           ResultSet rs = pstm.executeQuery();
           return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDao" + erro);
           return null;
        }

    }
public void SalvarLogin(UsuarioD objusuario){
 Conn = new ConexaoDao().ConectaBD();


 try {
            String sql = "insert into usuario (nome_Usuario,senha_Usuario)values (?,?)";
            PreparedStatement pstm = Conn.prepareStatement(sql);
            pstm.setString(1, objusuario.getUsuario());
            pstm.setString(2, objusuario.getPassword());
            
            
           
         pstm.execute();
            JOptionPane.showMessageDialog(null, "Usuario cadastrado!");

            pstm.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Salvar Usuario" + e);


        }


}
}
