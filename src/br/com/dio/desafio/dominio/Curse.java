package br.com.dio.desafio.dominio;

public class Curse {
private String titulo;
    private String descricao;
    private  int cargaHoratia ;


    public Curse(String titulo, String descricao, int cargaHoratia) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoratia = cargaHoratia;
    }



    @Override
    public String toString() {
        return "Curse{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoratia=" + cargaHoratia +
                '}';
    }
}
