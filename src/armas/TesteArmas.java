package armas;

/**
 *
 * @author BPMLAB04
 */
public class TesteArmas {

    public static void main(String[] args) {
        Espada espada = new Espada();
        System.out.println(espada.getDano());
        for (int i = 0; i < 5; i++) {
            espada.usada();
            if (espada.getCicloDeVida() <= 0) {
                espada = null;
            }
            try {
                System.out.println(espada.getDano());
            } catch (Exception NullPointerException) {
                System.out.println("Deu ruim");
            }
        }
        //System.out.println(espada.getDano());
    }
}
