package com.api.common.beans.constant.utils;


public final class UrlFormatter {
	
	private UrlFormatter() {}
	
	public static String formatUrl(String protocol, String host, String port, String path) {
		return String.format("%s://%s:%s%s", protocol, host, port,path);
	}
	
	
}
