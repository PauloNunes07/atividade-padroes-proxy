package proxy;

import filme.FilmePremium;
import interfaces.Conteudo;
import usuario.Usuario;

public class FilmePremiumProxy implements Conteudo {
    private FilmePremium filmePremium;

    public void assistir(Usuario usuario) {

        if(usuario == null) {
            throw new IllegalArgumentException("Usuario invalido");

        }
         if(usuario.getNome() == null || usuario.getNome().isBlank()|| usuario.getNome().isEmpty()) {
            throw new IllegalArgumentException("nome de usuário invalido");
        }

         if(usuario.getPlano() == null || usuario.getPlano().isBlank() || usuario.getPlano().isEmpty()) {
             throw new IllegalArgumentException("Plano do usuário invalido");

         }
         else if(usuario.getPlano().equalsIgnoreCase("PREMIUM")) {
            System.out.printf("Acesso liberado para %s%n",usuario.getNome());
            filmePremium = new FilmePremium();
            filmePremium.assistir(usuario);
             System.out.println("=======================================");

         }

        else if(usuario.getPlano().equalsIgnoreCase("BASICO")) {
            System.out.printf("Acesso negado para %s%n", usuario.getNome());
            System.out.println("=======================================");

        }

        else {
            throw new IllegalArgumentException("Usuário invalido");
        }

    }
}
