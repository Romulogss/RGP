package personagens;

/**
 *
 * @author BPMLAB04
 */
public class Main {

    public static void main(String[] args) {
        Arqueiro guerreiro = new Arqueiro("Romulo", "Dança das flechas!");
        Aprendiz aprendiz = new Aprendiz("Gandf", "drogon");
        System.out.println(guerreiro.getPontosDeVida());
        guerreiro.takeDemage(aprendiz);
        System.out.println(guerreiro.getPontosDeVida() );
    }

}
