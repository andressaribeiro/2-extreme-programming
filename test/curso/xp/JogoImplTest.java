package curso.xp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JogoImplTest {

    private Jogo jogo;

    @Before
    public void iniciarJogo() {
        this.jogo = new JogoImpl();
        this.jogo.tela();
    }

    @Test
    public void iniciarTela() {
        Assert.assertEquals(
                "Pontos: 0\n" +
                        "@----\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----\n",
                jogo.tela());
    }

    @Test
    public void movimentarDireita() {
        jogo.direita();
        Assert.assertEquals(
                "Pontos: 1\n" +
                        ".@---\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----\n",
                jogo.tela());
    }

    @Test
    public void movimentarEsquerda() {
        jogo.direita();
        jogo.direita();
        jogo.esquerda();
        Assert.assertEquals(
                "Pontos: 2\n" +
                        ".@.--\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----\n",
                jogo.tela());
    }

    @Test
    public void descer() {
        jogo.desce();
        Assert.assertEquals(
                "Pontos: 1\n" +
                        ".----\n" +
                        "@----\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----\n",
                jogo.tela());
    }

    @Test
    public void subir() {
        jogo.desce();
        jogo.desce();
        jogo.sobe();
        Assert.assertEquals(
                "Pontos: 2\n" +
                        ".----\n" +
                        "@----\n" +
                        ".----\n" +
                        "-----\n" +
                        "-----\n",
                jogo.tela());
    }

    @Test
    public void movimentarFinal() {
        jogo.direita();
        jogo.direita();
        jogo.direita();
        jogo.direita();
        jogo.direita();
        Assert.assertEquals(
                "Pontos: 4\n" +
                        "....@\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----\n",
                jogo.tela());

        jogo.desce();
        jogo.desce();
        jogo.desce();
        jogo.desce();
        jogo.desce();
        Assert.assertEquals(
                "Pontos: 8\n" +
                        ".....\n" +
                        "----.\n" +
                        "----.\n" +
                        "----.\n" +
                        "----@\n",
                jogo.tela());

        jogo.esquerda();
        jogo.esquerda();
        jogo.esquerda();
        jogo.esquerda();
        jogo.esquerda();
        Assert.assertEquals(
                "Pontos: 12\n" +
                        ".....\n" +
                        "----.\n" +
                        "----.\n" +
                        "----.\n" +
                        "@....\n",
                jogo.tela());

        jogo.sobe();
        jogo.sobe();
        jogo.sobe();
        jogo.sobe();
        jogo.sobe();
        Assert.assertEquals(
                        "Pontos: 15\n" +
                        "@....\n" +
                        ".---.\n" +
                        ".---.\n" +
                        ".---.\n" +
                        ".....\n",
                jogo.tela());

        jogo.direita();
        jogo.desce();
        jogo.desce();
        jogo.desce();
        jogo.direita();
        jogo.sobe();
        jogo.sobe();
        jogo.direita();
        jogo.desce();
        jogo.desce();
        jogo.desce();
        jogo.direita();

        Assert.assertEquals(
                        "Pontos: 24\n" +
                        ".....\n" +
                        ".....\n" +
                        ".....\n" +
                        ".....\n" +
                        "....@\n",
                jogo.tela());

    }

}