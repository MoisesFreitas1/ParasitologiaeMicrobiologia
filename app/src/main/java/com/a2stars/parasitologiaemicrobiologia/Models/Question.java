package com.a2stars.parasitologiaemicrobiologia.Models;

/**
 * Created by Moises on 06/02/17.
 */

public class Question {

    private Long id;
    private String tema;
    private String enunciado;
    private String enunciado2;
    private String a;
    private String b;
    private String c;
    private String d;
    private int foto;
    private int gabarito;

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getEnunciado2() {
        return enunciado2;
    }

    public void setEnunciado2(String enunciado2) {
        this.enunciado2 = enunciado2;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public int getGabarito() {
        return gabarito;
    }

    public void setGabarito(int gabarito) {
        this.gabarito = gabarito;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
