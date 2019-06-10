package personagens;

import armas.Arma;
import armas.Cajado;

/**
 *
 * @author Rômulo
 */
public class Aprendiz extends Mago {

    private double pontosDeVida = 500;
    private final String pet;
    private Arma arma;

    public Aprendiz(String nome, String pet) {
        super(nome);
        this.pet = pet;
        arma = new Cajado();
    }

    public String getPet() {
        return pet;
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
        System.out.println("Meu pet " + getPet() + " me ajuda a atacar!\nSofra com nosso ataque!");
        return atacar() * 1.5;
    }

    @Override
    public void takeDemage(Personagem personagem) {
        pontosDeVida -= personagem.atacar() / personagem.getDefesa();
    }

    @Override
    public String toString() {
        return "Aprendiz{" + "nome=" + super.getNome() + ", pontosDeVida="
                + pontosDeVida + ", força=" + super.getForca() + ", mana=" + super.getMana()
                + ", pet=" + pet + ", arma=" + arma.toString() + '}';
    }

}
