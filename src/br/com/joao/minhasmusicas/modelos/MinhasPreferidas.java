package br.com.joao.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void Avaliacao (Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é sucesso absoluto!!!");
        }else {
            System.out.println(audio.getTitulo() + " é uma exelente opção para voçê " +
                    "adicionar em sua playlist");
        }
    }

}
