package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cadastro de usuarios");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Usuario usuario = new UsuarioFactory().makeUsuario(nome, email);

        System.out.println(usuario);
        System.out.println(usuario.getAcessos());
    }
}
