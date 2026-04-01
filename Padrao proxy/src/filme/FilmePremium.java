package filme;

import interfaces.Conteudo;
import usuario.Usuario;

public class FilmePremium implements Conteudo {
    public void assistir(Usuario usuario) {
        System.out.printf("Reproduzindo Filme premium para %s%n",usuario.getNome());

    }
}
