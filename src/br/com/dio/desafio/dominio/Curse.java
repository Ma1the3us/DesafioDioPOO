package br.com.dio.desafio.dominio;
public class Curse extends Conteudo {

    private  int cargaHoratia ;
    private Mentoria mentoria;


    public Curse(String titulo, String descricao, int cargaHoratia,Mentoria  mentoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoratia = cargaHoratia;
        this.mentoria= mentoria;
    }


    @Override
    public String toString() {
        return "Curse{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoratia=" + cargaHoratia +
                ", mentoria=" + mentoria +
                '}';
    }

    @Override
    public double calcularxp() {
        return XP_PADRAO*cargaHoratia;
    }
}
