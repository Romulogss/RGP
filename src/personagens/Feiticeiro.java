package personagens;

import armas.Arma;
import armas.Cajado;

/**
 *
 * @author Rômulo
 */
public class Feiticeiro extends Mago {

    private double pontosDeVida = 500;
    private final String pocoes;
    private final Arma arma;

    public Feiticeiro(String nome, String pocoes) {
        super(nome);
        this.pocoes = pocoes;
        arma = new Cajado();
    }

    public String getPocoes() {
        return pocoes;
    }

    @Override
    public double getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public void danoEspecial(double ataqueEspecial) {
        pontosDeVida -= ataqueEspecial;
    }

    @Override
    public double ataqueEspecial() {
        System.out.println("Minha poção " + getPocoes() + " aumenta meu ataque!\nSofra com meu ataque!");
        return atacar() * 1.5;
    }
    
    @Override
    public void takeDemage(Personagem personagem) {
        pontosDeVida -= personagem.atacar() / personagem.getDefesa();
    }

    @Override
    public String toString() {
        return "Feiticeiro{" + "nome=" + super.getNome() + ", pontosDeVida="
                + pontosDeVida + ", força=" + super.getForca() + ", mana=" + super.getMana()
                + ", pocoes=" + pocoes + ", arma= " + arma.toString() + '}';
    }

}
