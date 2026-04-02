import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SistemaLoginTest {
    /*Baby step*/
    @Test

    public void deveAutenticarUtilizadorValido() {
        SistemaLogin login = new SistemaLogin();

        boolean resultado = login.autenticar("Bibliotecario", "1234");
        assertTrue(resultado);
    }

    @Test

    public void deveRejeitarUtilizadorInvalido() {
        SistemaLogin login = new SistemaLogin();

        boolean resultado = login.autenticar("Aluno", "0000");
        assertFalse(resultado);
    }

}
