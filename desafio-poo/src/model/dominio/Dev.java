package model.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscristos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    
    public Dev() {
    }

    public Dev(String nome) {
	this.nome = nome;
    }
    
    public void inscreverBootcamp(Bootcamp bootcamp) {
	this.conteudosInscristos.addAll(bootcamp.getConteudos());
	bootcamp.getDevsInscritos().add(this);
    }
    
    public void progredir() {
	
	try {
	    Optional<Conteudo> conteudo = this.conteudosInscristos.stream().findFirst();
	    this.conteudosConcluidos.add(conteudo.get());
	    this.conteudosInscristos.remove(conteudo.get());
	    System.out.println(nome + " concluiu o conteúdo " + conteudo.get());
	    if(!this.conteudosInscristos.stream().findAny().isPresent()) {
		System.out.println(nome + " concluiu o bootcamp!");
	    }
	} catch (RuntimeException e) {
	    new DevException(nome + " não está matriculado(a) em nenhum conteúdo!");
	}
	
    }
    
    public double calcularXPTotal() {
	return this.conteudosConcluidos
		.stream()
		.mapToDouble(conteudosConcluidos -> conteudosConcluidos.calcularXP())
		.sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncristos() {
        return conteudosInscristos;
    }

    public void setConteudosIncristos(Set<Conteudo> conteudosInscristos) {
        this.conteudosInscristos = conteudosInscristos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
	return Objects.hash(conteudosConcluidos, conteudosInscristos, nome);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Dev other = (Dev) obj;
	return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
		&& Objects.equals(conteudosInscristos, other.conteudosInscristos) && Objects.equals(nome, other.nome);
    }

    @Override
    public String toString() {
	return "Dev " + nome + ", conteudosInscristos=" + conteudosInscristos + ", conteudosConcluidos="
		+ conteudosConcluidos + ", XPTotal=" + calcularXPTotal() + "]";
    }
    
    
}
