package com.api.common.beans.beans;

import java.util.Date;

import com.api.common.beans.constant.AppConstants;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GroupResponse {

	
	@JsonProperty(value = "id_group")
	private Long id;
	
	@JsonProperty(value = "nama_group")
	private String nama;
	
	@JsonProperty(value = "tgl_join")
	@JsonFormat(shape = Shape.STRING ,pattern = AppConstants.FORMAT_DD_MM_YYYY, locale = "in_ID")
	private Date tanggalJoin;
	

	public GroupResponse() {
		super();
	}

	public GroupResponse(Long id, String nama, Date tanggalJoin) {
		super();
		this.id = id;
		this.nama = nama;
		this.tanggalJoin = tanggalJoin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Date getTanggalJoin() {
		return tanggalJoin;
	}

	public void setTanggalJoin(Date tanggalJoin) {
		this.tanggalJoin = tanggalJoin;
	}
	
	
}
