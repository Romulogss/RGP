package personagens;

/**
 *
 * @author Rômulo
 */
public class Arqueiro extends Guerreiro {

    private final String atque;

    public Arqueiro(String atque, int agilidade, String nome) {
        super(agilidade, nome);
        this.atque = atque;
    }

    @Override
    public void takeDemage(Mago mago) {
        double dano;
        dano = mago.forca * .15;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Feiticeiro feiticeiro) {
        double dano;
        dano = feiticeiro.forca * .1;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Aprendiz aprendiz) {
        double dano;
        dano = aprendiz.forca * .08;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Guerreiro guerreiro) {
        double dano;
        dano = guerreiro.forca * .15;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Arqueiro arqueiro) {
        double dano;
        dano = arqueiro.forca * .1;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Soldado soldado) {
        double dano;
        dano = soldado.forca * .12;
        pontosDeVida -= dano;
    }

    public String getAtque() {
        return atque;
    }

    @Override
    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void takeDemage(int ataque) {
        pontosDeVida -= ataque;
    }
}
