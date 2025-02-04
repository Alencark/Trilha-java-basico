package EstruturaRepeticao;
import java.util.concurrent.ThreadLocalRandom;;

public class While {

    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio(2, 8);

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada -= valorDoce;
        }
        System.out.println("mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }
}