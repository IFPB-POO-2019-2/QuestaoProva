package com.ifpb.suap.modelo;

import com.ifpb.suap.excecoes.LoginInvalidoException;

public interface Autenticavel {

    boolean autenticar(String email, String senha)
            throws LoginInvalidoException;

}