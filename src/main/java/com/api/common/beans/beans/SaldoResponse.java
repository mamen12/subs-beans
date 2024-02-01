package com.api.common.beans.beans;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SaldoResponse {

	@JsonProperty(value = "id_saldo")
	private Long idSaldo;
	
	@JsonProperty(value = "jenis_saldo")
	private String jenis;
	
	@JsonProperty(value = "amount")
	private BigDecimal amount;
	
	

	public SaldoResponse() {
		super();
	}

	public SaldoResponse(Long idSaldo, String jenis, BigDecimal amount) {
		super();
		this.idSaldo = idSaldo;
		this.jenis = jenis;
		this.amount = amount;
	}

	public Long getIdSaldo() {
		return idSaldo;
	}

	public void setIdSaldo(Long idSaldo) {
		this.idSaldo = idSaldo;
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
}
