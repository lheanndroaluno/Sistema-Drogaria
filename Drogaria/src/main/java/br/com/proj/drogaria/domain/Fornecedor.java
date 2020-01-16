package br.com.proj.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Fornecedor extends GenericDomain{

	@Column(length = 150, nullable = false)
	private String descricao;

	//métodos getrs e setrs
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
