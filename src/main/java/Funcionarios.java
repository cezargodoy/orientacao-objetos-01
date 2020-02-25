package exercicios;

public class Funcionarios {
}
    public String nome;
    public String sobrenome;
    public Integer email;
    public Double salario;

    public String obterDados() {
        return nome + " " + sobrenome + ", " + idade + " anos " + "( " + email + ")";
    }
    public void promover(Double porcetagemAumento) {
        salario = salario + (salario * +(porcetagemAumento / 100.0))
    }
}
