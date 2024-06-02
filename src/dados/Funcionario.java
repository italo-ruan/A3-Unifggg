
package dados;


public class Funcionario {
 private String Nome ;
 private String Cpf;
 private String Funcao;
 private double Celular;
 private double Salario;
 private double DataE;

    public Funcionario() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public double getCelular() {
        return Celular;
    }

    public void setCelular(double Celular) {
        this.Celular = Celular;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public double getDataE() {
        return DataE;
    }

    public void setDataE(double DataE) {
        this.DataE = DataE;
    }
 
 
}
