package dados;

import Metodos.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class FuncionarioDao {

    Connection Conn;
    PreparedStatement pstm;

    public void CadastroFuncionario(Funcionario objfuncionario) {
        String sql = "insert into funcionario ( nome,Celular,cpf,salario,data_entrada ) values (?,?,?,?,?)";

        Conn = new ConexaoDao().ConectaBD();
        try {
            pstm = Conn.prepareStatement(sql);
 
            pstm.setString(1, objfuncionario.getNome());
            pstm.setDouble(2, objfuncionario.getCelular());
            pstm.setDouble(3, objfuncionario.getCpf());
            pstm.setDouble(4, objfuncionario.getSalario());
            pstm.setDouble(5, objfuncionario.getDataDeEntrada());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Salvo !");
            pstm.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "FuncionarioDao" + e);

        }

    }

}
