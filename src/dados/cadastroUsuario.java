
package dados;


public class cadastroUsuario {
    
  private String NUsuario;
  private String Senha;
  
    public cadastroUsuario(String NUsuario,String Senha){
    this.NUsuario = NUsuario;
    this.Senha = Senha;
    
    }

    public cadastroUsuario() {
    }

    public String getNUsuario() {
        return NUsuario;
    }

    public void setNUsuario(String NUsuario) {
        this.NUsuario = NUsuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
}
