package com.Collections.Modells;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private String sobrenome;
    ArrayList linhas = new ArrayList<LinhaTelefonica>();

    public Cliente(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " " + sobrenome;
    }
}
