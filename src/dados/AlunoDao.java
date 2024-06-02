package dados;

import Dados.Alunos;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class AlunoDao {
    Connection conn;
    Statement st;

    public AlunoDao() {
    }
    
public boolean conectar (){

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","root","");
  
        st = conn.createStatement();
        
         return true;
    } catch (ClassNotFoundException |SQLException ex) {
        return false;
        
    } 
    
   } 
public int Salva (Alunos aluno){
    int conec;
    
try {
    String inserir;
inserir = "INSERT INTO alunos VALUES('" +aluno.getNome() +"', '" +  aluno.getEndereco()+ "','" + aluno.getEstado()+ "' , '" + aluno.getPais()+ "' , " +  aluno.getCpf()+" ,'" + aluno.getBairro()+ "' ,'" + aluno.getDataNasc() + "' ,'" + aluno.getCidade()+ "', " +  aluno.getNumero()+","+ aluno.getCelular()+")"; 
        
           conec = st.executeUpdate(inserir);
            return conec;//retonar 1
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }

}

public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
          
        }

}

  
}