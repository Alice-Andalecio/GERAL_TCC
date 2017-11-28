package br.cefetmg.inf.geral.model.domain;

public class Usuario {

    private long idUsuario;
    private String email;
    private String senha;
    private char idtPerfil;
    private String nome;
    private boolean emailVerificado;

    private int codigoValidacao;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario(long idUsuario, String email, String senha, char idtPerfil) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.senha = senha;
        this.idtPerfil = idtPerfil;
    }

    public Usuario() {
    }

    public Usuario(long idUsuario, String email, String senha) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(long id) {
        this.idUsuario = id;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return idUsuario;
    }

    public void setId(long id) {
        this.idUsuario = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public char getIdtPerfil() {
        return idtPerfil;
    }

    public void setIdtPerfil(char idtPerfil) {
        this.idtPerfil = idtPerfil;
    }
    
    public boolean isEmailVerificado() {
        return emailVerificado;
    }

    public void setEmailVerificado(boolean emailVerificado) {
        this.emailVerificado = emailVerificado;
    }

    public int getCodigoValidacao() {
        return codigoValidacao;
    }

    public void setCodigoValidacao(int codigoValidacao) {
        this.codigoValidacao = codigoValidacao;
    }
}
