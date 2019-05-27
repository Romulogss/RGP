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

    @Override
    public void takeDemage(Mago mago) {
        double dano;
        dano = (mago.getForca() * .05) - (defesa * .5);
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Feiticeiro feiticeiro) {
        double dano;
        dano = (feiticeiro.getForca() * .05) - (defesa * .5);
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Aprendiz aprendiz) {
        double dano;
        dano = (aprendiz.getForca() * .1) - (defesa * .5);
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Guerreiro guerreiro) {
        double dano;
        dano = (guerreiro.getForca() * .1) - (defesa * .5);
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Arqueiro arqueiro) {
        double dano;
        dano = (arqueiro.getForca() * .08) - (defesa * .5);
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Soldado soldado) {
        double dano;
        dano = (soldado.getForca() * .1) - (defesa * .5);
        pontosDeVida -= dano;
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
