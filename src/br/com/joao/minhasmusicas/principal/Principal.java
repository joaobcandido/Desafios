package br.com.joao.minhasmusicas.principal;

import br.com.joao.minhasmusicas.modelos.MinhasPreferidas;
import br.com.joao.minhasmusicas.modelos.Musica;
import br.com.joao.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");


        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curti();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("bolha dev");
        meuPodcast.setApresentador("joao candido");


        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();

        }

        for (int i = 0; i < 50; i++) {
            meuPodcast.curti();

        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.Avaliacao(meuPodcast);
        minhasPreferidas.Avaliacao(minhaMusica);

    }
}
