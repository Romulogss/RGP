package personagens;

import armas.Arma;
import armas.Espada;

/**
 *
 * @author Rômulo
 */
public class Guerreiro implements Personagem<Personagem> {

    private final String nome;
    private double pontosDeVida = 500;
    private final int forca = 300;
    private final int destreza = 150;
    private Arma arma;
    private final int defesa = 100;

    public Guerreiro(String nome) {
        this.nome = nome;
        arma = new Espada();
    }

    @Override
    public void danoEspecial(double ataqueEspecial) {
        pontosDeVida -= ataqueEspecial;
    }

    @Override
    public double ataqueEspecial() {
        System.out.println("Sofra com meu ataque especial!");
        return atacar() * 1.5;
    }

    @Override
    public double getDefesa() {
        return defesa * .25;
    }

    @Override
    public double getForca() {
        return (forca * .2) + (destreza * .25) + arma.getDano();
    }

    @Override
    public double atacar() {
        double dano;
        try {
            dano = (forca * .2) + (destreza * .25) + arma.getDano();
            arma.usada();
            if (arma.getCicloDeVida() <= 0) {
                arma = null;
            }
        } catch (Exception NullPointerException) {
            dano = (forca * .2) + (destreza * .25);
        }
        return dano;
    }

    @Override
    public double getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipoDeArma() {
        return arma.toString();
    }

    @Override
    public void takeDemage(Personagem personagem) {
        pontosDeVida -= personagem.atacar() / personagem.getDefesa();
    }

    @Override
    public String toString() {
        return "Guerreiro{" + "nome=" + nome + ", pontosDeVida=" + pontosDeVida
                + ", força=" + getForca() + ", destreza=" + destreza
                + ", arma=" + arma.toString() + '}';
    }
}
