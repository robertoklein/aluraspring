package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.models.Cliente;
import spring.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="autenticar", method=RequestMethod.POST)
	public ResponseEntity<Cliente> autenticar(@RequestBody Cliente cliente) {
		try {
			Cliente cli = loginService.autenticar(cliente);
			return new ResponseEntity<Cliente>(cli,null,HttpStatus.OK);
		}catch (NullPointerException erro) {
			return new ResponseEntity<Cliente>(null,null,HttpStatus.NOT_FOUND);
		}
	}
	
	/*
	@RequestMapping(value="autenticar2", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void autenticar2(@RequestBody Cliente cliente) {
		
		if(cliente.getLogin().equals("roberto") && cliente.getSenha().equals("123") ) {
			System.out.println("cliente autenticado");
		}else {
			throw new RuntimeException("nao encontrou");
		}
	}
	*/
}
