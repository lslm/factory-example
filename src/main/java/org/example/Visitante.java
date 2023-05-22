package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Visitante extends Usuario {
    public Visitante(String email, String nome) {
        super(email, nome, Permissao.VISITANTE);
    }

    @Override
    public List<String> getAcessos() {
        return new ArrayList<>();
    }
}
