package br.com.proj.drogaria.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")//anotação própria do java e não do hibernate
@MappedSuperclass
public class GenericDomain implements Serializable{
	
	@Id//serve para dizer para o código que ele é uma chave primária
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	
	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

}
