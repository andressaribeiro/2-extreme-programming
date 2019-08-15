package curso.xp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KomeCommyTest {

    private Jogo jogo;

    @Before
    public void iniciarJOgo() {
        this.jogo = new JogoImpl();
    }

    @Test
    public void iniciarTela() {
        System.out.println(jogo.tela());

        Assert.assertEquals(
                "0\n" +
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
                "1\n" +
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
                "2\n" +
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
                "1\n" +
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
                "2\n" +
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
                "4\n" +
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
                "8\n" +
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
                "12\n" +
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
                "15\n" +
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
                "24\n" +
                        ".....\n" +
                        ".---.\n" +
                        ".---.\n" +
                        ".---.\n" +
                        ".....\n",
                jogo.tela());

    }

}