package br.com.teste.configuration;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.com.teste.service.WSDataService;

@ApplicationPath("/rs")
public class WSConfiguration extends Application{

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public WSConfiguration() {
		singletons.add(new WSDataService());
	}

	public Set<Class<?>> getClasses() {
		return empty;
	}

	public Set<Object> getSingletons() {
		return singletons;
	}

}
