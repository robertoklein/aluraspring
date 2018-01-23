package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * classe responsável somente por realizar o mapeamento do index.hmtlde forma dinamica
 * serve somente para redirecionar a aplicação para a primeira pagina do sistema
 * @author lasse
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String ifParaHome() {
		return "index";
	}
	
}
