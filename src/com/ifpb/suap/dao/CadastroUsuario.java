package com.ifpb.suap.dao;

//Na prova era pedido com List, mas vou usar Set.

import com.ifpb.suap.modelo.Usuario;

import java.util.HashSet;
import java.util.Set;

public class CadastroUsuario {

    private Set<Usuario> usuarios;

    public CadastroUsuario(){
        usuarios = new HashSet<>();
    }

    public boolean adicionar(Usuario usuario){
        return usuarios.add(usuario);
    }

    public boolean remover(Usuario usuario){
        return usuarios.remove(usuario);
    }

    public Set<Usuario> listar(){
        return usuarios;
    }

}