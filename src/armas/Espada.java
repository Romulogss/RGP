package armas;

/**
 *
 * @author Rômulo
 */
public class Espada extends Arma {

    private final double corte = 50;

    @Override
    public double getDano() {
        return (.2 * corte) + super.getDano();
    }

    @Override
    public String toString() {
        return "Espada{" + "dano=" + super.getDano() + '}';
    }
    
        
    
}
