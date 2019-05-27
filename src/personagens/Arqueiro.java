package personagens;

/**
 *
 * @author Rômulo
 */
public class Arqueiro extends Guerreiro {

    private double pontosDeVida = 500;
    private final double forca = 300;
    private final double agilidade = 150;
    private final String ataque;

    public Arqueiro(String nome, String ataque) {
        super(nome);
        this.ataque = ataque;
    }

    @Override
    public double ataqueEspecial() {
        System.out.println("Sofra meu ataque!\n" + this.ataque);
        return getForca() * 1.5;
    }

    @Override
    public void takeDemage(Mago mago) {
        double dano;
        dano = (mago.getForca() * .15) - (agilidade * .15);
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
        dano = guerreiro.getForca() * .15;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Arqueiro arqueiro) {
        double dano;
        dano = arqueiro.forca * .1;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Soldado soldado) {
        double dano;
        dano = soldado.getForca() * .12;
        pontosDeVida -= dano;
    }

    public String getAtque() {
        return ataque;
    }

    @Override
    public void danoEspecial(double ataqueEspecial) {
        pontosDeVida -= ataqueEspecial;
    }

    @Override
    public double getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public double getForca() {
        return forca * agilidade * .2;
    }
    
    @Override
    public void getArma(){
        System.out.println("Meu arco e flecha é uma arma incrivelmente ágil e poderosa!");
    }

    @Override
    public String toString() {
        return "Arqueiro{"  + "nome=" + super.getNome() + ", pontosDeVida=" + pontosDeVida + ", forca=" + forca + ", agilidade=" + agilidade + ", atque=" + ataque + '}';
    }

}
