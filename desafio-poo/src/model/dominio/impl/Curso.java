package model.dominio.impl;

import model.dominio.Conteudo;

public class Curso extends Conteudo{
    
    private Integer cargaHoraria;
    
    public Curso() {
	super();
    }
    
    public Curso(String titulo, String descricao, Integer cargaHoraria) {
	super(titulo, descricao);
	this.cargaHoraria = cargaHoraria;
    }
    
    public Integer getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
	return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
	return "Curso [cargaHoraria=" + cargaHoraria + ", titulo=" + titulo + ", descricao=" + descricao + "]";
    }
    
    
}
