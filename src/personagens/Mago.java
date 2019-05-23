package personagens;

/**
 *
 * @author Rômulo
 */
public class Mago extends Personagem {

    private final int mana;

    public Mago(int mana, String nome, int forca) {
        super(nome, forca);
        this.mana = mana;
    }

    public void takeDemage(Mago mago) {
        double dano;
        dano = mago.forca * .1;
        pontosDeVida -= dano;
    }

    public void takeDemage(Feiticeiro feiticeiro) {
        double dano;
        dano = feiticeiro.forca * .08;
        pontosDeVida -= dano;
    }
    
    public void takeDemage(Aprendiz aprendiz) {
        double dano;
        dano = aprendiz.forca * .05;
        pontosDeVida -= dano;
    }

    public void takeDemage(Guerreiro guerreiro) {
        double dano;
        dano = guerreiro.forca * .2;
        pontosDeVida -= dano;
    }
    
    public void takeDemage(Arqueiro arqueiro) {
        double dano;
        dano = arqueiro.forca * .12;
        pontosDeVida -= dano;
    }
    
    public void takeDemage(Soldado soldado) {
        double dano;
        dano = soldado.forca * .15;
        pontosDeVida -= dano;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public int getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public void takeDemage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
