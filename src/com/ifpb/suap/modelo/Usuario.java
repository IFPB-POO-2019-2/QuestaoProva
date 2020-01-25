package com.ifpb.suap.modelo;

import com.ifpb.suap.excecoes.LoginInvalidoException;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario implements Autenticavel {

    private String email;
    private String nome;
    private LocalDate nascimento;
    private String senha;

    public Usuario(String email, String nome,
               LocalDate nascimento, String senha){
        this.email = email;
        this.nome = nome;
        this.nascimento = nascimento;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(email, usuario.email) &&
                Objects.equals(nome, usuario.nome) &&
                Objects.equals(nascimento, usuario.nascimento) &&
                Objects.equals(senha, usuario.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, nome, nascimento, senha);
    }

    @Override
    public boolean autenticar(String email, String senha)
            throws LoginInvalidoException {
        if(!email.equals(this.email) ||
                senha.equals(this.senha)){
            throw new LoginInvalidoException("Dados não conferem");
        }else{
            return true;
        }
    }
}