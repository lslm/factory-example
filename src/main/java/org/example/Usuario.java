package org.example;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Usuario implements IUsuario {
    private String email;
    private String nome;
    private Permissao permissao;

    public Usuario(String email, String nome, Permissao permissao) {
        this.email = email;
        this.nome = nome;
        this.permissao = permissao;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", permissao=" + permissao +
                '}';
    }

    @Override
    public List<String> getAcessos() {
        List<String> defaultPermissions = new ArrayList<>();
        defaultPermissions.add("marketplace");
        return defaultPermissions;
    }
}
