package Condicionais;
public class ExemplosBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero++){
            if(numero == 3)
                break; //ou continue; muda o comportamento do loop, no caso pula o 3 e continua.

            System.out.println(numero);
        }
    }
}
