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
        this.jogo = new Jogo();
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

    @Ignore
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
        jogo.descer();
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
        jogo.descer();
        jogo.descer();
        jogo.subir();
        Assert.assertEquals(
                "-----\n " +
                        "-----\n" +
                        "--@--\n" +
                        "-----\n" +
                        "-----",
                jogo.tela());

    }
}