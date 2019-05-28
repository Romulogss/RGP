package personagens;

import armas.Arco;
import armas.Arma;

/**
 *
 * @author Rômulo
 */
public class Arqueiro extends Guerreiro {

    private double pontosDeVida = 500;
    private final double forca = 300;
    private final double agilidade = 150;
    private final String ataque;
    private final Arma arma;

    public Arqueiro(String nome, String ataque) {
        super(nome);
        this.ataque = ataque;
        arma = new Arco();
    }

    @Override
    public double ataqueEspecial() {
        System.out.println("Sofra meu ataque!\n" + this.ataque);
        return getForca() * 1.5;
    }

    public String getAtque() {
        return ataque;
    }

    @Override
    public void danoEspecial(double ataqueEspecial) {
        pontosDeVida -= ataqueEspecial;
    }

    @Override
    public double getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public double getForca() {
        return forca * agilidade * .2;
    }

    @Override
    public String toString() {
        return "Arqueiro{" + "nome=" + super.getNome() + ", pontosDeVida="
                + pontosDeVida + ", força=" + getForca()
                + ", agilidade=" + agilidade + ", atque=" + ataque
                + ", arma=" + arma.toString() + '}';
    }

}
