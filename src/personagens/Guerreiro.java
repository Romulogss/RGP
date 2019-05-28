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
    private final Arma arma;

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
        return getForca() * 1.5;
    }

    @Override
    public double getForca() {
        return forca + (destreza * .5);
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
        pontosDeVida -= personagem.getForca();
    }

    @Override
    public String toString() {
        return "Guerreiro{" + "nome=" + nome + ", pontosDeVida=" + pontosDeVida
                + ", força=" + forca + ", destreza=" + destreza
                + ", arma=" + arma.toString() + '}';
    }
}
