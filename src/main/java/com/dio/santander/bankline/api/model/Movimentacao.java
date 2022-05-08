package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

public class Movimentacao {
	private Integer id;
	private LocalDateTime dataHora;
	private String descricao;
	private Double valor;
	private MovimentacaoTipo tipo;
	
	public int hashCode() {
		return dataHora.hashCode();
	}
	public boolean equals(Object obj) {
		return dataHora.equals(obj);
	}
	public String toString() {
		return dataHora.toString();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
