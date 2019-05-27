package personagens;

/**
 *
 * @author Rômulo
 */
public class Aprendiz extends Mago {

    private double pontosDeVida = 500;
    private final double forca = 250;
    private final int mana = 150;
    private final String pet;

    public Aprendiz(String nome, String pet) {
        super(nome);
        this.pet = pet;
    }

    public String getPet() {
        return pet;
    }

    @Override
    public double getPontosDeVida() {
        return pontosDeVida;
    }

    public void takeDemage(int ataque) {
        pontosDeVida -= ataque;
    }

    @Override
    public double getForca() {
        return forca * (mana * .25);
    }

    @Override
    public void danoEspecial(double ataqueEspecial) {
        pontosDeVida -= ataqueEspecial;
    }
    
    @Override
    public void getArma(){
        System.out.println("Não possuo arma, mas minha habilidade de atestrar criaturas místicas é mais forte que qualquer arma!");
    }

    @Override
    public double ataqueEspecial() {
        System.out.println("Meu pet " + getPet() + " me ajuda a atacar!\nSofra com nosso ataque!");
        return getForca() * 1.5;
    }

    @Override
    public String toString() {
        return "Aprendiz{" + "nome=" + super.getNome() + ", pontosDeVida=" + pontosDeVida + ", forca=" + forca + ", mana=" + mana + ", pet=" + pet + '}';
    }

}
