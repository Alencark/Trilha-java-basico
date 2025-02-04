package Exceptions;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();
        
        System.out.println("Qual é o seu sobrenome?");
        String sobrenome = scanner.nextLine();
        
    try{
        System.out.println("Qual é a sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Qual é a sua altura?");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Minha altura é " + altura + " cm ");
        System.out.println("Tenho " + idade + " anos ");
        scanner.close();
    }
    catch(InputMismatchException e){
        System.err.println("O campos idade e altura precisam ser preenchidos com números");
    }
}
}
