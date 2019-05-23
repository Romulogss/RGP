package personagens;

/**
 *
 * @author Rômulo
 */
public abstract class Personagem {

    private final String nome;
    protected int pontosDeVida = 500;
    protected final int forca;

    public Personagem(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
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
