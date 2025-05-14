import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    private int numeroAleatorio;

    public Aleatorio() {
        this.numeroAleatorio = generarAleatorio();
    }

    public int getNumeroAleatorio() {
        return this.numeroAleatorio;
    }

    public int generarAleatorio() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(100)+1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aleatorio aleatorio = new Aleatorio();
        int numero;
        for (int i = 0; i < 5;) {
            System.out.print("Informe o numero: ");
            numero = scanner.nextInt();
            if (numero == aleatorio.getNumeroAleatorio()) {
                System.out.println("Parabéns você acertou!");
                System.out.printf("O número sorteado foi: %d%n", aleatorio.getNumeroAleatorio());
                break;
            } else {
                if (numero > aleatorio.getNumeroAleatorio()) {
                    System.out.println("Tente novamente, o número é menor.");
                } else {
                    System.out.println("Tente novamente, o número é maior.");
                }
                System.out.println("Tente novamente!");
                System.out.printf("Você tem mais %d tentativas%n", 4 - i);
                i++;
            }
        }
        scanner.close();
    }
}
