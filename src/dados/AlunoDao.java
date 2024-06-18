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

    public ArrayList<Alunos> ListaAluno() {

        String sql = "select * from aluno";
        try {
            Conn = new ConexaoDao().ConectaBD();
            pstm = Conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                Alunos objalunodao = new Alunos();
                objalunodao.setMatricula(rs.getInt("matricula"));
                objalunodao.setNome(rs.getString("nome"));
                objalunodao.setEmail(rs.getString("email"));
                objalunodao.setCpf(rs.getDouble("cpf"));
                objalunodao.setDataNasc(rs.getDouble("datanasc"));
                objalunodao.setCelular(rs.getDouble("celular"));
                objalunodao.setPais(rs.getString("pais"));
                 objalunodao.setEstado(rs.getString("estado"));
                objalunodao.setCidade(rs.getString("cidade"));
                objalunodao.setEndereco(rs.getString("endereco"));
                objalunodao.setBairro(rs.getString("bairro"));
                objalunodao.setNumero(rs.getDouble("numero"));

                lista.add(objalunodao);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "listar aluno " + erro);
        }
        return lista;
    }

    public void editar(Alunos objalunos){
       Conn = new ConexaoDao().ConectaBD();
   String sql = "update aluno set nome =? ,email = ?,cpf =?,datanasc = ? ,celular= ?,pais= ?,estado= ?,cidade  = ? ,endereco = ? ,bairro = ?,numero = ? where matricula = ? ";
     
    
     try {
            pstm = Conn.prepareStatement(sql);
            
            pstm.setString(1, objalunos.getNome());
            pstm.setString(2, objalunos.getEmail());
            pstm.setDouble(3, objalunos.getCpf());
            pstm.setDouble(4, objalunos.getDataNasc());
            pstm.setDouble(5, objalunos.getCelular());
            pstm.setString(6, objalunos.getPais());
            pstm.setString(7, objalunos.getEstado());
            pstm.setString(8, objalunos.getCidade());
            pstm.setString(9, objalunos.getEndereco());
            pstm.setString(10, objalunos.getBairro());
            pstm.setDouble(11, objalunos.getNumero());
            pstm.setInt(12, objalunos.getMatricula());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Alteraçao salva!");

            pstm.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "editar" + e);

    
    
    
    }
    }
    
    public void excluir(Alunos objalunos){
      Conn = new ConexaoDao().ConectaBD();
      
    String sql = "delete from aluno where matricula = ?";
       try {
            pstm = Conn.prepareStatement(sql);
            pstm.setDouble(1, objalunos.getMatricula());
           
            pstm.execute();
            JOptionPane.showMessageDialog(null, "dados Excluidos!");

            pstm.close();
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Excluir" + erro);

    
    }
    
    
    
    
    } 
    
    
}
