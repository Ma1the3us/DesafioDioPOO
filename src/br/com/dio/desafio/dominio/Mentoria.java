package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private final LocalDate data= LocalDate.now();
    public Mentoria(String titulo, String descricao) {
       this.titulo = titulo;
       this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularxp() {
        return XP_PADRAO+20d;
    }
}
