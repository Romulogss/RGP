package personagens;

/**
 *
 * @author Rômulo
 */
public abstract class Personagem {

    private final String nome;
    protected int pontosDeVida = 500;
    protected final int forca = 250;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public abstract void takeDemage();

    public String getNome() {
        return nome;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public int getForca() {
        return forca;
    }

    @Override
    public String toString() {
        return "Personagem{" + "nome=" + nome + ", pontosDeVida=" + pontosDeVida + ", forca=" + forca + '}';
    }
    
    

}
