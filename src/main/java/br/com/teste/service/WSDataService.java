package br.com.teste.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.teste.dao.PessoaDAO;
import br.com.teste.domain.Pessoa;

@Path("/cadastro")
public class WSDataService {
	
	PessoaDAO pDAO = new PessoaDAO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/consulta")
	public List<Pessoa> obterCadastros(){
		return pDAO.buscarCadastroPessoa();
	}

}
