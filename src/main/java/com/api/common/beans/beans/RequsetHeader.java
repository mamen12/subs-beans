package com.api.common.beans.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequsetHeader {
	
	@JsonProperty(value = "chanel")
	private String chanel;

	public String getChanel() {
		return chanel;
	}

	public void setChanel(String chanel) {
		this.chanel = chanel;
	}
	
}
