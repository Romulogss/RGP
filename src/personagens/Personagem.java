package personagens;


/**
 *
 * @author Rômulo
 * @param <T>
 */
public interface Personagem<T> {

    public abstract void takeDemage(T o);

    public abstract String getNome();

    public abstract double getPontosDeVida();

    public abstract double getForca();

    public abstract double ataqueEspecial();

    public abstract void danoEspecial(double ataqueEspecial);

    public abstract String getTipoDeArma();
    
    public abstract double getDefesa();
    
    public abstract double atacar();

    @Override
    public String toString();

}
