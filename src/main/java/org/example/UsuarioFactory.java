package org.example;

public class UsuarioFactory {
    public Usuario makeUsuario(String nome, String email) {
        if (email.isEmpty()) {
            return new Visitante(nome, email);
        }

        if (email.toLowerCase().endsWith("admin.com.br")) {
            return new Admin(nome, email);
        }

        return new Cliente(nome, email);
    }
}
