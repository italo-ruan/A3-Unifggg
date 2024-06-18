package dados;


import Metodos.Matricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class MatriculaDao {

    Connection Conn;
    PreparedStatement pstm;

    public void CadastroMatricula(Matricula objmatricula) {
        String sql = "insert into Matricula( matricula,valorm,data_cadastro,modalidade,valor,data_inicio,data_venc ) values (?,?,?,?,?,?,?)";

        Conn = new ConexaoDao().ConectaBD();
        try {
            pstm = Conn.prepareStatement(sql);
            pstm.setDouble(1, objmatricula.getMatricula());
            pstm.setDouble(2, objmatricula.getValorM());
            pstm.setDouble(3, objmatricula.getDatac());
            pstm.setString(4, objmatricula.getModalidade());
            pstm.setDouble(5, objmatricula.getValor());
            pstm.setDouble(6, objmatricula.getInicio());
            pstm.setDouble(7, objmatricula.getDataVc());
        
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Salvo !");

            pstm.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Matricula Dao" + e);

        }

    }
}
