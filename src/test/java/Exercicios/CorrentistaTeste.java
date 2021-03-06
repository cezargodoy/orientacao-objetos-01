package Exercicios;

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
        r1.codigo = 001;
        r1.nome = "Cezar";
        r1.email = "cezargodoy10@gmail.com";
        r1.telefone = "11 923123392";
        assertNotNull(r1.codigo);
        assertNotNull(r1.nome);
        assertNotNull(r1.email);
        assertNotNull(r1.telefone);
    }

}
