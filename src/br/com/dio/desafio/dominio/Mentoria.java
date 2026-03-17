package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String Nome;
    private String Email;

    public Mentoria(String nome, String email) {
        Nome = nome;
        Email = email;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return Email;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Nome='" + Nome + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
