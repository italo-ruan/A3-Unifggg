import dados.cadastroUsuario;
 import java.util.ArrayList;
import java.util.List;



public class SistemaLoguin {
 

public class SistemaLogin {
    private List<cadastroUsuario> Usuarios;

    public SistemaLogin() {
        this.Usuarios = new ArrayList<>();
    }

    public boolean cadastrarUsuario(String NUsuario, String senha) {
        if (buscarUsuario(NUsuario) == null) {
            cadastroUsuario usuarios = new cadastroUsuario(NUsuario, senha);
            Usuarios.add(usuarios);
            return true;
        } else {
            System.out.println("Usuário já existe!");
            return false;
        }
    }

    public cadastroUsuario buscarUsuario(String NUsuario) {
        for (cadastroUsuario usuario : Usuarios) {
            if (usuario.getNUsuario().equals(NUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    public boolean autenticarUsuario(String nomeUsuario, String senha) {
        cadastroUsuario usuario = buscarUsuario(nomeUsuario);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return true;
        } else {
            return false;
        }
    }

  
        
    
    
}  
}
