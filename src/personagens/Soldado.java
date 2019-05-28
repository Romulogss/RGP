package personagens;

import armas.Arma;
import armas.Espada;

/**
 *
 * @author Rômulo
 */
public class Soldado extends Guerreiro {

    private double pontosDeVida = 500;
    private final String armadura;
    private final int defesa = 150;
    private final Arma arma;

    public Soldado(String nome, String armadura) {
        super(nome);
        this.armadura = armadura;
        arma = new Espada();
    }

    public String getArmadura() {
        return armadura;
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
        System.out.println("Minha armadura " + getArmadura() + " aumenta meu poder, sofra com meu ataque especial!");
        return getForca() * 1.5;
    }

    @Override
    public void takeDemage(Personagem personagem) {
        pontosDeVida -= personagem.getForca() - (.2 * defesa);
    }

    public int getDefesa() {
        return defesa;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nome=" + super.getNome() + ", pontosDeVida="
                + pontosDeVida + ", força" + super.getForca() + ", armadura=" + armadura
                + ", defesa=" + defesa + ", arma=" + arma.toString() + '}';
    }

}
