import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalculadoraTest {
    static Calculadora calc=new Calculadora();
    @BeforeEach
    public void antesDeCada() {
        calc = new Calculadora();
    }
    @AfterEach
    public void despuesDeCada() {
        calc.restablecer();
    }
    @Test
    public void probasuma() {
        Assertions.assertEquals(12, calc.suma(6,6));
    }
    @Test
    public void probaresta() {
        Assertions.assertEquals(4, calc.resta(8,4));
    }
    @Test
    public void probadivisio() {
        Assertions.assertEquals(2, calc.divideix(4, 2));
    }
    @Test
    public void probamultiplica() {
        Assertions.assertEquals(10, calc.multiplica(5, 2));
    }
    @Test
    public void probamajorque() {
        Assertions.assertEquals(true,calc.majorQue(3,1));
    }
}