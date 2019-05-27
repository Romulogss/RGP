package personagens;

/**
 *
 * @author Rômulo
 */
public class Guerreiro implements Personagem<Guerreiro> {

    private final String nome;
    private double pontosDeVida = 500;
    private final int forca = 300;
    private final int destreza = 150;

    public Guerreiro(String nome) {
        this.nome = nome;
    }

    public void takeDemage(Mago mago) {
        double dano;
        dano = mago.getForca() * .05;
        pontosDeVida -= dano;
    }

    public void takeDemage(Feiticeiro feiticeiro) {
        double dano;
        dano = feiticeiro.getForca() * .05;
        pontosDeVida -= dano;
    }

    public void takeDemage(Aprendiz aprendiz) {
        double dano;
        dano = aprendiz.getForca() * .1;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Guerreiro guerreiro) {
        double dano;
        dano = guerreiro.getForca() * .1;
        pontosDeVida -= dano;
    }

    public void takeDemage(Arqueiro arqueiro) {
        double dano;
        dano = arqueiro.getForca() * .08;
        pontosDeVida -= dano;
    }

    public void takeDemage(Soldado soldado) {
        double dano;
        dano = soldado.getForca() * .1;
        pontosDeVida -= dano;
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
    public void getArma(){
        System.out.println("Minha espada pesada é uma arma poderosa!");
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
    public String toString() {
        return "Guerreiro{" + "nome=" + nome + ", pontosDeVida=" + pontosDeVida + ", forca=" + forca + ", destreza=" + destreza + '}';
    }
    
    
}
