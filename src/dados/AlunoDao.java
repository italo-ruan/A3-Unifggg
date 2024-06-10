package dados;

import Metodos.Alunos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlunoDao {

    ResultSet rs;
    ArrayList<Alunos> lista = new ArrayList<>();
    Connection Conn;
    PreparedStatement pstm;

    public void CadastroAluno(Alunos objaluno) {
        String sql = "insert into aluno( matricula,nome,email,cpf,datanasc,celular,pais,estado,cidade,endereco,bairro,numero ) values (?,?,?,?,?,?,?,?,?,?,?,?)";

        Conn = new ConexaoDao().ConectaBD();
        try {
            pstm = Conn.prepareStatement(sql);
            pstm.setDouble(1, objaluno.getMatricula());
            pstm.setString(2, objaluno.getNome());
            pstm.setString(3, objaluno.getEmail());
            pstm.setDouble(4, objaluno.getCpf());
            pstm.setDouble(5, objaluno.getDataNasc());
            pstm.setDouble(6, objaluno.getCelular());
            pstm.setString(7, objaluno.getPais());
            pstm.setString(8, objaluno.getEstado());
            pstm.setString(9, objaluno.getCidade());
            pstm.setString(10, objaluno.getEndereco());
            pstm.setString(11, objaluno.getBairro());
            pstm.setDouble(12, objaluno.getNumero());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Salvo !");

            pstm.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "AlunoDao" + e);

        }

        
        

    

}
    
    public ArrayList<Alunos>ListaAluno(){

        String sql = "select nome,matricula from aluno";
        try {
            Conn = new ConexaoDao().ConectaBD();
            pstm = Conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {

                Alunos objalunodao = new Alunos();
                objalunodao.setMatricula(rs.getDouble("matricula"));
                objalunodao.setNome(rs.getString("nome"));
                
                lista.add(objalunodao);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "listar aluno " + erro);
        }
        return lista;
    }
    
    
    
}