package personagens;

/**
 *
 * @author Rômulo
 */
public class Aprendiz extends Mago {

    private final String pet;

    public Aprendiz(String pet, int mana, String nome, int forca) {
        super(mana, nome, forca);
        this.pet = pet;
    }

    public String getPet() {
        return pet;
    }

    @Override
    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void takeDemage(int ataque) {
        pontosDeVida -= ataque;
    }

}
