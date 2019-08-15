import org.junit.Assert;
import org.junit.Test;

public class PontuacaoTest {

    private Pontuacao pontuacao = new Pontuacao();

    @Test
    public void testGetPontuacao() {
        Integer expected = 0;
        Integer score = pontuacao.getPontuacao();
        Assert.assertEquals(expected, score);
    }
}