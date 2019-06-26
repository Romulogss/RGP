package figuras;

/**
 *
 * @author Romulo
 */
public class Retangulo extends Figura {
    private int largura;
    private int altura;

    public Retangulo() {
    }

    public Retangulo(int largura, int altura, int coordenadaX, int coordenadaY) {
        super(coordenadaX, coordenadaY);
        this.largura = largura;
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.largura;
        hash = 41 * hash + this.altura;
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
        final Retangulo other = (Retangulo) obj;
        if (this.largura != other.largura) {
            return false;
        }
        if (this.altura != other.altura) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Retangulo{" + "largura=" + largura + ", altura=" + altura + '}';
    }
    
    
}
