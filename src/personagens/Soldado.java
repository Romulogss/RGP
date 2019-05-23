package personagens;

/**
 *
 * @author Rômulo
 */
public class Soldado extends Guerreiro {

    private final String armadura;

    public Soldado(String armadura, int forca, int agilidade, String nome) {
        super(forca, agilidade, nome);
        this.armadura = armadura;
    }

    @Override
    public void takeDemage(Mago mago) {
        double dano;
        dano = mago.forca * .05;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Feiticeiro feiticeiro) {
        double dano;
        dano = feiticeiro.forca * .05;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Aprendiz aprendiz) {
        double dano;
        dano = aprendiz.forca * .1;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Guerreiro guerreiro) {
        double dano;
        dano = guerreiro.forca * .1;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Arqueiro arqueiro) {
        double dano;
        dano = arqueiro.forca * .08;
        pontosDeVida -= dano;
    }

    @Override
    public void takeDemage(Soldado soldado) {
        double dano;
        dano = soldado.forca * .1;
        pontosDeVida -= dano;
    }

    public String getArmadura() {
        return armadura;
    }

    @Override
    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void takeDemage(int ataque) {
        pontosDeVida -= ataque;
    }
}
