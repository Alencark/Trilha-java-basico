package EstruturaRepeticao;
import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando Carneirinho: " + carneirinhos);
        }

        System.out.println("Fim da contagem de carneirinhos");
    }
}

class ExemplosForComScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de carneirinhos para contar: ");
        int numeroDeCarneirinhos = scanner.nextInt();

        for (int carneirinhos = 1; carneirinhos <= numeroDeCarneirinhos; carneirinhos++) {
            System.out.println("Contando Carneirinho: " + carneirinhos);
        }

        System.out.println("Fim da contagem de carneirinhos");
        scanner.close();
    }
}
