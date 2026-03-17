package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_PADRAO =10d;
    protected String titulo;
    protected String descricao;

    public abstract double calcularxp();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }


}
