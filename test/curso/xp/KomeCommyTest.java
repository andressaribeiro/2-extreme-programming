package curso.xp;

import model.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class KomeCommyTest {

    private Jogo jogo;

    @Before
    public void iniciarJOgo() {
        this.jogo = new JogoImpl();
    }

    @Ignore
    @Test
    public void iniciarTela() {
        Assert.assertEquals(
                "@----\n " +
                        "-----\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----",
                jogo.tela());
    }

    @Ignore
    @Test
    public void movimentarDireita() {
        jogo.direita();
        Assert.assertEquals(
                "-@---\n " +
                        "-----\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----",
                jogo.tela());
    }

    @Test
    public void movimentarEsquerda() {
        jogo.direita();
        jogo.direita();
        jogo.esquerda();
        Assert.assertEquals(
                "--@--\n " +
                        "-----\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----",
                jogo.tela());
    }

    @Ignore
    @Test
    public void descer() {
        jogo.desce();
        Assert.assertEquals(
                "-----\n " +
                        "--@--\n" +
                        "-----\n" +
                        "-----\n" +
                        "-----",
                jogo.tela());
    }

    @Ignore
    @Test
    public void subir() {
        jogo.desce();
        jogo.desce();
        jogo.sobe();
        Assert.assertEquals(
                "-----\n " +
                        "-----\n" +
                        "--@--\n" +
                        "-----\n" +
                        "-----",
                jogo.tela());

    }
}