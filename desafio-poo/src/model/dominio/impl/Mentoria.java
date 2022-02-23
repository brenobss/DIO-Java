package model.dominio.impl;

import java.time.LocalDate;

import model.dominio.Conteudo;

public class Mentoria extends Conteudo{
    
    private LocalDate data;

    public Mentoria() {
	super();
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
	super(titulo, descricao);
	this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
	return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
	return "Mentoria [data=" + data + ", titulo=" + titulo + ", descricao=" + descricao + "]";
    }


}
