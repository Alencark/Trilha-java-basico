package EstruturaRepeticao;
public class ExemplosForArray {

    public static void main(String[] args) { // Método principal que é o ponto de entrada do programa

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" }; // Declaração e inicialização do array de Strings
        

        // Loop 'for' que itera sobre cada elemento do array 'alunos'
        for (int x = 0; x < alunos.length; x++) {

            // Imprime o índice e o nome do aluno correspondente no array
            System.out.println("O Aluno no indice x= " + x + " é " + alunos[x]);
        }
    }
}

class InnerExemplosForArraySimples {

    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (String aluno : alunos) {
            System.out.println("O Aluno é: " + aluno);
        }
    }
}
