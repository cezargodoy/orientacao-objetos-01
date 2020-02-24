package exercicios;

public class Funcionarios {
}
    public String nome;
    public String sobrenome;
    public Integer email;
    public Double salario;

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
    public Integer getEmail() { return email; }
    public Double getSalario() { return salario }
    public Double getAumentoSalario() { return porcentagemAumento}

}