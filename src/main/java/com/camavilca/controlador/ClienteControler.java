package com.camavilca.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.camavilca.repositorio.ClienteRepositorio;

@Controller
@RequestMapping("/cliente")
public class ClienteControler {

	@Autowired
	private ClienteRepositorio c;
	
	@RequestMapping(value="/listar", method = RequestMethod.GET)
	public String Listar(ModelMap mp) {
		mp.put("clientes",c.findAll());
		return "cliente/listar";
	}
}
