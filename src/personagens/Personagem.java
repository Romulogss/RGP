package personagens;

/**
 *
 * @author Rômulo
 * @param <T>
 */
public interface Personagem<T> {

    public abstract void takeDemage(T o);
    public String getNome();
    public double getPontosDeVida();
    public double getForca();
    public double ataqueEspecial();
    public void danoEspecial(double ataqueEspecial);
    public void getArma();
    @Override
    public String toString();

}
