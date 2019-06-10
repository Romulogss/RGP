package campoDeBatalha;

import java.io.IOException;
import java.util.Scanner;
import personagens.Aprendiz;
import personagens.Arqueiro;
import personagens.Feiticeiro;
import personagens.Guerreiro;
import personagens.Mago;
import personagens.Personagem;
import personagens.Soldado;

/**
 *
 * @author Rômulo
 */
public class Simulador {

    public static int escolherClasse(Scanner ler) {
        System.out.println("Escolha uma classe para jogar");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Soldado");
        System.out.println("3 - Arqueiro");
        System.out.println("4 - Mago");
        System.out.println("5 - Aprendiz");
        System.out.println("6 - Feiticeiro");
        System.out.print(">>");
        String escolha = ler.nextLine();
        return Integer.parseInt(escolha);
    }

    public static Personagem escolherPersonagem(String nome, int escolha) {
        Scanner ler = new Scanner(System.in);
        switch (escolha) {
            case 1:
                Guerreiro guerreiro = new Guerreiro(nome);
                return guerreiro;
            case 2:
                System.out.print("Escolha um nome para sua armadura: ");
                String armadura = ler.nextLine();
                Soldado soldado = new Soldado(nome, armadura);
                return soldado;
            case 3:
                System.out.print("Escolha o nome do seu ataque: ");
                String ataque = ler.nextLine();
                Arqueiro arqueiro = new Arqueiro(nome, ataque);
                return arqueiro;
            case 4:
                Mago mago = new Mago(nome);
                return mago;
            case 5:
                System.out.print("Escolha o nome do seu pet: ");
                String pet = ler.nextLine();
                Aprendiz aprendiz = new Aprendiz(nome, pet);
                return aprendiz;
            case 6:
                System.out.print("Escolha o nome da sua poção: ");
                String pocao = ler.nextLine();
                Feiticeiro feiticeiro = new Feiticeiro(nome, pocao);
                return feiticeiro;
            default:
                throw new AssertionError();
        }
    }

    public static void batalha(Personagem p1, Personagem p2) {
        int contador = 0;
        while (true) {
            contador++;
            if (contador < 5) {
                p1.takeDemage(p2);
                p2.takeDemage(p1);
            } else {
                System.out.println(p1.getNome());
                p1.danoEspecial(p2.ataqueEspecial());
                System.out.println(p2.getNome());
                p2.danoEspecial(p1.ataqueEspecial());
                contador = 0;
            }
            System.out.println("HP do personagem 1: " + p1.getPontosDeVida());
            System.out.println("HP do personagem 2: " + p2.getPontosDeVida());
            
            if (p1.getPontosDeVida() <= 0 && p2.getPontosDeVida() <= 0) {
                System.out.println("Deu empate!");
                break;
            }
            if (p1.getPontosDeVida() <= 0) {
                System.out.println(p1.getNome() + " morreu!");
                System.out.println(p2.getNome() + " é o vencedor!");
                break;
            }
            if (p2.getPontosDeVida() <= 0) {
                System.out.println(p2.getNome() + " morreu!");
                System.out.println(p1.getNome() + " é o vencedor!");
                break;
            }
        }

    }

    public static void main(String[] args) throws IOException{
        String nome;
        int escolha;
        char loop;
        Personagem personagem1, personagem2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Jogador 1!");
        do {
            escolha = escolherClasse(ler);
            System.out.print("Escolha o nome do seu personagem: ");
            nome = ler.nextLine();
            personagem1 = escolherPersonagem(nome, escolha);
            System.out.println(personagem1);
            System.out.println("Deseja trocar de personagem?\n[S/N]");
            loop = ler.nextLine().toLowerCase().charAt(0);
        } while (loop == 's');

        System.out.println("Jogador 2!");
        do {
            escolha = escolherClasse(ler);
            System.out.print("Escolha o nome do seu personagem: ");
            nome = ler.nextLine();
            personagem2 = escolherPersonagem(nome, escolha);
            System.out.println(personagem2);
            System.out.println("Deseja trocar de personagem?\n[S/N]");
            loop = ler.nextLine().toLowerCase().charAt(0);
        } while (loop == 's');

        System.out.println("Personagens escolhidos");
        System.out.println("Personagem 1: " + personagem1);
        System.out.println("Personagem 2: " + personagem2);

        System.out.println("A batalha irá começar!");
        System.out.println("Pressione <Enter> para começar a batalha!.");
        System.in.read();
        batalha(personagem1, personagem2);
        System.out.println("FIM DE JOGO!!!!!");

    }
}
