package exercicios;

import exemplos.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FuncionariosTeste {

    @Test
    public void criarObjetoFuncionarios() {
        Funcionarios r1 = new Funcionarios();
        assertNotNull(r1)
    }

    @Test
    public void presencaAtributos(){
        Correntista r1 = new Correntista();
        r1.nome;
        r1.email;
        r1.idade;
        r1.salario;
        assertNotNull(r1.nome);
        assertNotNull(r1.email);
        assertNotNull(r1.idade);
        assertNotNull(r1.salario);
    }

    @Test
    public void metodoPorcentagemAumento(){
        salario r1 = new Salario();
        r1.percentage = 10;
        r1.salario = 3000.0
        Double valorEsperado = 3300.0;

        Double valorObtido = r1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }




}
