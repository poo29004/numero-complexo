import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Classe para testar o método soma da classe Complexo. Essa classe faz testes parametrizados
 *
 * Veja mais em:
 * https://github.com/junit-team/junit4/wiki/Parameterized-tests
 *
 */
@RunWith(Parameterized.class)
public class TesteSoma {


    @Parameterized.Parameter
    public String resultado;

    @Parameterized.Parameter(1)
    public Complexo primeiro;

    @Parameterized.Parameter(2)
    public Complexo segundo;


    /**
     * Lista com os parâmetros para realização de múltiplos testes. Para teste é pego uma linha e o primeiro
     * elemento do vetor é armazenado no atributo resultado, o segundo elemento é armazendo no atributo primeiro
     * e o terceiro elemento é armazenado no atributo segundo.
     *
     * @return Coleção com todos os testes que deverão ser executados
     */
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"(2,4)", new Complexo(1, 2), new Complexo(1, 2)},
                {"(9,9)", new Complexo(8, 1), new Complexo(1, 8)},
                {"(7,10)", new Complexo(2, 5), new Complexo(5, 5)},
                {"(3,4)", new Complexo(1, 0), new Complexo(2, 4)},
                {"(1,2)", new Complexo(1, 2), null}
        });
    }

    @Test
    public void teste(){
        assertNotNull("É necessário instanciar o primeiro número Complexo", primeiro);
        primeiro.soma(segundo);
        assertEquals("Erro na soma", resultado, primeiro.toString());
    }
}
