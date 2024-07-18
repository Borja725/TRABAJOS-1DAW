import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    static Calculadora calc;

    @BeforeEach
    public void antesDeCada(){
        calc = new Calculadora();
    }

    @AfterEach
    public void despuesDeCada () {
        calc.restablecer();
    }

    @Test
    public void pruebaSuma () {
        Assertions.assertEquals(6, calc.suma(5, 1));
    }
    @Test
    public void pruebaresta () {
        Assertions.assertEquals(2, calc.resta(8, 6));
    }
    @Test
    public void pruebaMultiplica () {
        Assertions.assertEquals(480, calc.multiplica(80, 6));
    }
    @Test
    public void pruebaDivideix () {
        Assertions.assertEquals(6, calc.divideix(36, 6));
    }
    @Test
    public void pruebaMajorQue () {
        Assertions.assertEquals(true, calc.majorQue(25, 24));
    }

}