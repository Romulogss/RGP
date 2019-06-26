package figuras;

/**
 *
 * @author Romulo
 */
public class Circulo extends Figura{
    private int raio;

    public Circulo() {
    }

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.raio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circulo other = (Circulo) obj;
        if (this.raio != other.raio) {
            return false;
        }
        return true;
    }

    
    
    
}
