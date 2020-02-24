package exemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class QuadradoTeste {

    @Test
    public void criarObjetoQuadrado() {
        Quadrado q1 = new Quadrado();
        assertNotNull(q1);
    }

    @Test
    public void presencaAtributoLado() {
        Quadrado q1 = new Quadrado();
        q1.lado = 10.0;
        assertNotNull(q1.lado);
    }

    @Test
    public void metodoCalcularArea() {

        //Arrage Montar o objeto que vai ser testado, preparar todos os dados
        Quadrado q1 = new Quadrado();
        q1.lado = 10.0;
        Double valorEsperado = 100.0;

        //Act "o que você quer testar
        Double valorObtido = q1.calcularArea();

        //Assert O que você quer avaliar
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Quadrado q1 = new Quadrado();
        q1.lado = 10.0;
        Double valorEsperado = 40.0;
        Double valorObtido = q1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}
