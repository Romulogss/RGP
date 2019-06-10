package armas;

/**
 *
 * @author Rômulo
 */
public abstract class Arma {

    private final double dano = 150;
    private int cicloDeVida = 5;

    public double getDano() {
        return dano * .2;
    }

    public void usada() {
        cicloDeVida--;
    }

    public int getCicloDeVida() {
        return cicloDeVida;
    }

    @Override
    public String toString() {
        return "Arma{" + "dano=" + getDano() +'}';
    }
    
    

}
