package com.api.common.beans.beans;

import java.util.Date;

import com.api.common.beans.constant.AppConstants;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GroupRequest {
	
	@JsonProperty(value = "id_group")
	private long id;

	@JsonProperty(value = "name")
	private String nama;
	
	@JsonProperty(value = "tanggal_join")
	@JsonFormat(shape = Shape.STRING ,pattern = AppConstants.FORMAT_DD_MM_YYYY, locale = "in_ID")
	private Date tglJoin;

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Date getTglJoin() {
		return tglJoin;
	}

	public void setTglJoin(Date tglJoin) {
		this.tglJoin = tglJoin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
