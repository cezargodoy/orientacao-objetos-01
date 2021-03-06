package Exercicios;

import Exercicios.Circulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {

    @Test
    public void criarObjetoCirculo() {
        Circulo r1 = new Circulo();
        assertNotNull(r1)
    }

    @Test
    public void presencaAtributos(){
        Circulo r1 = new Circulo();
        r1.pi = Math.PI;
        r1.raio = 6;
        assertNotNull(r1.pi);
        assertNotNull(r1.raio);
    }

    @Test
    public void metodoCalcularArea(){
        Circulo r1 = new Circulo();
        r1.pi = Math.PI;
        r1.raio = 6
        Double valorEsperado = 113.10;

        Double valorObtido = r1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro(){
        Circulo r1 = new Circulo();

        r1.pi = Math.PI;
        r1.raio = 6
        Double valorEsperado = 37.70;

        Double valorObtido = r1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

}
