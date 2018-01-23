package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.models.Cliente;
import spring.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public Cliente autenticar(Cliente cliente) {
		Cliente cli = loginRepository.findByLoginAndSenha(cliente.getLogin(), cliente.getSenha());
		System.out.println(cli.getNome());
		System.out.println(cli.getEmail());
		return cli;
	}
}
