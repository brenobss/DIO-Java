package model.dominio;

public abstract class Conteudo {
    
    protected final static Double XP_PADRAO = 10d;
    protected String titulo;
    protected String descricao;
    
    public Conteudo() {
    }

    public Conteudo(String titulo, String descricao) {
	this.titulo = titulo;
	this.descricao = descricao;
    }
    
    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
