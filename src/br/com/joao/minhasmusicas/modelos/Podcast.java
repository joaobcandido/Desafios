package br.com.joao.minhasmusicas.modelos;

public class Podcast extends Audio{

    private String apresentador;
    private String descrisao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescrisao() {
        return descrisao;
    }

    public void setDescrisao(String descrisao) {
        this.descrisao = descrisao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 100){
            return 10;
        }else {
            return 8;
        }

    }
}
