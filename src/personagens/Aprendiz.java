package personagens;

import armas.Arma;
import armas.Cajado;

/**
 *
 * @author Rômulo
 */
public class Aprendiz extends Mago {

    private double pontosDeVida = 500;
    private final double forca = 250;
    private final int mana = 150;
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
    public double getForca() {
        return forca + (mana * .25);
    }

    @Override
    public void danoEspecial(double ataqueEspecial) {
        pontosDeVida -= ataqueEspecial;
    }

    @Override
    public void getArma() {
        System.out.println();
    }

    @Override
    public double ataqueEspecial() {
        System.out.println("Meu pet " + getPet() + " me ajuda a atacar!\nSofra com nosso ataque!");
        return getForca() * 1.5;
    }

    @Override
    public String toString() {
        return "Aprendiz{" + "nome=" + super.getNome() + ", pontosDeVida=" + pontosDeVida + ", forca=" + forca + ", mana=" + mana + ", pet=" + pet + '}';
    }

}
