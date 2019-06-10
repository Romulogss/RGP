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
    private Arma arma;
    private final int defesa = 100;

    public Mago(String nome) {
        this.nome = nome;
        arma = new Cajado();
    }

    @Override
    public void takeDemage(Personagem personagem) {
        pontosDeVida -= personagem.atacar() / personagem.getDefesa();
    }
    
    @Override
    public double getDefesa() {
        return defesa * .25;
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
        return atacar() * 1.5;
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
        return (forca * .2) + (mana * .25) + arma.getDano();
    }
    
    @Override
    public double atacar(){
        double dano;
        try {
            dano = (forca * .2) + (mana * .25) + arma.getDano();
            arma.usada();
            if (arma.getCicloDeVida() <= 0) {
                arma = null;
            }
        } catch (Exception NullPointerException) {
            dano = (forca * .2) + (mana * .25);
        }
        return dano;
    }

    @Override
    public String toString() {
        return "Mago{" + "nome=" + nome + ", pontosDeVida=" + pontosDeVida
                + ", força=" + getForca() + ", mana=" + mana
                + ", arma=" + arma.toString() + '}';
    }

}
