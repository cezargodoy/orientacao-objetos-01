package Exercicios;

import Exercicios.Funcionarios;
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
        r1.nome = "Cezar";
        r1.email = "cezargodoy10@gmail.com";
        r1.idade = 27;
        r1.salario = 10000.0;
        assertNotNull(r1.nome);
        assertNotNull(r1.email);
        assertNotNull(r1.idade);
        assertNotNull(r1.salario);
    }

    @Test
    public void metodoObterDados(){
        Funcionarios f1 = new Funcionarios();
        f1.nome = "Cezar Godoym";
        f1.email = "cezargodoy10@gmail.com";
        f1.idade = 27;
        String valorEsperado = "Cezar Godoy, 27 anos (cezagodoy10@gmail.com)";
        String valorObtido = f1.obterDados();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoPorcentagemAumento(){
        Funcionarios r1 = new Funcionarios();
        r1.salario = 3000.0
        Double valorEsperado = 3300.0;
        r1.aumento(10.0);
        Double valorObtido = r1.salario;
        assertEquals(valorEsperado, valorObtido);
    }


}
