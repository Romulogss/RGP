package personagens;

import armas.Arma;
import armas.Cajado;

/**
 *
 * @author Rômulo
 */
public class Mago implements Personagem<Personagem> {

    private final String nome;
    private double pontosDeVida = 500;
    private final double forca = 250;
    private final int mana = 150;
    private final Arma arma;

    public Mago(String nome) {
        this.nome = nome;
        arma = new Cajado();
    }

    @Override
    public void takeDemage(Personagem personagem) {
        pontosDeVida -= personagem.getForca();
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void danoEspecial(double ataqueEspecial) {
        pontosDeVida -= ataqueEspecial;
    }

    @Override
    public double ataqueEspecial() {
        System.out.println("O mago é implacável!\nSofra!");
        return getForca() * 1.5;
    }

    @Override
    public double getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public String getTipoDeArma() {
        return arma.toString();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getForca() {
        return forca * (mana * .5);
    }

    @Override
    public String toString() {
        return "Mago{" + "nome=" + nome + ", pontosDeVida=" + pontosDeVida
                + ", força=" + forca + ", mana=" + mana
                + ", arma=" + arma.toString() + '}';
    }
    
}
