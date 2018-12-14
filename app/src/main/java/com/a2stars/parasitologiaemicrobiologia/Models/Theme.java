package com.a2stars.parasitologiaemicrobiologia.Models;

public class Theme {

    private Long ident;
    private String titulo;
    private int imagem1;
    private String vlink;
    private String tlink;

    public Long getIdent() {
        return ident;
    }

    public void setIdent(Long ident) {
        this.ident = ident;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem1() {
        return imagem1;
    }

    public void setImagem1(int imagem1) {
        this.imagem1 = imagem1;
    }

    public String getVlink() {
        return vlink;
    }

    public void setVlink(String vlink) {
        this.vlink = vlink;
    }

    public String getTlink() {
        return tlink;
    }

    public void setTlink(String tlink) {
        this.tlink = tlink;
    }
}
