package exemplos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {

    @Test
    public void criarObjetoRetangulo(){
        Retangulo r1 = new Retangulo();
        assertNotNull(r1)
    }

    @Test
    public void presencaAtributos(){
        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 20.0;
        assertNotNull(r1.base);
        assertNotNull(r1.altura);
    }

    @Test
    public void metodoCalcularArea(){
        Retangulo r1 = new Retangulo();
        //Arrange
        r1.base = 10.0;
        r1.altura = 20.0;
        Double valorEsperado = 200.0;

        //Act
        Double valorObtido = r1.calcularArea();

        //assert
        assertEquals(valorEsperado, valorObtido);

    }

    @Test
    public void metodoCalcularPerimetro(){
        Retangulo r1 = new Retangulo();
        //Arrange
        r1.base = 10.0;
        r1.altura = 20.0;
        Double valorEsperado = 60.0;

        //Act
        Double valorObtido = r1.calcularPerimetro();

        //assert
        assertEquals(valorEsperado, valorObtido);

    }

}