import br.com.alura.escola.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {

    @Test
    void naoDeveriaCriarCPFInvalido(){

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("12345678900"));
    }

    @Test
    void deveriaCriarUmCPFValido() {
        String numeroDoCpf = "123.456.789-00";
        CPF cpf = new CPF(numeroDoCpf);
        assertEquals(numeroDoCpf, cpf.getNumero());
    }
}
