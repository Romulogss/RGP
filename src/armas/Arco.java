package armas;

/**
 *
 * @author Rômulo
 */
public class Arco extends Arma {
    private final int precisao = 50;
    
    @Override
    public double getDano(){
        return (.2 * precisao) + super.getDano();
    }

    @Override
    public String toString() {
        return "Arco{" + "dano=" + super.getDano() + '}';
    }
    
    
}
