package br.com.ipcontas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IpcontasController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/entrar")
    public String entrar() {
        return "entrar";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/")
    public String inicio() {
        return "inicio";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/projetos")
    public String projetos() {
        return "projetos";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/relatorio-custos")
    public String relatorioCustos() {
        return "relatorio-custos";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/cadastro-usuario")
    public String cadastroUsuario() {
        return "/cadastro-usuario";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/relatorio-equipe")
    public String relatorioEquipe() {
        return "relatorio-equipe";
    }
}
