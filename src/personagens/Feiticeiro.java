package personagens;

/**
 *
 * @author Rômulo
 */
public class Feiticeiro extends Mago {

    private final String pocoes;

    public Feiticeiro(String pocoes, int mana, String nome, int forca) {
        super(mana, nome, forca);
        this.pocoes = pocoes;
    }

    public String getPocoes() {
        return pocoes;
    }

    @Override
    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void takeDemage(int ataque) {
        pontosDeVida -= ataque;
    }
}
