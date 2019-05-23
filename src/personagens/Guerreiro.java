package personagens;

/**
 *
 * @author Rômulo
 */
public class Guerreiro extends Personagem {

    private final int destreza;

    public Guerreiro(int forca, int destreza, String nome) {
        super(nome, forca);
        this.destreza = destreza;
    }

    public void takeDemage(Mago mago) {
        double dano;
        dano = mago.forca * .05;
        pontosDeVida -= dano;
    }

    public void takeDemage(Feiticeiro feiticeiro) {
        double dano;
        dano = feiticeiro.forca * .05;
        pontosDeVida -= dano;
    }
    
    public void takeDemage(Aprendiz aprendiz) {
        double dano;
        dano = aprendiz.forca * .1;
        pontosDeVida -= dano;
    }

    public void takeDemage(Guerreiro guerreiro) {
        double dano;
        dano = guerreiro.forca * .1;
        pontosDeVida -= dano;
    }
    
    public void takeDemage(Arqueiro arqueiro) {
        double dano;
        dano = arqueiro.forca * .08;
        pontosDeVida -= dano;
    }
    
    public void takeDemage(Soldado soldado) {
        double dano;
        dano = soldado.forca * .1;
        pontosDeVida -= dano;
    }
    
    @Override
    public int getForca() {
        return forca;
    }

    public int getDestreza() {
        return destreza;
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
