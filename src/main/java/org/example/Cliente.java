package org.example;

import java.util.List;

public class Cliente extends Usuario {
    public Cliente(String email, String nome) {
        super(email, nome, Permissao.CLIENTE);
    }
}
