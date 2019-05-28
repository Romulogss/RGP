package personagens;

/**
 *
 * @author Rômulo
 */
public class Soldado extends Guerreiro {

    private double pontosDeVida = 500;
    private final String armadura;
    private final int defesa = 150;

    public Soldado(String nome, String armadura) {
        super(nome);
        this.armadura = armadura;
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
    public void getArma() {
        System.out.println("Minha espada leve é uma arma e poderosa, e minha armadura me fortalece!");
    }

    public int getDefesa() {
        return defesa;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nome=" + super.getNome() + ", pontosDeVida=" + pontosDeVida + ", armadura=" + armadura + ", defesa=" + defesa + '}';
    }

}
