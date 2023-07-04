package br.com.myMusics.main;

import br.com.myMusics.modules.minhasPreferidas;
import br.com.myMusics.modules.musica;
import br.com.myMusics.modules.podcast;
    public class Main {
        public static void main(String[]args){

            //musica

            musica minhaMusica = new musica();
            minhaMusica.setTitulo("Forever");
            minhaMusica.setArtista("Kiss");

            for (int i = 0; i < 1000; i++) {
                minhaMusica.reproduz();
            }

            for (int i = 0; i < 50; i++) {
                minhaMusica.curte();
            }

            //podcast

            podcast meuPodcast = new podcast();
            meuPodcast.setDescricao("Tudo sobre o mundo DEV");
            meuPodcast.setTitulo("Bolha Dev");

            for (int i = 0; i < 5000; i++) {
                meuPodcast.reproduz();
            }

            for (int j = 0; j < 1000; j++) {
                meuPodcast.curte();
            }

            //preferidas

            minhasPreferidas preferidas = new minhasPreferidas();
            preferidas.inclui(meuPodcast);
            preferidas.inclui(minhaMusica);
        }
    }

