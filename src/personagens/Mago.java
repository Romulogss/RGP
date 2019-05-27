package personagens;

/**
 *
 * @author Rômulo
 */
public class Mago implements Personagem<Mago> {

    private final String nome;
    private double pontosDeVida = 500;
    private final double forca = 250;
    private final int mana = 150;

    public Mago(String nome) {
        this.nome = nome;
    }

    @Override
    public void takeDemage(Mago mago) {
        double dano;
        dano = mago.getForca() * .1;
        pontosDeVida -= dano;
    }

    public void takeDemage(Feiticeiro feiticeiro) {
        double dano;
        dano = feiticeiro.getForca() * .08;
        pontosDeVida -= dano;
    }

    public void takeDemage(Aprendiz aprendiz) {
        double dano;
        dano = aprendiz.getForca() * .05;
        pontosDeVida -= dano;
    }

    public void takeDemage(Guerreiro guerreiro) {
        double dano;
        dano = guerreiro.getForca() * .2;
        pontosDeVida -= dano;
    }

    public void takeDemage(Arqueiro arqueiro) {
        double dano;
        dano = arqueiro.getForca() * .12;
        pontosDeVida -= dano;
    }

    public void takeDemage(Soldado soldado) {
        double dano;
        dano = soldado.getForca() * .15;
        pontosDeVida -= dano;
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
    public void getArma() {
        System.out.println("Meu cajado divino é arma mística que me torna um ser acima do Humano!");
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
        return "Mago{" + "nome=" + nome + ", pontosDeVida=" + pontosDeVida + ", forca=" + forca + ", mana=" + mana + '}';
    }

}
