
package Metodos;

public class Funcionario {
  private double Id;
  private String Nome;
  private String Funcao;
private double Salario;
private double Cpf;
private double Celular;
private double DataDeEntrada;

    public Funcionario() {
    }

    public double getId() {
        return Id;
    }

    public void setId(double Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public double getCpf() {
        return Cpf;
    }

    public void setCpf(double Cpf) {
        this.Cpf = Cpf;
    }

    public double getCelular() {
        return Celular;
    }

    public void setCelular(double Celular) {
        this.Celular = Celular;
    }

    public double getDataDeEntrada() {
        return DataDeEntrada;
    }

    public void setDataDeEntrada(double DataDeEntrada) {
        this.DataDeEntrada = DataDeEntrada;
    }



}
