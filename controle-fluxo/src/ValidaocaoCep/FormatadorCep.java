package ValidaocaoCep;

public class FormatadorCep {
    

    public static void main(String[] args) {
        try {
            String cepFormatado = formatar("2378123");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
           System.out.println("Cep inválido");
        }

    }
    static String formatar(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

            return(cep);
    }   
}
