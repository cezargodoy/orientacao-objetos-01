package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {

    @Test
    public void criarObjetoCorrentista() {
        Correntista r1 = new Correntista();
        assertNotNull(r1)
    }

    @Test
    public void presencaAtributos(){
        Correntista r1 = new Correntista();
        r1.codigo;
        r1.nome;
        r1.email;
        r1.telefone;
        assertNotNull(r1.codigo);
        assertNotNull(r1.nome);
        assertNotNull(r1.email);
        assertNotNull(r1.telefone);
    }

}

