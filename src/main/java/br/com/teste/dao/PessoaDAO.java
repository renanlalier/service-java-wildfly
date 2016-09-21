package br.com.teste.dao;

import java.util.List;

import br.com.teste.domain.Pessoa;

public class PessoaDAO {
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> buscarCadastroPessoa(){
		return Connection.getConnection().createNativeQuery("select * from pessoa").getResultList();
	}
	
}
