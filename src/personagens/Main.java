package personagens;

/**
 *
 * @author BPMLAB04
 */
public class Main {

    public static void main(String[] args) {
        Mago mago = new Mago("Romulo");
        Feiticeiro feiticeiro = new Feiticeiro("Gabriel", "vida");
        System.out.println(mago.getNome());
        System.out.println(feiticeiro);
        System.out.println(mago.getNome());
        
    }

}
