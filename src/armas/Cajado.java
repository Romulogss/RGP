package armas;

/**
 *
 * @author Rômulo
 */
public class Cajado extends Arma{
    private final double magia = 50;
    
    @Override
    public double getDano(){
        return (.2 * magia) + super.getDano();
    }

    @Override
    public String toString() {
        return "Cajado{" + "dano=" + super.getDano() + '}';
    }
    
    

}
