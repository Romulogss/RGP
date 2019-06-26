package figuras;

/**
 *
 * @author Romulo
 */
public class Figura {
    private int coordenadaX;
    private int coordenadaY;

    public Figura() {
    }

    public Figura(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.coordenadaX;
        hash = 59 * hash + this.coordenadaY;
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
        final Figura other = (Figura) obj;
        if (this.coordenadaX != other.coordenadaX) {
            return false;
        }
        if (this.coordenadaY != other.coordenadaY) {
            return false;
        }
        return true;
    }

    

    
    
    @Override
    public String toString() {
        return "Figura{" + "coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + '}';
    }
    
    
}
