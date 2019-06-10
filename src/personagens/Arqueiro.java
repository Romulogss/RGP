package personagens;

import armas.Arco;
import armas.Arma;

/**
 *
 * @author Rômulo
 */
public class Arqueiro extends Guerreiro {

    private double pontosDeVida = 500;
    private final double forca = 250;
    private final double agilidade = 150;
    private final String ataque;
    private Arma arma;

    public Arqueiro(String nome, String ataque) {
        super(nome);
        this.ataque = ataque;
        arma = new Arco();
    }

    @Override
    public double ataqueEspecial() {
        System.out.println("Sofra meu ataque!\n" + this.ataque);
        return atacar() * 1.5;
    }

    public String getAtque() {
        return ataque;
    }

    @Override
    public double atacar() {
        double dano;
        try {
            dano = (forca * .2) + (agilidade * .25) + arma.getDano();
            arma.usada();
            if (arma.getCicloDeVida() <= 0) {
                arma = null;
            }
        } catch (Exception NullPointerException) {
            dano = (forca * .2) + (agilidade * .25);
        }
        return dano;
    }

    @Override
    public double getForca() {
        return (forca * .2) + (agilidade * .25) + arma.getDano();
    }

    @Override
    public double getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public void takeDemage(Personagem personagem) {
        pontosDeVida -= personagem.atacar() / personagem.getDefesa();
    }

    @Override
    public String toString() {
        return "Arqueiro{" + "nome=" + super.getNome() + ", pontosDeVida="
                + super.getPontosDeVida() + ", força=" + getForca()
                + ", agilidade=" + agilidade + ", atque=" + ataque
                + ", arma=" + arma.toString() + '}';
    }

}
