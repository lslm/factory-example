package org.example;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Admin extends Usuario {
    public Admin(String email, String nome) {
        super(email, nome, Permissao.ADMIN);
    }

    @Override
    public List<String> getAcessos() {
        List<String> adminAcessos = super.getAcessos();
        adminAcessos.add("backoffice");
        return adminAcessos;
    }
}
