package br.com.teste.util;

import java.util.List;

import com.google.gson.Gson;


public class Converter {
	
	public static String converterObjToJson(Object obj){
		
		Gson gson = new Gson();
		return gson.toJson(obj);
		
	}
	
	public static <T> String convertArrayToJson(List<T> lista){
		
		Gson gson = new Gson();
		return gson.toJson(lista);
	}
	
	public static <T> Object converterJsonToObject(String json){
		Gson gson = new Gson();
		return gson.fromJson(json, Object.class);
	}

}
