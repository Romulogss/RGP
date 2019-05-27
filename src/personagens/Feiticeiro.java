package personagens;

/**
 *
 * @author Rômulo
 */
public class Feiticeiro extends Mago {

    private double pontosDeVida = 500;
    private final double forca = 250;
    private final int mana = 150;
    private final String pocoes;

    public Feiticeiro(String nome, String pocoes) {
        super(nome);
        this.pocoes = pocoes;
    }

    @Override
    public void takeDemage(Mago mago) {
        double dano;
        dano = mago.getForca() * .15;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Feiticeiro feiticeiro) {
        double dano;
        dano = feiticeiro.getForca() * .1;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Aprendiz aprendiz) {
        double dano;
        dano = aprendiz.getForca() * .08;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Guerreiro guerreiro) {
        double dano;
        dano = guerreiro.getForca() * .13;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Arqueiro arqueiro) {
        double dano;
        dano = arqueiro.getForca() * .12;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Soldado soldado) {
        double dano;
        dano = soldado.getForca() * .15;
        pontosDeVida -= dano;
    }

    public String getPocoes() {
        return pocoes;
    }

    @Override
    public double getPontosDeVida() {
        return pontosDeVida;
    }

    public void takeDemage(int ataque) {
        pontosDeVida -= ataque;
    }

    @Override
    public void getArma() {
        System.out.println("Meu fracos de poções é uma arma incrível que me deixa capaz de fazer poções místicas com quase qualquer ingrediente!");
    }

    @Override
    public double getForca() {
        return forca;
    }

    @Override
    public void danoEspecial(double ataqueEspecial) {
        pontosDeVida -= ataqueEspecial;
    }

    @Override
    public double ataqueEspecial() {
        System.out.println("Minha poção " + getPocoes() + " aumenta meu ataque!\nSofra com meu ataque!");
        return getForca() * 1.5;
    }

    @Override
    public String toString() {
        return "Feiticeiro{" + "nome=" + super.getNome() + ", pontosDeVida=" + pontosDeVida + ", forca=" + forca + ", mana=" + mana + ", pocoes=" + pocoes + '}';
    }

}
