import br.com.alura.escola.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class EmailTest {

    @Test
    void naoDeveriaCriarEmailComEnderecoInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailinvalido"));
    }

    @Test
    void deveriaCriarEmailComEnderecoValido() {
        String enderecoEmail = "emailvalido@validado.com";
        Email email = new Email(enderecoEmail);
        assertEquals(enderecoEmail ,email.getEnderecoDeEmail());
    }


}
