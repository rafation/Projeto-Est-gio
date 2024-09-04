import java.text.Normalizer;

public class buscaString {

    public static void main(String[] args) {

        String nome = ("AÁàãÂa");
        String nomeNormalized = Normalizer.normalize(nome, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        char letra = 'a';
        char letraM = 'A';
        int conta = 0;

        System.out.println("Seu nome é: " + nome);

        if (nomeNormalized.contains("a") || (nomeNormalized.contains("A"))) {
            for (int i = 0; i < nomeNormalized.length(); i++){
                if (nomeNormalized.charAt(i) == letra || nomeNormalized.charAt(i) == letraM) {
                    conta++;
                }
            }
            System.out.println("A letra '" + letra + "' está presente " + conta + " vezes.");
        }else{
            System.out.println("Letra 'a' não presente no nome informado.");
        }

    }
}
