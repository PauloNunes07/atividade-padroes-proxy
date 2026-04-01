import interfaces.Conteudo;
import proxy.FilmePremiumProxy;
import usuario.Usuario;

public class Main {
    public static void main(String[] args) {
        Conteudo conteudo = new FilmePremiumProxy();

        //Cenario 1 primeiro teste premium
        Usuario usuario1 = new Usuario("Carlos", "PREMIUM");
        conteudo.assistir(usuario1);

        //Cenario 2 primeiro teste basico
        Usuario usuario2 = new Usuario("Ana", "BASICO");
        conteudo.assistir(usuario2);
         //Cenario 3 segundo teste premium
        Usuario usuario3 = new Usuario("Marina", "PREMIUM");
        conteudo.assistir(usuario3);

        //Cenario 4 segundo teste basico
        Usuario usuario4 = new Usuario("Pedro", "BASICO");
        conteudo.assistir(usuario4);

        //Cenario 5 testando usuario null
        try {

            conteudo.assistir(null);

        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }
    }
}